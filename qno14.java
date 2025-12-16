package workshops4;

public class qno14 {

 public static void main(String[] args) {

     try {
         int a = 10 / 0; 
         int[] arr = {1, 2, 3};
         System.out.println(arr[5]); 

     } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
         System.out.println("Caught exception: " + e);
     }

     System.out.println("Program continues...");
 }
}

