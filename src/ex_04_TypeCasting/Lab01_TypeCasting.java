package ex_04_TypeCasting;

public class Lab01_TypeCasting {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // valid Syntax-> smaller data into the bigger data type
                   // implicit widening ->done autoatically

        int a1 = (int)b;//Explicit Casting - Widening (doesn't require)
    }
}
