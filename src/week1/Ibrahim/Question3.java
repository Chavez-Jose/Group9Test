package week1.Ibrahim;

public class Question3 {

    public static void swapTwoNumbers(int a, int b) { //a = 5 b = 10
        a = a + b; //15
        b = a - b; //15 - 10 = 5
        a = a - b; //15 - 5 = 10
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int a = 5, b = 10;
        swapTwoNumbers(a, b);  // Output: After swapping: a = 10, b = 5
    }

}
