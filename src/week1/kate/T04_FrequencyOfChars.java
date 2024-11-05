package week1.kate;

public class T04_FrequencyOfChars {

    //Write a return method that can find the frequency of characters
//Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

    public static String frequencyOfChars(String str) {
        String result = "";
        int[] freq = new int[256]; //int array to store the frequency of each char

        //count freq of each char in the string
        for (char each : str.toCharArray()) {
            freq[each]++;
        }

        //create the result string with unique chars and their frequencies

        for (char each : str.toCharArray()) {
            if (freq[each] > 0) {
                result += each + "" + String.valueOf(freq[each]);
                freq[each] = 0; //reset the frequency of the char to avoid counting it again
            }
        }
        return result;

    }

    public static void main(String[] args) {
        String input = "AAABBCDD";
        System.out.println(frequencyOfChars(input));
    }

}

