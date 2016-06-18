#!/bin/sh

java -jar ./javacc-6.0/bin/lib/javacc.jar ./DroidParser.jj
javac *.java
clear
java DroidParser
