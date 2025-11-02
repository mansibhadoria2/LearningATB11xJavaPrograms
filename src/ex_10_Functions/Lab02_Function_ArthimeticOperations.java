package ex_10_Functions;

import java.util.Scanner;

public class Lab02_Function_ArthimeticOperations {
    static void main(String[] args) {
        //Create the functions of add, subtract, multiply, division
        //with parameter a,b -> inputs given by user
        System.out.println("enter the values of A and B for Arithematic Operations");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of number1");
        int a = 0;
        if (scan.hasNextInt()) {  // checks if the input is integer
            a = scan.nextInt();
        } else {
            System.out.println("Enter the Integer only!!");
            System.exit(0);
        }
        System.out.println("Enter value of number2");
        int b = 0;
        if (scan.hasNextInt()) {  // checks if the input is integer
            b = scan.nextInt();
        } else {
            System.out.println("Enter the Integer only!!");
            System.exit(0);
        }

        int addition = Add(a, b);
        System.out.println("Addition : " + addition);
        int subtract = Add(a, b);
        System.out.println("Subtract : " + subtract);
        int multiply = Mul(a, b);
        System.out.println("Multiplication: " + multiply);
        int division = Div(a, b);
        System.out.println("Division: " + division);
        int modulus = Mod(a, b);
        System.out.println("Modulus: " + modulus);
    }
    static int Add(int a, int b) {
        return a + b;
    }
    static int sub(int a, int b) {
        return a - b;
    }
    static int Mul(int a, int b) {
        return a * b;
    }
    static int Div(int a, int b) {
        if (b == 0) {
            System.out.println("Division by 0 is not allowed");
            System.exit(0);
        }
            return a / b;
    }
    static int Mod(int a, int b) {
        return a % b;
    }
}
