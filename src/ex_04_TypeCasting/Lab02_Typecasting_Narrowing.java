package ex_04_TypeCasting;

public class Lab02_Typecasting_Narrowing {
    public static void main(String[] args) {
         int val = 300;
         // byte b= val; // invalid - narrowing- Implicit Casting not allowed
        byte b1 = (byte)val; //valid -> data loss
        System.out.println(b1);

        long phone_no= 9876543210l;
        short s= (short)phone_no;
        System.out.println(s);
    }
}
