#!/bin/bash
for file in *.html;do 
mv $file ${file%.html}
done
