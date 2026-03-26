Select p.product_id , 
ROUND(COALESCE(SUM(p.price * u.units) / NULLIF(SUM(u.units) , 0), 0), 2) AS average_price
From Prices p # NULLIF 0 asel tr 0 throw karel COALESCE doni 0 asel tr 0 throw karel
LEFT JOIN UnitsSold u
ON p.product_id = u.product_id AND u.purchase_date BETWEEN p.start_date AND p.end_date
GROUP BY p.product_id
