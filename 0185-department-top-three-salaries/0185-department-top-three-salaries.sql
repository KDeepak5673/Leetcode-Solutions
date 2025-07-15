# Write your MySQL query statement below
SELECT Department , Employee , Salary 
FROM (
    SELECT Department , Employee , Salary , DENSE_RANK() OVER (PARTITION BY Department ORDER BY Salary DESC) AS 'RANK'
    FROM (
        SELECT e.name as Employee, e.salary AS Salary , d.name as Department
        FROM Employee e JOIN Department d
        ON e.departmentId = d.id
    )AS temp
)AS upd_tab

WHERE `Rank` < 4