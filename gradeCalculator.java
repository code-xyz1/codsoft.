
import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your subject1 Marks:-- ");
        int subject1 = sc.nextInt();
        System.out.print("Enter Your subject2 Marks:-- ");
        int subject2 = sc.nextInt();
        System.out.print("Enter Your subject3 Marks:-- ");
        int subject3 = sc.nextInt();

        System.out.println("-------------------------------------------------------------------------------------------------------------");

        int sum = subject1 + subject2 + subject3;
        float percentage=(float)(subject1 + subject2 + subject3)/3;

        System.out.println("Total Marks Obtained:-- " + sum+"/300");

        System.out.println("Total Percentage Obtained:-- "+percentage+"%");

        if (percentage>85) {
            System.out.println("Grade Obtained:-- A");

        }
        else if (percentage>70 && percentage<86) {
            System.out.println("Grade Obtained:-- B");
        }
        else if (percentage>45 && percentage<71) {
            System.out.println("Grade Obtained:-- C");
        }
        else if (percentage>32 && percentage<46) {
            System.out.println("Grade Obtained:-- D");
        }
        else{
            System.out.println("Grade Obtained:-- FAIL");
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------");
    }
}
