SELECT product_id , year AS first_year , quantity ,price 
FROM Sales
WHERE (product_id , year) in (
    SELECT product_id , min(year)
    from Sales
    GROUP By product_id 
