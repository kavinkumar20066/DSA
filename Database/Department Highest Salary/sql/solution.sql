select Department , Employee , Salary from
(select  
    e.name as 'Department',
    d.name as 'Employee',
    e.salary as 'salary', 
    rank() over(partition by d.name order by e.salary DESC) as rnk
    from Employee e
    Inner join 
    department d
    on e.departmentId=d.id
)t
where rnk=1
   