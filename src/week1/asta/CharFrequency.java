package week1.asta;

import org.w3c.dom.ls.LSOutput;

public class CharFrequency {

    public static String cFrequency(String str){

        String used ="";
        for(int i = 0; i <str.length();i++){

            char c = str.charAt(i);
           int count =0;
            if(!used.contains(""+c)){
                for (int y = 0; y < str.length(); y++) {
                   if(c==str.charAt(y)) count++;
                }
                used+=""+c+""+count;
            }
        }

       return used;
    }

    public static void main(String[] args) {

        String s = "AHFFFFJGGGFGFFDFDFDAAA";
        System.out.println(cFrequency(s));
    }
}
