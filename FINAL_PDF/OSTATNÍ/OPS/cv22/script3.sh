#!/bin/bash
if(grep -i  cosi cosi.txt>/dev/null || grep -i poiuoi name.txt>/dev/null)
then echo "je \"cosi\" nebo \"poiuoi\""
else echo "Neobsahuje slovo \"cosi\" nebo \"poiuoi\""
fi
