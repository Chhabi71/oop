package workshops4;

public class qno12 {

 public static void main(String[] args) {
     System.out.println("Result from tryReturn(): " + tryReturn());
     System.out.println("Result from catchReturn(): " + catchReturn());
 }


 public static int tryReturn() {
     try {
         System.out.println("Inside try block.");
         return 10;
     } finally {
         System.out.println("Finally block executed after try return.");
     }
 }

 public static int catchReturn() {
     try {
         System.out.println("\nInside try block, causing exception.");
         int result = 10 / 0; 
         return result;
     } catch (ArithmeticException e) {
         System.out.println("Inside catch block.");
         return -1;
     } finally {
         System.out.println("Finally block executed after catch return.");
     }
 }
}
