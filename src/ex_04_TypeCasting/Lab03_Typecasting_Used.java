package ex_04_TypeCasting;

public class Lab03_Typecasting_Used {
    public static void main(String[] args) {
        int course= 100;
        float GST=18.45f;
      //  int total=course+GST;//Narrow-Implicit
        int total1=course+(int)GST;//Narrow-Explicit
        System.out.println(total1);

        float total2= course+GST; //widening-auto- implicit
        System.out.println(total2);

        float total3= (float)course+GST; //widening- Explicit
        System.out.println(total3);

    }
}
