@echo *** TEST GRADING ***
@pause
del *.class
javac Mock.java
javac C1.java
java -ea Mock
pause
