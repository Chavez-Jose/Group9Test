package week1.asta;

public class Question2_Finra {
    public static String finra(int num) {

        for (int i = 1; i <= num; i++) {
            if(i % 3 == 0 && i % 5 == 0)
                System.out.print("FINRA ");
            else if(i % 3 == 0)
                System.out.print("FIN ");
            else if(i % 5 == 0)
                System.out.print("RA ");
            else
                System.out.print(i + " ");
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(finra(32));
    }
}
