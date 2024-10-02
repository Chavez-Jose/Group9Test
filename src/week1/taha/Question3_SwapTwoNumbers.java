package week1.taha;

public class Question3_SwapTwoNumbers {

    public static void main(String[] args) {

        swapTwoNumbers(10,20);
        swapTwoNumbers(5,10);
        swapTwoNumbers(59,83);
    }

    public static void swapTwoNumbers(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping the two int a & b :\n\t a = " + a + "  &  b = " + b);
    }

}
