package ex_05_Incement_Decement_Operator;

public class Lab02_Increment_Operator {
    public static void main(String[] args) {

     //Pre_increment- First increase and then print
        int a= 10;
        int b= ++a;
        System.out.println(b); //11
        System.out.println(++a); //11
        System.out.println(a);

        //Post_increment- First Print and then increase
        int x= 15;
        System.out.println("x++: "+x++); //15
        System.out.println("x: "+x); //16

        int m=6;
        int result= m++;
        System.out.println(m);
        System.out.println(result);
        System.out.println(m++);
    }
}
