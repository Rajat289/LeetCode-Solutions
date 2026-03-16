SELECT id, 
    CASE 
        WHEN p_id IS NULL THEN 'Root'
        WHEN p_id IN (SELECT p_id FROM Tree) and id in (select p_id from tree)THEN 'Inner'
        ELSE 'Leaf'
        END AS type
FROM Tree
