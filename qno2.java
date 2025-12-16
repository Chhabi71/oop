package workshops4;
public class qno2 {

 public static void main(String[] args) {

     try {
         int a = 10;
         int b = 0;

         System.out.println("Dividing " + a + " by " + b + "...");
         int result = a / b; 

         System.out.println("Result: " + result);

     } catch (ArithmeticException e) {
         System.out.println("ArithmeticException caught:");
         System.out.println("You cannot divide a number by zero!");
         System.out.println("Error message: " + e.getMessage());
     }

     System.out.println("Program continues normally...");
 }
}
