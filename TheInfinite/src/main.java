import java.io.*;
import java.util.Scanner;
public class main {
    public static void main(String[] args) throws IOException{
        System.out.println("Hello, World!");
        try {
        File gradesFile = new File("gradeTest.txt");
        Scanner reader = new Scanner(gradesFile);
            System.out.println(reader.next());
        }
        catch (java.io.FileNotFoundException e) {
            System.out.println("Error: "+e+ "occurred.");
      
          }
    }
}
