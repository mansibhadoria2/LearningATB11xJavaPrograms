package ex_04_TypeCasting;

public class Lab08_CLI_Real_Age_Classification {
    public static void main(String[] args) {
        //age =23
        //Minor(Age<18), Adult(Age>18), Senior(Age>60)
        String age1 = args[0]; //take input from user --> CLI command
        System.out.println(age1);
        System.out.println(age1 instanceof String);
        int age = Integer.parseInt(age1);

        String result = (age < 18) ? "Citizen is Minor" : (age < 60) ? "Citizen is Adult" : "Citizen is Senior";
        System.out.println(result);
    }
}
