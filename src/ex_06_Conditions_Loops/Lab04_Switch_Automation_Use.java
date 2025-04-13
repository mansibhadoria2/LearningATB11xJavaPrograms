package ex_06_Conditions_Loops;

import java.util.Scanner;

public class Lab04_Switch_Automation_Use {
    public static void main(String[] args) {
        //Web Automation
        // I will ask the user to give me the input from browser which he wants to use
        // I will start automation in that browser

//        String browser= args[0];   //CLI command
//        System.out.println(browser);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser of your choice:");
        String browser = sc.next();

        switch (browser){
            case "chrome":
                System.out.println("Chrome Browser Started");
                System.out.println("TC1");
                System.out.println("TC2");
                break;

            case "firefox":
                System.out.println("Firefox Browser Started");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
                case "edge":
                System.out.println("Edge Browser Started");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            default:
                System.out.println("Sorry! no browser found :(");
                break;
        }
        sc.close();
    }
}
