package week1.Mia;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {

        oddEven(10);


    }

public static void oddEven (int number) {
    if (number % 2 == 0) {
        System.out.println(number + " is an even number");
    } else {
        System.out.println(number + " is an odd number");
    }
}



}
