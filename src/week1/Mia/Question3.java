package week1.Mia;

public class Question3 {


    public static void main(String[] args) {

            int a = 5;
            int b = 10;

            System.out.println("Before swapping: a = " + a + ", b = " + b);

            a = a + b; // Step 1: Sum of a and b
            b = a - b; // Step 2: b becomes original a
            a = a - b; // Step 3: a becomes original b

            System.out.println("After swapping: a = " + a + ", b = " + b);
        }



    }



