import java.io.*;
import java.util.Scanner;
public class main {
    public static void main(String[] args) throws IOException{
        System.out.println("Hello, World!");
        try {
        File gradesFile = new File("gradeTest.txt");
        Scanner reader = new Scanner(gradesFile);
        int a= Integer.parseInt(reader.next());
        int b= Integer.parseInt(reader.next());
        int c= Integer.parseInt(reader.next());
        int d= Integer.parseInt(reader.next());
        int e= Integer.parseInt(reader.next());
        int f= Integer.parseInt(reader.next());
        int g= Integer.parseInt(reader.next());
        int h= Integer.parseInt(reader.next());
        student austin = new student(a,b,c,d,e,f,g,h);
        }
        catch (java.io.FileNotFoundException e) {
            System.out.println("Error: "+e+ " occurred.");
      
          }
    }
}
