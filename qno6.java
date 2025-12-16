package workshops4;

import java.util.*;

@SuppressWarnings("serial")
class NegativeNumberExceptions extends Exception {
 public NegativeNumberExceptions(String msg) {
     super(msg);
 }
}

public class qno6 {

 @SuppressWarnings("resource")
public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     System.out.print("Enter an integer: ");

     try {
         int num = sc.nextInt();

         if (num < 0) {
             throw new NegativeNumberException("Negative number not allowed: " + num);
         }

         System.out.println("Valid number: " + num);

     } catch (NegativeNumberException e) {
         System.out.println("Custom Exception Caught: " + e.getMessage());
     } catch (Exception e) {
         System.out.println("Invalid input!");
     }

     sc.close();
 }
}
