package Techday27exceptions2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
-When we use "throws" in the method name line, it means we are telling to Java "Hey Java if you need help let me know"
-After "throws" keyword in the method name line, you can use multiple Exception Classes like;
throws IOException,ArithmeticException,...
What is the difference between, "throws" and "throw" keywords
  -"throws" can be used in the method name line, "throw" can be used in the method body
  -After "throws" you can use multiple Exception Class Names
    After "throw" you can use "new" keyword and Constuctor of the Exception Class
    "throws" keyword used to handle "Checked Exception", "throw" keyword is used to throw exception whenever and wherever we want
 What is the meanings of "final",1finally", and "finalize" keywords ?==>
 */

public class Excep08 {
    public static void main(String[] args) throws IOException, ArithmeticException, NumberFormatException, ArrayIndexOutOfBoundsException, IllegalAccessException {
        FileInputStream fis = new FileInputStream("src/Techday27exceptions2/File01.txt");//Go and find the File (done)

        int k = 0;
        while ((k = fis.read()) != -1) {
            System.out.print((char) k);
        }
        System.out.println("===============");
        printTheAge(-12);
    }

    public static void printTheAge(int age) throws IllegalAccessException {

        if (age >= 0) {
            System.out.println(age);
        } else {
            throw new IllegalAccessException("Ages cannot be negative");
        }
    }

}
