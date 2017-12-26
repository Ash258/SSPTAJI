#!/bin/bash
x=$(wc -l cosi.txt | awk '{print $1}')
echo "Počet řádku: $x"
