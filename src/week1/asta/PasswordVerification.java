package week1.asta;

public class PasswordVerification {
    /**
     * Write a return method that can verify if a password is valid or not.
     * Requirements:
     *     1. Password MUST be at least have 6 characters and should not contain space
     *     2. Password should at least contain one upper case letter
     *     3. Password should at least contain one lowercase letter
     *     4. Password should at least contain one special characters
     *     5. Password should at least contain a digit
     *     if all requirements above are met, the method returns true, otherwise returns false
     */

    public static boolean verifyPassword(String password){

        return password.length() >= 6
                && !password.contains(" ")
                && password.matches(".*[A-Z].*")
                && password.matches(".*[a-z].*")
                && password.matches(".*\\d.*")
                && password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?].*");
                   }

    public static void main(String[] args) {
        System.out.println(verifyPassword("gg$hc12T3")); // true
        System.out.println(verifyPassword("alJJk bc!123")); // false
    }
}
