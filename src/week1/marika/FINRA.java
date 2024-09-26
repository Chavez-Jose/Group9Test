package week1.marika;

import java.util.ArrayList;

public class FINRA {
    public static void main(String[] args) {

        String result = "";
        for (int i = 1; i < 31; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                result = "FINRA";
            } else if (i % 3 == 0) {
                result = "FIN";
            } else if (i % 5 == 0) {
                result = "RA";
            } else {
                result = i + "";
            }
            System.out.printf(result + " ");
        }

        System.out.println();
        System.out.println("-----------2nd solution------------");

        String res = "";
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <31 ; i++) {
            numbers.add(i);
        }

        for (Integer each : numbers) {
            res = ((each%3==0)&&(each%5==0))?"FINRA": (each%3==0)?"FIN":(each%5==0)?"RA":each+" ";
            System.out.printf(res + " ");
        }





    }

}