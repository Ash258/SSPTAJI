use telefony;
SELECT telefony_firmy_nazev, telefony_firmy_ico, telefony_firmy_telefon FROM telefony_firmy
WHERE telefony_firmy_mesto NOT IN (SELECT telefony_domacnosti_mesto FROM telefony_domacnosti)