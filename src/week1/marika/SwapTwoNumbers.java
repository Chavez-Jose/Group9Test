package week1.marika;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        swap(34,67);
        swap(45,95);
        swap(99,1);




    }

    public static void swap(int num1, int num2) {

        System.out.println("num1 = "+(num1+(num2-num1)));
        System.out.println("num2 = "+(num2-(num2-num1)));
    }
}
