package JAVA_11x_Task;

public class Task02_Pre_Post_IncrementOP {
    public static void main(String[] args) {
        int a =10;
        System.out.println(++a + a++ + a++);
        System.out.println("a="+a);
        //A+B+C
        //++a ->ExpA--a=10, so ++a=11, after ++a, a=11
        //+
        //a++ ->ExpB--a=11, so a++=11, after a++, a=12
        //+
        //a++ ->ExpC-- a=12, so a++=13,  after a++, a=13
        // so,A+B+C = 11+11+12 =34 || a= 13
    }
}
