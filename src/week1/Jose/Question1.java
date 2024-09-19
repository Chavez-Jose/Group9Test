package week1.Jose;

public class Question1 {

    public static void main(String[] args) {

        System.out.println(oddOrEven(50));

    }

    public static String oddOrEven(int number){

        if (number % 2 == 0){
            return "Even number: " + number;
        }else{
            return "Odd number: " + number;
        }
    }


}
