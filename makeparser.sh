#!/bin/sh

./javacc/bin/javacc -LOOKAHEAD:2 DroidParser.jj
javac DroidParser.java
java DroidParser testFile outputfile.xml
