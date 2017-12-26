use telefony;
SELECT telefony_domacnosti_mesto, COUNT(*) AS count FROM telefony_domacnosti GROUP BY telefony_domacnosti_mesto;