package ex_02_Java_Basic_Pt2;

public class Lab01_Variables {
    public static void main(String[] args) {
        //datatype variable_name= variable_value
        byte b = 10;
        System.out.println(b);
        //byte-> DataType     // b -> variable_name
        // = -> assignment operator  // 10 -> variable_value
        int age =20;
        age=65+1;
        System.out.println(age);
        int $ = 12;
        System.out.println($);
        int _9= 31;
        System.out.println(_9);
        int a_b= 25;
        System.out.println(a_b);
        int Lab01_Variables= 40;
        System.out.println(Lab01_Variables);
        boolean is_Mansi_working= true;
        System.out.println(is_Mansi_working);
  //*      byte q= 128; // error-> -128 to 127
                    //error->incompatible types: possible lossy conversion from int to byte
        long phone_Number= 9988776655l;
        System.out.println(phone_Number);
        double number1= 8621091.5;
        System.out.println(number1);
    }
}
