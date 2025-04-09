package ex_04_TypeCasting;

public class Lab05_Interview_Question {
    public static void main(String[] args) {
        int num=5;
        String result= (num>10) ? "A" : "B";
        System.out.println(result);

        int num1=25;
        String result1= (num1>10) ? (num1>20 ? "N>20" : "N<20") : "B";
        System.out.println(result1);

    }
}
