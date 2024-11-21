package week1.jose;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesTask {

    public static String removeDuplicates(String duplicates) {

        String list = "";

        for (int i = 0; i < duplicates.length() ; i++){
            if (!list.contains("" + duplicates.charAt(i))){
                   list += duplicates.charAt(i);

            }
        }
        return list;

    }
    public static void main(String[] args) {

        System.out.println(removeDuplicates("tttlksjjfasdjfklsa55555732ldldldld33"));
    }






}


