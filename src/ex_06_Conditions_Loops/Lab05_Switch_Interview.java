package ex_06_Conditions_Loops;

public class Lab05_Switch_Interview {
    public static void main(String[] args) {
        //Example 1
        int a = 10;
        switch (a) {

        }
        //Valid syntax, but it will print nothing
        //Example 2
        char ch = 'A';
        switch (ch) {
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No match");

        }
        //Example 3
//        boolean b= true;
//        switch (b){
//
//        }
// Boolean type is not supported in switch
        // Example 4
        long a1 = 30l;
        switch ((int) a1) {

        }
        //Valid, TypeCasting is valid in switch
        //Example 5
        int c = 98;
        switch (c) {
            case 98:
                System.out.println("98");
                break;
//            case 98:
//                System.out.println("98");
//                break;
        }  //Duplicate cases not allowed
    }
}
