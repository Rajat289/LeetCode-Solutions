Select user_id , max(time_stamp) AS last_stamp
From Logins
Where Year(time_stamp) = 2020  # where time_stamp like '2020%'
group by user_id
