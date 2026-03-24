Select p.product_id , p.product_name
From Product p
left outer join Sales s
on p.product_id = s.product_id
group by p.product_id
having MIN(sale_date)>= '2019-01-01' AND MAX(sale_date)<='2019-03-31'
