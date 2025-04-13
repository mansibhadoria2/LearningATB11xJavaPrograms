package ex_06_Conditions_Loops;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Lab03_Switch_Statement {
    public static void main(String[] args) {
       //Take user input & tell them the day which they have told
        //1 to 7 || 1->mon, 2->tues, 3->wed, 4->thur, 5->fri, 6->sat, 7->sun
        //8  or any other no. : Error/ Not Allowed

        //int day=Integer.parseInt(args[0]); // CLI option

        //Scanner Class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Day Number(1-7)");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Monday");
                break;
            default:
                System.out.println("Invalid day Number!");
                break;

        }

    }
}
