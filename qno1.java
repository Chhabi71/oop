package workshops4;

public class qno1 {

 public static void main(String[] args) {

     try {
         System.out.println("Attempting to divide by zero...");
         int result = 10 / 0;
         System.out.println("Result: " + result);
     } catch (Exception e) {
         System.out.println("Caught an Exception:");
         System.out.println(e);
     }

     try {
         System.out.println("\nAttempting to cause a StackOverflowError...");
         causeStackOverflow(); 
     } catch (Error err) {
         System.out.println("Caught an Error:");
         System.out.println(err);
     }

     System.out.println("\nProgram continues after handling Exception and Error.");
 }

 public static void causeStackOverflow() {
     causeStackOverflow();
 }
}
