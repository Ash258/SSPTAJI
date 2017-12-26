USE telefony;
SELECT DISTINCT telefony_firmy_mesto AS city FROM telefony_firmy
UNION
  SELECT telefony_domacnosti_mesto AS city FROM telefony_domacnosti