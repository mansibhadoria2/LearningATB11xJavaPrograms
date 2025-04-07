package ex_03_Operators;

public class Lab05_Interview_Concation_Plus {
    public static void main(String[] args) {
        //concatation
        System.out.println("Mansi"+"Bhadoria");

        String name="Mansi";
        String surmane="Bhadoria";
        System.out.println(name+surmane);

        int a=20,b=25;
        System.out.println(a+b);
// + -> behaves differently for String & int

        System.out.println(name+surmane+a+b); // MansiBhadoria2025
        System.out.println(a+b+name+surmane); // 45MansiBhadoria
        System.out.println(name+surmane+(a+b)); // MansiBhadoria45
        System.out.println((9*3/9+1)*3); //12
    }
}
