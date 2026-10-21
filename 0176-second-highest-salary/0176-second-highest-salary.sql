SELECT (
    SELECT salary
    FROM (
        SELECT salary,
               ROW_NUMBER() OVER (
                   ORDER BY salary DESC
               ) AS rn
        FROM (
            SELECT DISTINCT salary
            FROM Employee
        ) AS unique_salaries
    ) AS ranked
    WHERE rn = 2
) AS "SecondHighestSalary";