package workshops4;

import java.util.Scanner;

class NegativeNumberException extends Exception {
 public NegativeNumberException(String msg) {
     super(msg);
 }
}

class ZeroValueException extends Exception {
 public ZeroValueException(String msg) {
     super(msg);
 }
}

public class qno23 {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a number: ");
     int num = sc.nextInt();

     try {
         checkNumber(num);
         System.out.println("Valid number entered: " + num);
     } catch (NegativeNumberException e) {
         System.out.println("Caught NegativeNumberException: " + e.getMessage());
     } catch (ZeroValueException e) {
         System.out.println("Caught ZeroValueException: " + e.getMessage());
     }

     sc.close();
     System.out.println("Program completed.");
 }

 public static void checkNumber(int n) throws NegativeNumberException, ZeroValueException {
     if (n < 0) {
         throw new NegativeNumberException("Number cannot be negative: " + n);
     } else if (n == 0) {
         throw new ZeroValueException("Number cannot be zero.");
     }
 }
}
