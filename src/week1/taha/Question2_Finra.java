package week1.taha;

public class Question2_Finra {
    public static void main(String[] args) {


        for (int i = 1; i <= 100 ; i++) {
            String result = "";
            if (i % 5 == 0 && i % 3 == 0){
                result = "FINRA";
            } else if (i % 3 == 0) {
                result = "FIN";
            } else if (i % 5 == 0) {
                result = "RA";
            }else {
                result = "" +i;
            }

            System.out.print(result + " ");
        }

    }
}
