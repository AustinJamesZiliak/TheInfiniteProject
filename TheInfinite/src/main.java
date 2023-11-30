import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        try {
        Scanner reader = new Scanner(new File("Devlogs.txt"));
        System.out.println(reader.next());
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
      
          }
    }
}
