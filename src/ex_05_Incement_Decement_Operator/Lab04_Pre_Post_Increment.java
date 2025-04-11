package ex_05_Incement_Decement_Operator;

public class Lab04_Pre_Post_Increment {
    public static void main(String[] args) {
        int a =10;
        System.out.println(a++ + ++a);
        System.out.println("a="+a);
        //A+B
        //A-> a++ = 10, then after a++ , a= 11
        //+
        //B-> ++a ->a=11, so now ++a=12 , after this a=12
        //A+B->10 + 12= 22

        int b= 10;
        System.out.println(++b + ++b);
        System.out.println("b="+b);
        //A+B
        //A-> ++b = 11, then after ++b , b= 11
        //+
        //B-> ++b,since b=11, so ++b=12, after ++b->b=12
        //A+B->11 + 11= 22 ----> b=12

    }
}
