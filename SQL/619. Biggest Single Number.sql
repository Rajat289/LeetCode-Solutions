Select MAX(num) AS num
FROM MyNumbers WHERE num IN  (SELECT num 
    FROM MyNumbers
    GROUP BY num
    Having COUNT(num) = 1)
