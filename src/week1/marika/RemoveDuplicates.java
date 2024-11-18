package week1.marika;

public class RemoveDuplicates {
    /*
    Write a return method that
    can remove the duplicated values from String
    Ex:  removeDup("AAABBBCCC")  ==> ABC
     */
    public static void main(String[] args) {
        System.out.println(removeDuplicates("AAABBBCCC"));
        System.out.println(removeDuplicates("MMBBBBOOOOKK"));
    }
    public static String removeDuplicates(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            //if (!result.contains(String.valueOf(word.charAt(i))))
            if (result.contains(""+word.charAt(i))) { // if character already contains we skip
                continue;
            }
                result += word.charAt(i);
            }
        return result;
        }


}

//value of ()-static method that converts data from its internal form into a human-readable string representation.
