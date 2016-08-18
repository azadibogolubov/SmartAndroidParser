#!/bin/sh

./javacc/bin/javacc DroidParser.jj
javac DroidParser.java

echo "What is the input file? "
read fileName

java DroidParser testFiles/$fileName outFile
