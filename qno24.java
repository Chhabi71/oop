package workshops4;

import java.util.Scanner;

public class qno24 {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.println("Program starts.");

     try {
         System.out.print("Enter first integer: ");
         int num1 = sc.nextInt();

         System.out.print("Enter second integer: ");
         int num2 = sc.nextInt();

         int result = num1 / num2;
         System.out.println("Result: " + result);

     } catch (ArithmeticException e) {
         System.out.println("Error: Cannot divide by zero.");

     } catch (java.util.InputMismatchException e) {
         System.out.println("Error: Invalid input! Please enter integers only.");

     } finally {
         sc.close();
         System.out.println("Scanner closed.");
     }

     System.out.println("Program continues to execute further statements safely.");
 }
}
