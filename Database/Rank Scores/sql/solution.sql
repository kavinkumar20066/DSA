# Write your MySQL query statement below
select score ,
Dense_rank() over (order by score DESC) as 'rank'
from Scores
order by score DESC 
;