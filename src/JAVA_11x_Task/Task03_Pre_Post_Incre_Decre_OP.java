package JAVA_11x_Task;

public class Task03_Pre_Post_Incre_Decre_OP {
    public static void main(String[] args) {
        int a =20;
        System.out.println(--a + a++ + a--);
        System.out.println("a="+a);
        //A+B+C
        //--a ->ExpA a=20, so --a=19, after --a, a=19
        //+
        //a++ ->ExpB a=19, so a++=19, after a++, a=20
        //+
        //a-- ->ExpC a=20, so a--=20,  after a--, a=19
        // so,A+B+C = 19+19+20 =34 || a= 19
    }
}
