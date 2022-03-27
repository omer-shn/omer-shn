package Classes;

import Techday24ObjectManipulations.Person;

import java.util.Scanner;

public class As {
   public static void main(String[] args) {


      int a = 10;
      int b = 0;

      try {
         System.out.println(a / b);
      } catch (
              ArithmeticException e) {
         System.out.println("Dont use 0 in the division operation");
      }
      System.out.println("Operation completed");

   }
}



