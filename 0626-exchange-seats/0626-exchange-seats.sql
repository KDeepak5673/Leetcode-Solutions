# Write your MySQL query statement below
SELECT CASE WHEN id % 2 = 1 AND id+1 IN (SELECT id FROM SEAT) THEN id +1 
        WHEN id % 2 = 0 then id-1
        else id
    end as id , student
FROM Seat
order by id