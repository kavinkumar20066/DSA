# Write your MySQL query statement below
select d.name as "Department" , e.name as "Employee" ,  e.Salary  from 
employee e
left join 
department d
on e.departmentId=d.id
where e.salary=(select max(salary) from employee e
where e.departmentId=d.id
);