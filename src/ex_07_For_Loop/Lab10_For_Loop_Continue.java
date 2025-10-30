package ex_07_For_Loop;

public class Lab10_For_Loop_Continue {
    static void main() {
        for (int i = 1; i <=10 ; i++) {
            if (i == 5) {
                continue;// it skiped the above condition when true & moved to top for further execution
            }
            System.out.println(i);
        }
    }
}
