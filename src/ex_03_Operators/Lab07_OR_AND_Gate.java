package ex_03_Operators;

public class Lab07_OR_AND_Gate {
    public static void main(String[] args) {
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        //AND Gate
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);


        int mansi_age= 30, manonit_age=34;
       boolean result= !(mansi_age>10||manonit_age<20);
        System.out.println(result);
    }
}