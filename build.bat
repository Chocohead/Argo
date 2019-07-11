@echo off

echo *** Finding sources to compile...
if exist sources.txt del sources.txt
dir /s /B src\main\*.java > sources.txt

echo *** Cleaning bin folder...
if exist bin rmdir /S /Q bin
mkdir bin

echo *** Compiling Argo class files...
javac -source 1.6 -target 1.6 -d bin @sources.txt

echo *** Packing Argo.jar...
cd bin
jar cvf Argo.jar .
cd ..

echo *** Build complete!
pause
