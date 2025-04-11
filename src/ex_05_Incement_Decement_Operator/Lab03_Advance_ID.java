package ex_05_Incement_Decement_Operator;

public class Lab03_Advance_ID   {
    public static void main(String[] args) {
        int a= 10;
        System.out.println(a++ + a);
        //ExpA+ExpB
        //A-> a++ ->ExpA->10 , now a= 11
        //+ sum
        //B->a ->ExpB->11 , a=11
        //A+b-> ExpA +ExpB -> 10+11

        //Line.no | a | Exp
        // 5 | 10 | NA
        //6 | 11 | 10+11->21
    }
}
