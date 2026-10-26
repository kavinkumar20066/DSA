SELECT
    max(Salary) SecondHighestSalary 
FROM
    Employee
where 
    salary < (SELECT
                max(Salary)
            FROM
                Employee)