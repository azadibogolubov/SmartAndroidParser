#!/bin/sh

./javacc/bin/javacc DroidParser.jj
javac DroidParser.java
java DroidParser testFile6 ~/Desktop/compass/Demo/app/src/main/res/layout/activity_main.xml
