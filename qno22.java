package workshops4;

import java.io.*;
import java.util.Scanner;

public class qno22 {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     System.out.print("Enter filename to read: ");
     String filename = sc.nextLine();

     FileReader fr = null;
     BufferedReader br = null;

     try {
         fr = new FileReader(filename); 
         br = new BufferedReader(fr);

         System.out.println("File contents:");
         String line;
         while ((line = br.readLine()) != null) {
             System.out.println(line);
         }

     } catch (FileNotFoundException e) {
         System.out.println("File not found: " + e.getMessage());
     } catch (IOException e) {
         System.out.println("IO Exception: " + e.getMessage());
     } finally {
         try {
             if (br != null) br.close();
             if (fr != null) fr.close();
         } catch (IOException e) {
             System.out.println("Error closing resources: " + e.getMessage());
         }
     }

     sc.close();
     System.out.println("Program completed.");
 }
}


