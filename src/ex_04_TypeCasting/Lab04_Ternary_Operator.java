package ex_04_TypeCasting;

public class Lab04_Ternary_Operator {
    public static void main(String[] args) {
        // result=condition ? expression1 : expression2;
        int num = -5;
        String result = num > 0 ? "Positive" : "Negative";
        System.out.println(result);
        int num1 = -5;
        String result1 = num1 > -10 ? "Positive" : "Negative";
        System.out.println(result1);

        int x=10;
        int y=20;
        System.out.println(Math.max(x,y));

        String max =x>y? "x is max " : "y is max";
        System.out.println(max);

        int max1 =x>y? x : y;
        System.out.println(max1);

    }
}
