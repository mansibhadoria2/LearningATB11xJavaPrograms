package JAVA_11x_Task;

import java.util.Scanner;

public class Task005_Even_Odd_Number {
    // Take input from user
    //check whether number is even or odd
    public static void main(String[] args) {
//       //CLI Command
//        int number= Integer.parseInt(args[0]);
       //Scanner Class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }
}
