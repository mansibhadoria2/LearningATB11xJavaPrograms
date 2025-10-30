package ex_07_For_Loop;

public class Lab08_For_EvenOdd_Top50_Cognizant {
     static void main(String[] args) {
        for (int i = 1; i <=50 ; i++) {
          if(i % 2 == 0){
              System.out.println("Even:" +i);
          }
          else
              System.out.println("Odd: "+i);
        }
    }
}
