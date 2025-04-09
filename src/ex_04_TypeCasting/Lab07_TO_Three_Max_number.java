package ex_04_TypeCasting;

public class Lab07_TO_Three_Max_number {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

        //n1>n2 and n1>n3 --> n1 is max
        //n2>n3 and n2 >n1 --> n2 is max
        // if above conditions are false, then n3 is max by default.
        String result = (n1 > n2) ? (n1 > n3 ? "n1 is max: " + n1 : "n3 is max: " + n3) : (n2 > n3 ? "n2 is max: " + n2 : "n3 is max: " + n3);
        System.out.println(result);
    }
}
