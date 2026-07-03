# Write your MySQL query statement below
select DISTINCT MAX(salary) as SecondHighestSalary from Employee 
where salary < (select MAX(salary) from Employee);