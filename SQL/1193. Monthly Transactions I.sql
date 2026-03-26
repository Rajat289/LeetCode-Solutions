select date_format(trans_date,'%Y-%m') AS month , 
country , 
count(id)as trans_count , 
sum(CASE WHEN state = 'approved' THEN 1 ELSE 0 END) AS approved_count,
sum(amount) AS trans_total_amount,
sum(CASE WHEN state = 'approved' THEN amount ELSE 0 END)AS approved_total_amount 
from Transactions
group by date_format(trans_date,'%Y-%m') , country
