package workshops4;
//UserInputExceptionDemo.java

import java.util.Scanner;

public class qno19 {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     int number = 0;

     try {
         System.out.print("Enter an integer: ");
         number = sc.nextInt(); 

         System.out.println("You entered: " + number);

     } catch (java.util.InputMismatchException e) {
         System.out.println("Invalid input! Please enter a valid integer.");

     } finally {
         sc.close(); 
         System.out.println("Scanner closed.");
     }

     System.out.println("Program continues...");
 }
}

