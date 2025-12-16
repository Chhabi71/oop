package workshops4;

import java.util.Scanner;

class NegativeNumberException extends Exception {
 public NegativeNumberException(String msg) {
     super(msg);
 }
}

public class qno17 {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     try {
         int a = 10 / 0; 
     } catch (ArithmeticException e) {
         System.out.println("Caught Unchecked Exception: " + e);
     }

     System.out.print("Enter a positive number: ");
     int num = sc.nextInt();

     try {
         checkPositive(num); 
         System.out.println("Valid number: " + num);
     } catch (NegativeNumberException e) {
         System.out.println("Caught Checked Exception: " + e.getMessage());
     }

     sc.close();
     System.out.println("Program finished.");
 }

 public static void checkPositive(int n) throws NegativeNumberException {
     if (n < 0) {
         throw new NegativeNumberException("Negative number not allowed: " + n);
     }
 }
}
