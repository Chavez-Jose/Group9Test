package week1.Mia;

public class Question2 {


    public static void main(String[] args) {
        Finra(30);  // Call the function with 30 as the argument.
    }

    public static void Finra(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);

                //

            }
        }
    }
}

