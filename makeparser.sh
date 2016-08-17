#!/bin/sh

./javacc/bin/javacc DroidParser.jj
javac DroidParser.java

echo "What is the input file? "
read fileName

echo "What is the default output file? "
read outputFile

java DroidParser $fileName $outputFile