# Write your MySQL query statement below
select name as 'Customers' from 
customers c
LEFT JOIN 
orders c1
on c.id=c1.customerId
where c1.customerId is null;
;


