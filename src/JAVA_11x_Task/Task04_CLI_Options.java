package JAVA_11x_Task;

import java.util.Scanner;

public class Task04_CLI_Options {
    public static void main(String[] args) {
        //Take user input-name, age & salary and print them in the end.
        //Take user input 2 numbers from the arguments and calculate the maximum
        System.out.println("Enter the user's name , age & salary:");
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        double salary = Double.parseDouble(args[2]);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

//        //Scanner class
//        System.out.println("Enter the user's name , age & salary:");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        int age = sc.nextInt();
//        double salary = sc.nextDouble();
//
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//        System.out.println("Salary: " + salary);
//        //close the scanner
//        sc.close();
    }

}
