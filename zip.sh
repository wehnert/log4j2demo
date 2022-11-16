#!/bin/bash
cd build/reports/tests/test
zip -r report.zip .
mv report.zip ../../../../
cd ../../../../
timestamp=$(date "+%Y-%m-%d_%H-%M-%S")
file=$(cat config.properties | grep filename | sed s/'filename\|=\|\"\| '//g)
echo Filename is $file
mv report.zip "$file"_"$timestamp.zip"
