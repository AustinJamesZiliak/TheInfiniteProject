/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class student//must be here
{
    
            /**
             * constructor
             * sets up all grades for further use
             */
            public student(double a,double b,double c,double d,double e,double f,double g)
            {
                a =a;
                b =b;
                c =c;
                d =d;
                e =e;
                f =f;
                g =g;
                String grades="";
                grades+=a+" ";
                grades+=b+" ";
                grades+=c+" ";
                grades+=d+" ";
                grades+=e+" ";
                grades+=f+" ";
                grades+=g+" ";
                System.out.println(grades);
                double lowest=10000000;
                Scanner scan=new Scanner(grades);
                for(double z=Double.parseDouble(scan.next());scan.hasNext()==true;z=Double.parseDouble(scan.next()))
                {
                    if (z<lowest)
                    lowest=z;
                }
                System.out.println(lowest);
            }
    }