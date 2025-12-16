package workshops4;
//FinallyDemo.java

public class qno11 {

 public static void main(String[] args) {

     try {
         System.out.println("Inside try block.");
         int result = 10 / 0; 
         System.out.println("Result: " + result);

     } catch (ArithmeticException e) {
         System.out.println("Caught exception: " + e);

     } finally {
         System.out.println("Finally block executed.");
     }

     System.out.println("Program continues...");
 }
}
