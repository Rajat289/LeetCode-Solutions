SELECT user_id,CONCAT(
    UPPER(SUBSTR(name,1, 1)),
    LOWER(SUBSTRING(name, 2,length(name)))) AS name

from Users 
order by user_id
