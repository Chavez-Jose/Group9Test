package week1.asta;

public class SwapNumbers {

    public static void numSwap(int a, int b) {

        System.out.println("Before the swap");
        System.out.println("a = " + a + ", b = " + b);
        // a = 5   b = 10
        a = a + b;  //  5 + 10   a = 15
        b = a - b;  // 15 - 10   b = 5
        a = a - b;  // 15 - 5    a = 10

        System.out.println("After the swap");
        System.out.println("a = " + a + ", b = " + b);

    }

    public static void main(String[] args) {
        numSwap(43, 77);
    }
}
