# Write your MySQL query statement below
select score ,
rank() over (order by score DESC) as 'rank'
from Scores
order by score DESC 
;
