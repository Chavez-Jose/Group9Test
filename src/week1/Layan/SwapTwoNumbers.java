package week1.Layan;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        /*
        Swap two int variables' values without using a third variable
         */

        int a = 10;
        int b =20;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        // After swapping:
        a = a + b; // a =30
        b = a - b; // b = 10
        a = a - b;  // a = 20

        System.out.println("After swapping: a = " + a + ", b = " + b);


    }
}
