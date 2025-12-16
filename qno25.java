package workshops4;

import java.io.*;

class NegativeNumberException extends Exception {
 public NegativeNumberException(String msg) {
     super(msg);
 }
}

public class qno25 {

 public static void main(String[] args) {

     System.out.println("Demonstrating throw:");
     try {
         throwExample(-5);  
     } catch (NegativeNumberException e) {
         System.out.println("Caught exception: " + e.getMessage());
     }

     System.out.println("\nDemonstrating throws:");
     try {
         throwsExample(); 
     } catch (IOException e) {
         System.out.println("Caught exception: " + e.getMessage());
     }

     System.out.println("\nProgram continues...");
 }

 public static void throwExample(int num) throws NegativeNumberException {
     if (num < 0) {
         throw new NegativeNumberException("Negative number not allowed: " + num);
     }
     System.out.println("Number is valid: " + num);
 }

 public static void throwsExample() throws IOException {
     FileReader fr = new FileReader("nonexistent_file.txt"); 
     fr.close();
 }
}
