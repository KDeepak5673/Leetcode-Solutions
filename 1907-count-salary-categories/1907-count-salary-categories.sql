# Write your MySQL query statement below
SELECT "Low Salary" AS category, Count(*) AS accounts_count
FROM Accounts
WHERE income < 20000
UNION
SELECT "Average Salary" AS category,Count(*) AS accounts_count
FROM Accounts
WHERE income BETWEEN 20000 AND 50000
UNION
SELECT "High Salary" AS category,Count(*) AS accounts_count
FROM Accounts
WHERE income > 50000