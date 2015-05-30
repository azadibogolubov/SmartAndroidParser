#!/bin/sh

javacc DroidParser.jj
javac *.java
clear
java DroidParser
