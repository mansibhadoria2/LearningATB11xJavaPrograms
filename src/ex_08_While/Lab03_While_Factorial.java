package ex_08_While;

import java.util.Scanner;

public class Lab03_While_Factorial {
    public static void main(String[] args) {
        //factorial program
        System.out.println("Enter the number for whose factorial you want = ");
        Scanner sc = new Scanner(System.in); //Scanner is used to take input from user
        int number = sc.nextInt();

        int factorial = 1;
        if (number <= 1) {
            System.out.println("Factorial = " + factorial);
        } else {
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }
            System.out.println("Factorial= " + factorial);
        }
    }
}
