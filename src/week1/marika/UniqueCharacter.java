package week1.marika;


public class UniqueCharacter {
    public static void main(String[] args) {

        System.out.println(uniqueCharacter("AAABBBCCCDEF")); // Output: "DEF"
        System.out.println(uniqueCharacter("mmddaorr"));
    }

    public static String uniqueCharacter(String str) {
        String unique = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) { //how many times ch variable appeared in the string
                if (str.charAt(i) == ch) {
                    count++; // increase the count by 1
                }
            }
            if (count ==1) {
                unique+=ch;
            }
        }
        return unique;
    }

}

    /* Write a return  method that can find the unique characters from the String
    Ex:  unique("AAABBBCCCDEF")  =>  "DEF";
    */