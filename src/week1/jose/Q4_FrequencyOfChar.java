package week1.jose;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q4_FrequencyOfChar {

    public static void frequencyOfChars(String string){


        // Create a map to store unique character frequencies
        Map<Character, Integer> charFrequency = new LinkedHashMap<>();

        // Create a loop to count the frequency of each character
        for (char ch : string.toCharArray()) {

        // If key value in map does not exist, create first occurence in map
           if ( charFrequency.get(ch)== null){
               charFrequency.put(ch, 1);
           }else{

        // If key value does already exist in the map, we will add +1 to it's value
               charFrequency.put(ch, charFrequency.get(ch) + 1);
           }


        }
        System.out.println(charFrequency);



    }

    public static void main(String[] args) {

       frequencyOfChars("333333ggggguuuuwsertyyyyyyyyyyyYYIIi");
    }

}
