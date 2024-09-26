package week1.Layan;

public class Question1 {
    /*
    Numbers -- odd & even
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even" (edited)

     */


    public static String oddOrEven(int num){
        if(num%2 ==0){
            return "Even";
        }
        return "Odd";
    }


}
