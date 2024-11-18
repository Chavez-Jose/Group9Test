package week1.kate;

public class T05_RemoveDuplicates {

    public static String removeDupes(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++){
            if (result.indexOf(str.charAt(i)) == -1){ // If the character is not already in the result
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static String removeDupBuilder(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.indexOf(String.valueOf(ch)) == -1) { // If the character is not already in the result
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println("removeDupes(\"AAAAABBBBCCC\") = " + removeDupes("AAAAABBBBCCC"));
        System.out.println(removeDupBuilder("AAAAABBBBCCC"));
    }
}
/*
Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC")  ==> ABC
 */
