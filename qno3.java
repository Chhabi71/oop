package workshops4;
//ExceptionHierarchyDemo.java

/*
Throwable
├─ Error                 (serious problems)
└─ Exception
     ├─ RuntimeException (unchecked)
     └─ Other Exceptions (checked)
*/

import java.io.*;

public class qno3 {

 public static void main(String[] args) {

     System.out.println("=== Unchecked Exceptions ===");
     arithmeticEx();
     nullPointerEx();
     arrayIndexEx();

     System.out.println("\n=== Checked Exception ===");
     checkedIOException();

     System.out.println("\n=== Error Example ===");
     errorExample();

     System.out.println("\nProgram finished.");
 }

 // ArithmeticException (Runtime / Unchecked)
 public static void arithmeticEx() {
     try {
         int x = 10 / 0;
     } catch (ArithmeticException e) {
         System.out.println("Caught: " + e);
     }
 }

 // NullPointerException (Runtime / Unchecked)
 public static void nullPointerEx() {
     try {
         String s = null;
         s.length();
     } catch (NullPointerException e) {
         System.out.println("Caught: " + e);
     }
 }

 // ArrayIndexOutOfBoundsException (Runtime / Unchecked)
 public static void arrayIndexEx() {
     try {
         int[] arr = {1, 2, 3};
         System.out.println(arr[5]);
     } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Caught: " + e);
     }
 }

 // IOException (Checked Exception)
 public static void checkedIOException() {
     try {
         FileReader fr = new FileReader("no_file.txt");
     } catch (IOException e) {
         System.out.println("Caught: " + e);
     }
 }

 // StackOverflowError (Error)
 public static void errorExample() {
     try {
         recursive();
     } catch (Error err) {
         System.out.println("Caught: " + err);
     }
 }

 // Causes StackOverflowError
 public static void recursive() {
     recursive();
 }
}
