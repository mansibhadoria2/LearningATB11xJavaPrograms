package ex_10_Functions;

public class Lab01_Functions_DifferentTypes {
    static void main(String[] args) {
     Func1();
     int result= Func2();
        System.out.println(result);

        boolean result1= Func3();
        System.out.println(result1);

        long result2= Func4();
        System.out.println(result2);
    }
    static void Func1(){
        System.out.println("Functions Example");
    }
    static int Func2(){
        return 10;
    }
    static boolean Func3(){
        return true;
    }
    static long Func4(){
        return 20l;
    }
}
