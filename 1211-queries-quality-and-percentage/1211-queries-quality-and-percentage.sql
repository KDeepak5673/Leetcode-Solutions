# Write your MySQL query statement below
SELECT query_name , ROUND( AVG(rating/position) , 2) AS quality ,ROUND(SUM(case when rating < 3 then 1 else 0 end)*100 / COUNT(*) , 2) poor_query_percentage
FROM Queries 
GROUP BY query_name