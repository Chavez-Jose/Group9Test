package week1.marika;

import java.util.Scanner;

public class Question1Solution {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        for (int i = 0; i <5; i++) {
            System.out.println("Please enter number: ");
            int number = input.nextInt();
            System.out.println(number + " is " + oddOrEven(number) + " number.");

        }
        input.close();

    }

    public static String oddOrEven(int number) {

        if (number % 2 == 0) {
            return "even";
        }else {
            return "odd";
        }
    }
}
