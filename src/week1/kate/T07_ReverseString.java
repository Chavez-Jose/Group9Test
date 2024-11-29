package week1.kate;

public class T07_ReverseString {

    public static String reverseStr(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println("reverseStr(\"Hello World!\") = " + reverseStr("Hello World!"));
        System.out.println(reverseStr("1234567890"));

    }
}
