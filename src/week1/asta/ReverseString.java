package week1.asta;

public class ReverseString {

   public static String reverse1(String str) {
       String reversed = "";
       for(int i =str.length()-1; i >= 0; i--){
           reversed += str.charAt(i);
       }
       return  reversed;
   }

    public static void main(String[] args) {
        System.out.println(reverse1("!avaJ evol I"));
    }
}
