USE telefony;
SELECT DISTINCT city
FROM (SELECT telefony_domacnosti_mesto AS city
      FROM telefony_domacnosti
      UNION SELECT telefony_firmy_mesto AS city
            FROM telefony_firmy) AS t1