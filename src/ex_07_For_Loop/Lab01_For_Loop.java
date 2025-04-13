package ex_07_For_Loop;

public class Lab01_For_Loop {
    public static void main(String[] args) {
        //For Loop
        //Initialisation->Condition->Updation(Increment/Decrement)
       //Example 1
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }
        //Example 2
        for (int _a = 1; _a <= 5; _a++) {
            System.out.println(_a);
        }
        System.out.println("End");

        //Example 3
        for (int i = 0; i > 1; i++) {  // i>1 -- condition is wrong, loop will not work
            System.out.println(i);
        }
        System.out.println("The End");
    }
}
