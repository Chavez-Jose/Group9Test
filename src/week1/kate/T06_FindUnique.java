package week1.kate;

public class T06_FindUnique {

    public static String findUnique(String str) {
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) { // lastIndexOf gives the last occurence of char
                unique += ch;
            }
        }
        return unique;

    }

    public static void main(String[] args) {
        System.out.println(findUnique("kjhjkkkkkjhjkkkkkkjhdhert"));
    }
}

/*
Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */
