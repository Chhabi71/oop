package workshops4;
//MultipleExceptionDemo.java

public class qno4 {

 public static void main(String[] args) {

     try {
         int a = 10 / 0;

         int[] arr = {1, 2, 3};
         System.out.println(arr[5]);

         String s = null;
         System.out.println(s.length());

     } catch (ArithmeticException e) {
         System.out.println("Caught ArithmeticException: " + e.getMessage());
     } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
     } catch (NullPointerException e) {
         System.out.println("Caught NullPointerException: " + e.getMessage());
     }

     System.out.println("Program continues...");
 }
}
