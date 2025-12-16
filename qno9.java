package workshops4;

import java.util.Scanner;

public class qno9 {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     System.out.print("Enter your age: ");

     try {
         int age = sc.nextInt();

         // Manually throw exception if input is invalid
         if (age < 0 || age > 120) {
             throw new IllegalArgumentException("Invalid age: " + age);
         }

         System.out.println("Your age is: " + age);

     } catch (IllegalArgumentException e) {
         System.out.println("Exception caught: " + e.getMessage());

     } catch (Exception e) {
         System.out.println("Invalid input! Please enter an integer.");
     }

     sc.close();
     System.out.println("Program continues...");
 }
}
