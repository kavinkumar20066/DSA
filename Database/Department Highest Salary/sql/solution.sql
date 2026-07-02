# Write your MySQL query statement below
select d.name as department , e.name as Employee , max(e.salary) as Salary
from Employee e
left join 
department d
on d.id=e.departmentId 
group by(e.name)
ORDER BY e.salary DESC 

LIMIT 3;
