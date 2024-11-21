package week1.asta;

import java.util.*;

public class RemoveDuplicates {

    public static String noDuplicates(String str) {

        String noDup = "";
        for (int i = 0; i < str.length(); i++) {
            if (!noDup.contains("" + str.charAt(i))) {
                noDup += str.charAt(i);
            }
        }
            return noDup;
        }

        public static String noDuplicates2 (String str){
            Set<String> lst = new LinkedHashSet<>(Arrays.asList(str.split("")));
            String result = "";
            for (String each : lst) {
                result += each;
            }
            return result;
        }

        public static void main (String[]args){
            String str = "baaabbsbabasb";
            System.out.println(noDuplicates(str));
            System.out.println(noDuplicates2(str));
        }
    }
