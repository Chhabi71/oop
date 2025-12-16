package workshops4;
//ThrowsExampleDemo.java

import java.io.*;

public class qno10 {

 public static void main(String[] args) {

     try {
         readFile(); 
     } catch (IOException e) {
         System.out.println("Exception caught in main: " + e.getMessage());
     }

     System.out.println("Program continues...");
 }

 public static void readFile() throws IOException {
     FileReader fr = new FileReader("nonexistent_file.txt"); 
     fr.close();
 }
}

