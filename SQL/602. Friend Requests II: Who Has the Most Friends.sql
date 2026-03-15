With base as(select requester_id id from RequestAccepted
Union all
Select accepter_id id from RequestAccepted)

Select id, count(*) num  from base group by 1 order by 2 desc limit 1
