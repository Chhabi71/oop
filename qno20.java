package workshops4;
//ExceptionChainingDemo.java

public class qno20 {

 public static void main(String[] args) {

     try {
         methodA();
     } catch (Exception e) {
         System.out.println("Exception caught in main:");
         e.printStackTrace(); 
     }

     System.out.println("Program continues...");
 }

 public static void methodA() throws Exception {
     try {
         methodB();
     } catch (Exception e) {
         throw new Exception("Exception in methodA", e);
     }
 }

 public static void methodB() throws Exception {
     try {
         int result = 10 / 0; 
     } catch (ArithmeticException e) {
         throw new Exception("Exception in methodB", e);
     }
 }
}
