Select c.name As Customers
From Customers c
Left JOIN Orders o
On c.id = o.customerId
Where o.customerId is NULL
