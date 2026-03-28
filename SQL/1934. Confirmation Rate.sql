# Write your MySQL query statement below
SELECT s.user_id , 
CASE WHEN c.time_stamp IS NULL then 0.00
else ROUND(SUM(c.action = 'confirmed')/COUNT(c.action),2) END AS confirmation_rate
FROM Signups s
LEFT JOIN Confirmations c
On s.user_id = c.user_id
Group BY s.user_id
