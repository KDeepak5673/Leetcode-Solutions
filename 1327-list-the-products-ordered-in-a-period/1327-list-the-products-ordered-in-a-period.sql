# Write your MySQL query statement below
SELECT p.product_name , SUM(o.unit) AS unit
FROM Products p
JOIN Orders o
USING(product_id)
WHERE MONTH(o.order_date) = "2" AND YEAR(o.order_date) = "2020" 
GROUP BY o.product_id
HAVING SUM(o.unit) >= 100