package week1.asta;

public class Question1 {

    public static void main(String[] args) {

        System.out.println( identify(5));
    }

    public static String identify(int num){
        if(num % 2 == 0) return "Even";
        return "Odd";
    }
}
/*
       identify(5) --> "Odd"
       identify(6) --> "Even"
 */