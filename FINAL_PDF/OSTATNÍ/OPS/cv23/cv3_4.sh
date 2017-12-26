#!/bin/bash
echo -n "Zadejte uzivatele: "
read uzivatel
until who | grep $uzivatel > /dev/null; do
sleep 1
done

echo "***Uživatel se právě přihlásil. $uzivatel***"
