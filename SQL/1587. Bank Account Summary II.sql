Select u.name , SUM(t.amount) AS balance
From Users u
left join Transactions t
on u.account=t.account 
Group by u.account
having sum(t.amount)>10000;
