select e.name as 'Employee' from employee e
INNER JOIN
employee e2
on e.managerId=e2.id
where e.salary>e2.salary
;