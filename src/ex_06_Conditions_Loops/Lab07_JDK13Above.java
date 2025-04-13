package ex_06_Conditions_Loops;

public class Lab07_JDK13Above {
    public static void main(String[] args) {
        //in JDK > 13
        //Example 1
        int itemCode = 001;
        switch (itemCode) {
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("001");
            case 003 -> System.out.println("001");
            case 004 -> System.out.println("001");
            default -> System.out.println("Default");
        }
        //Example 2
        int code=06;
        switch (code){
            case 01,03,05:
                System.out.println("All are Electronic Products");
                break;
            case 02,04,06:
                System.out.println("All are Mechanical Products");
                break;
            default:
                System.out.println("None");
                break;
        }
    }
}
