SELECT *
FROM Cinema
WHERE id % 2 != 0
  AND description != 'boring'
  Order By id DESC;
  ;
