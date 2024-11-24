package week1.asta;

public class UniqueChars {

public static String unique1(String str){
    String result = "";
    int count;

    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);

         count = 0;
        for (int j = 0; j < str.length(); j++) {
            if(ch == str.charAt(j)) count++;
        }
       if(count == 1) result+=""+ ch;
    }

    return result;
}

    public static void main(String[] args) {
      String word = "AVAABBACCABXEA";
        System.out.println(unique1(word));
    }
}
