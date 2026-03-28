# Write your MySQL query statement below
SELECT e.employee_id
FROM Employees e
left JOIN Salaries s ON e.employee_id = s.employee_id
WHERE s.employee_id IS NULL

union

SELECT s.employee_id
FROM Salaries s
left JOIN Employees e ON e.employee_id = s.employee_id
WHERE e.employee_id IS NULL

order by employee_id
