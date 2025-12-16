package workshops4;

public class qno7{

 public static void main(String[] args) {

     try {
         int a = 10;
         int b = 0;

         // ArithmeticException
         int result = a / b;

         // ArrayIndexOutOfBoundsException
         int[] arr = {1, 2, 3};
         System.out.println(arr[5]);

         // NullPointerException
         String s = null;
         System.out.println(s.length());

     } catch (ArithmeticException e) {
         System.out.println("Caught ArithmeticException: " + e.getMessage());

     } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());

     } catch (NullPointerException e) {
         System.out.println("Caught NullPointerException: " + e.getMessage());

     } catch (Exception e) {
         System.out.println("Caught General Exception: " + e.getMessage());
     }

     System.out.println("Program continues...");
 }
}
