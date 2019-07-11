#!/bin/sh

echo *** Finding sources to compile...
if [ -f sources.txt]
then
	rm sources.txt
fi
find ./src/main -type f -name "*.java" > sources.txt

echo "*** Cleaning bin folder..."
if [ -e bin ]
then
  rm -rf bin
fi
mkdir bin

echo "*** Compiling Argo class files..."
javac -source 1.6 -target 1.6 -d bin @sources.txt

echo "*** Packing Argo.jar..."
cd bin
jar cvf Argo.jar .
cd ..

echo "*** Build complete!"
