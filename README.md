# CoreJavaDay5
1. Handling a checked exception by opening a file 

Write a  code opens a text file and writes its content to the standard output. What happens if the file doesn’t exist? 

 

2.Java has built-in mechanism to handle exceptions. Using the try statement we can test a block of code for errors. The catch block contains the code that says what to do if exception occurs.  

This problem will test your knowledge on try-catch block. 

You will be given two integers and as input, you have to compute . If and are not bit signed integers or if is zero, exception will occur and you have to report it. Read sample Input/Output to know what to report in case of exceptions. 

Sample Input : 

10 

3 

Sample Output : 

3 

Sample Input : 

10 

Hello 

Sample Output : 

java.util.InputMismatchException 

Sample Input : 

10 

0 

Sample Output : 

java.lang.ArithmeticException: / by zero 

Sample Input : 

23.323 

0 

Sample Output : 

java.util.InputMismatchException 

 

 

3. You are required to compute the power of a number by implementing a calculator. Create a class MyCalculator which consists of a single method long power(int, int). This method takes two integers, and , as parameters and finds . If either or is negative, then the method must throw an exception which says "". Also, if both and are zero, then the method must throw an exception which says "" 

For example, -4 and -5 would result in . 

Complete the function power in class MyCalculator and return the appropriate result after the power operation or an appropriate exception as detailed above.  

Sample Input:  

3 5 

2 4 

0 0 

-1 -2 

-1 3 

Sample Output:     

243 

16 

java.lang.Exception: n and p should not be zero. 

java.lang.Exception: n or p should not be negative. 

java.lang.Exception: n or p should not be negative. 

 

4. Write a program to get the name and age of the player from the user and  display it.  

player name is a string  

player age is an integer value  

Note : The player is eligible to participate in IPL when their age is 19 and above  

  This program may generate    

1. InvalidAgeRange Custom Exception when the player's age is below 19  

 Use exception handling mechanisms to handle these exceptions  

 

 Create a class called CustomException which extends Exception and it includes constructor to initialize the message.  

  

 Use appropriate exception handling mechanisms to handle these exceptions   

Sample  Input/Output 1: 

Enter the player name 

Albie Morkel 

Enter the player age 

35 

Player name : Albie Morkel 

Player age : 35 

  

Sample  Input/Output 2: 

Enter the player name 

Ishan Kishan 

Enter the player age 

16 

CustomException: InvalidAgeRangeException 

5. Given total runs scored and  total overs faced as the input. Write a program to calculate the run rate with the formula, 

Run rate= total runs scored/total overs faced. 

Use BufferedReader class to get the inputs from user. 

 This program may generate Arithmetic Exception / NumberFormatException. Use exception handling mechanisms to handle this exception. Use a single catch block. In the catch block, print the class name of the exception thrown. 

Sample Input and Output 1: 

Enter the total runs scored 

79 

Enter the total overs faced 

14 

Current Run Rate : 5.64  

Sample Input and Output 2: 

Enter the total runs scored 

50 

Enter the total overs faced 

 0 

java.lang.ArithmeticException 

Sample Input and Output 3: 

Enter the total runs scored 

a 

java.lang.NumberFormatException 
