package week1.Ibrahim;

public class Question1 {

    /*
Write a method that can identify whether a given number is even or odd.
EX: identify(5) --> "Odd" identify(6) --> "Even"

 */

    public static void main(String[] args) {
        System.out.println(identify(5)); // Output: Odd
        System.out.println(identify(6)); // Output: Even
    }


    public static String identify(int number) {
        // Using modulus operator to check if the number is even or odd.
        return number % 2 == 0? "Even" : "Odd";
    }
}
