package JAVA_11x_Task;

import java.util.Scanner;

public class Task06_Triangle_Classifier_HR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 sides of the Triangle: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1 == num2 && num2 == num3) {
            System.out.println("This is a Equilateral Triangle");
        } else if(num1 == num2 || num2 == num3 || num1 == num3) {
            System.out.println("This is a Isosceles triangle");
        } else {
            System.out.println("This is a Scalene Triangle");
        }
    }

}


