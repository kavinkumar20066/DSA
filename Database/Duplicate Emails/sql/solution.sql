SELECT
    email Email
FROM
    Person
GROUP BY email
    Having count(*)>1;