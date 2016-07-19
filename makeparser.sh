#!/bin/sh

./javacc/bin/javacc DroidParser.jj
javac DroidParser.java
java DroidParser testFile outputfile.xml
