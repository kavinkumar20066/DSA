max(change_date) over(partition by product_id) mt
 from 
(select * from products where change_date<='2019-08-16')t)t
where
    change_date = mt)

union

(
    select product_id,10 from(select
    *
    from
    (select
        product_id,
        new_price,
        change_date,
        row_number() over(partition by product_id order by change_date) rno 
    from 
        Products)t
    where change_date>'2019-08-16' and rno =1)t
    new_price price
from
(select *,
(select 
    product_id,
