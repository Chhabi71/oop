package workshops4;

import java.util.Scanner;

class InvalidAgeException extends Exception {
 public InvalidAgeException(String msg) {
     super(msg);
 }
}

public class qno18 {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     System.out.print("Enter your age: ");

     int age = sc.nextInt();

     try {
         checkAge(age);
         System.out.println("You are eligible.");
     } catch (InvalidAgeException e) {
         System.out.println("Exception caught: " + e.getMessage());
     }

     sc.close();
     System.out.println("Program continues...");
 }

 public static void checkAge(int age) throws InvalidAgeException {
     if (age < 18) {
         throw new InvalidAgeException("Age must be 18 or above. Entered age: " + age);
     }
 }
}
