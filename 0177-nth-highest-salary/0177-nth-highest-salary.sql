
CREATE OR REPLACE FUNCTION NthHighestSalary(N INT)
RETURNS TABLE (Salary INT) AS $$
BEGIN
    RETURN QUERY (
       SELECT ranked.salary
       FROM (
        SELECT s.salary,
       ROW_NUMBER() OVER(
        ORDER BY s.salary DESC
       )AS rn
       FROM( 
        SELECT DISTINCT e.salary
       FROM Employee e
       )AS s 
     )AS ranked
    WHERE ranked.rn = N
    );
END;
$$ LANGUAGE plpgsql;
