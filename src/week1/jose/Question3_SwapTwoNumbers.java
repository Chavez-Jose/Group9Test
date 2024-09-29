package week1.jose;

public class Question3_SwapTwoNumbers {

    //  Swap two int variables' values without using a third variable

    public static void swapTwoNumbers( int num1, int num2 ){

        num1 = num1 + num2; // n1(100) + n2(50) = n1(150)
        num2 = num1 - num2; // n1(150) - n2(50) = n2(100)
        num1 = num1 - num2; // n1(150) - n2(100) = n1(50)
        System.out.println("New num1 = " + num1 + ", New num2 = " + num2);

        // That almost game me a headache!!!!

    }

    public static void main(String[] args) {

        swapTwoNumbers(100, 50);
    }
}
