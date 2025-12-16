package workshops4;

import java.io.*;

public class qno13 {

 public static void main(String[] args) {

     try (FileReader fr = new FileReader("sample.txt");
          BufferedReader br = new BufferedReader(fr)) {

         String line;
         System.out.println("Reading file contents:");
         while ((line = br.readLine()) != null) {
             System.out.println(line);
         }

     } catch (FileNotFoundException e) {
         System.out.println("File not found: " + e.getMessage());
     } catch (IOException e) {
         System.out.println("IO Exception: " + e.getMessage());
     }

     System.out.println("Program completed safely.");
 }
}
