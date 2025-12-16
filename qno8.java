package workshops4;

public class qno8 {

    public static void main(String[] args) {

        try {
            System.out.println("Outer try block started.");

            try {
                // Inner try block 1 – ArithmeticException
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Caught in inner catch 1: " + e);
            }

            try {
                // Inner try block 2 – ArrayIndexOutOfBoundsException
                int[] arr = {1, 2, 3};
                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught in inner catch 2: " + e);
            }

            System.out.println("End of outer try block.");

        } catch (Exception e) {
            System.out.println("Caught in outer catch: " + e);
        }

        System.out.println("Program continues...");
    }
}

