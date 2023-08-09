javac -sourcepath ./src -d build/classes -cp ./libs/commons-lang3-3.12.0-tests.jar ./src/ua/com/alevel/Goodbye.java
jar cvfm build/jar/Goodbye.jar resources/MANIFEST.MF -C build/classes .
java -jar build/jar/Goodbye.jar