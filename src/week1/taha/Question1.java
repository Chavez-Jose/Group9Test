package week1.taha;

public class Question1 {
    public static void main(String[] args) {
        System.out.println(isEven(6));
    }


    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

