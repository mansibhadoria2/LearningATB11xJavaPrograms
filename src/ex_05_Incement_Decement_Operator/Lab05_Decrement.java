package ex_05_Incement_Decement_Operator;

public class Lab05_Decrement {
    public static void main(String[] args) {
        int a = 10;

        System.out.println(a);//10
        int result_pre = --a;
        System.out.println("pre: "+result_pre); //9
        System.out.println(a);//9


        int a1 = 10;
        System.out.println(a1);//10
        int result_post = a1--;
        System.out.println("post:"+result_post); //10
        System.out.println(a1);//9
    }
}
