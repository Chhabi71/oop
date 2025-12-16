package workshops4;

import java.io.*;

public class qno15 {

 public static void main(String[] args) {
     try {
         readFile();
     } catch (IOException e) {
         System.out.println("Exception caught in main: " + e.getMessage());
     }

     System.out.println("Program continues...");
 }

 public static void readFile() throws IOException {
     openFile();
 }

 public static void openFile() throws IOException {
     FileReader fr = new FileReader("nonexistent_file.txt"); 
     fr.close();
 }
}
