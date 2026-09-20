# Write your MySQL query statement below
select department,employee,salary from 
(select e.name department ,d.name employee,rank() over(partition by d.id order by salary desc) rnk,salary from employee e left join department d on e.departmentid=d.id )t 
where rnk=1