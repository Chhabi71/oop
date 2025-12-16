package workshops4;

public class qno16 {

 public static void main(String[] args) {
     try {
         process();
     } catch (ArithmeticException e) {
         System.out.println("Exception caught in main: " + e.getMessage());
     }

     System.out.println("Program continues...");
 }

 public static void process() throws ArithmeticException {
     try {
         int a = 10 / 0;
     } catch (ArithmeticException e) {
         System.out.println("Exception caught in process, rethrowing...");
         throw e; 
     }
 }
}
