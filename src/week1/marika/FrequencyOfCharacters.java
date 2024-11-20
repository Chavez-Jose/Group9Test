package week1.marika;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        System.out.println(FrequencyOfChars("AAABBCDD"));
        System.out.println(FrequencyOfChars("MMMMHHKKKLLN"));


    }

    public static String FrequencyOfChars(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    count++;
                }
            }
            if (result.contains("" + str.charAt(i))) {
                continue;
            }

            result += str.charAt(i) + "" + count;

        }
        return result;


    }

}






