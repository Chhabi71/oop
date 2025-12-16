package workshops4;
//FinallyResourceDemo.java

import java.io.*;

public class qno21 {

 public static void main(String[] args) {

     FileReader fr = null;
     BufferedReader br = null;

     try {
         fr = new FileReader("sample.txt");   // open file
         br = new BufferedReader(fr);

         String line;
         System.out.println("Reading file contents:");
         while ((line = br.readLine()) != null) {
             System.out.println(line);
         }

     } catch (FileNotFoundException e) {
         System.out.println("File not found: " + e.getMessage());
     } catch (IOException e) {
         System.out.println("IO Exception: " + e.getMessage());
     } finally {
         // Close resources safely
         try {
             if (br != null) br.close();
             if (fr != null) fr.close();
             System.out.println("Resources closed in finally block.");
         } catch (IOException e) {
             System.out.println("Error closing resources: " + e.getMessage());
         }
     }

     System.out.println("Program completed.");
 }
}
