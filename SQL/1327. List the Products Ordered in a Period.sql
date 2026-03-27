SELECT p.product_name , sum(o.unit) AS unit  
FROM Products p
LEFT JOIN Orders o
ON p.product_id = o.product_id
WHERE YEAR(o.order_date) = '2020' AND MONTH(o.order_date) = '02'
GROUP BY o.product_id
HAVING SUM(o.unit)>=100
