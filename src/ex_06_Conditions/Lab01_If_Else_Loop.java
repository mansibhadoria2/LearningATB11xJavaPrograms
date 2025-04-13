package ex_06_Conditions;

import java.util.Scanner;

public class Lab01_If_Else_Loop {
    public static void main(String[] args) {
        //take input from user
        //1. CLI command
       //int age= Integer.parseInt(args[0]);

//        //Scanner Class
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age:");
        int age= sc.nextInt();
        if(age>18){
            System.out.println("Allowed to vote");
        }
        else{
            System.out.println("Not allowed to vote");
        }
    }
}
