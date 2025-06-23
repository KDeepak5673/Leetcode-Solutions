# Write your MySQL query statement below
SELECT EN.unique_id, E.name
FROM Employees AS E
LEFT JOIN EmployeeUNI AS EN
ON E.id = EN.id;