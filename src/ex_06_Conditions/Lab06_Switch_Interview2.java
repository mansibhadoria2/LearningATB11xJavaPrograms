package ex_06_Conditions;

public class Lab06_Switch_Interview2 {
    public static void main(String[] args) {
       //Example 1
        int a=-1;
        switch (-1){
            case -1:
                System.out.println("-1");
                break;
            case 9:
                System.out.println("9");
                break;
            default:
                System.out.println("Default");
                break;
        }
        char ch= 'C';
        switch (ch){
            case 'A':
                System.out.println("Hello A");
            break;
            default:
                System.out.println("Default");
                break;
        }
    }
}
