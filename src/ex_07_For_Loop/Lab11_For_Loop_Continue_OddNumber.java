package ex_07_For_Loop;

public class Lab11_For_Loop_Continue_OddNumber {
    static void main() {
        for (int i = 1; i <=20 ; i++) {
                if (i % 2 == 0){
                    continue;
                }
            System.out.println("odd: " +i);
            }
        }
    }
