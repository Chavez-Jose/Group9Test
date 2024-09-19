package week1.gennady;

public class Question1Solution {

    public static void main(String[] args) {

        System.out.println("Hello World");

        System.out.println(oddOrEven(5));

        System.out.println(oddOrEven(6));


    }

    public static String oddOrEven(int number) {

        if (number % 2 == 0) {
            return "even";
        }else {
            return "odd";
        }
    }

}
