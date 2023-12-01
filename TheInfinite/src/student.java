import java.util.Scanner;
public class student {
    private double class1Grade, class2Grade, class3Grade, class4Grade, class5Grade, class6Grade, class7Grade, class8Grade;
    private double class1Name, class2Name, class3Name, class4Name, class5Name, class6Name, class7Name, class8Name;
    Scanner keyboard = new Scanner(System.in);

    /**
     * Constructor
     * sets up classes for student
     * @param double of all 8 classes grades
     */
    public student (double grade1, double grade2, double grade3, double grade4, double grade5, double grade6, double grade7, double grade8) {
        // sets up grades from passed grades
        setGrade(1, grade1);
        setGrade(2, grade2);
        setGrade(3, grade3);
        setGrade(4, grade4);
        setGrade(5, grade5);
        setGrade(6, grade6);
        setGrade(7, grade7);
        setGrade(8, grade8);
    }
    /**
     * Grade Setter
     * @param int class period, double grade in class
     */
    public void setGrade(int classRefenced, double Grade) {
        if (classRefenced == 1)
            class1Grade = Grade;
        else if (classRefenced == 2)
            class2Grade = Grade;
        else if (classRefenced == 3)
            class3Grade = Grade;
        else if (classRefenced == 4)
            class4Grade = Grade;
        else if (classRefenced == 5)
            class5Grade = Grade;
        else if (classRefenced == 6)
            class6Grade = Grade;
        else if (classRefenced == 7)
            class7Grade = Grade;
        else if (classRefenced == 8)
            class8Grade = Grade;
    }

    /**
     * Grade Setter
     */
    public double getGrade(int classRefenced) {
        if (classRefenced == 1)
            return class1Grade;
        else if (classRefenced == 2)
            return class2Grade;
        else if (classRefenced == 3)
            return class3Grade;
        else if (classRefenced == 4)
            return class4Grade;
        else if (classRefenced == 5)
            return class5Grade;
        else if (classRefenced == 6)
            return class6Grade;
        else if (classRefenced == 7)
            return class7Grade;
        else if (classRefenced == 8)
            return class8Grade;
            else
        return -999.0; //if a non valid class is inputed then grade will be returned as -999.0
    }

}
