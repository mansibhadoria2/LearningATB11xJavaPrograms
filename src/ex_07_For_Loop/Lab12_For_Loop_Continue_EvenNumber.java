package ex_07_For_Loop;

public class Lab12_For_Loop_Continue_EvenNumber {
    static void main() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0)
            System.out.println("Even: " + i);
            continue;
        }
    }
}
