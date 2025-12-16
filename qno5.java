package workshops4;

import java.io.*;

public class qno5 {

 public static void main(String[] args) {

     System.out.println("=== Unchecked Exceptions ===");
     uncheckedArithmetic();
     uncheckedNullPointer();

     System.out.println("\n=== Checked Exception ===");
     checkedIOException();

     System.out.println("\nDone.");
 }
 public static void uncheckedArithmetic() {
     try {
         int a = 10 / 0;  
     } catch (ArithmeticException e) {
         System.out.println("Caught: " + e);
     }
 }

 public static void uncheckedNullPointer() {
     try {
         String s = null;
         s.length(); 
     } catch (NullPointerException e) {
         System.out.println("Caught: " + e);
     }
 }

 public static void checkedIOException() {
     try {
         FileReader fr = new FileReader("no_file.txt"); 
     } catch (IOException e) {
         System.out.println("Caught: " + e);
     }
 }
}
