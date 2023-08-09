javac -sourcepath ./src -d build/classes -cp ./libs/commons-lang3-3.12.0-tests.jar ./src/ua/com/alevel/Hello.java
cd libs
jar xf commons-lang3-3.12.0-tests.jar
cp -rf ./org ../build/classes
cd ../
jar cvfm build/jar/Goodbye.jar resources/MANIFEST.MF -C build/classes .
java -jar build/jar/Goodbye.jar