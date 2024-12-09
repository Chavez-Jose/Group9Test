package week1.marika;

public class PasswordValidation {
    public static void main(String[] args) {
        /*
        Password Validation Task:
Write a return method that can verify if a password is valid or not.
Requirements:
    1. Password MUST be at least have 6 characters and should not contain space
    2. Password should at least contain one upper case letter
    3. Password should at least contain one lowercase letter
    4. Password should at least contain one special characters
    5. Password should at least contain a digit
    if all requirements above are met, the method returns true, otherwise returns false
         */
        System.out.println("1. At least 6 character: Ab1@ = "+isValidPassword("Ab1@"));//too short
        System.out.println("2. At least 1 uppercase: ab123456@ = "+isValidPassword("ab123456@")); //missing uppercase
        System.out.println("3. At least 1 lowercase: AB123456@ = "+isValidPassword("AB123456@")); //missing lowercase
        System.out.println("4. At least 1 special character: Ab12345 = "+isValidPassword("Ab12345")); // missing special character
        System.out.println("5. At least 1 digit: Ababa@ = "+isValidPassword("Ababa@")); //missing digit
        System.out.println("6. Valid password: Ab123@ = "+isValidPassword("Ab123@")); //missing digit

    }

    private static boolean isValidPassword(String str) {
        if (str.length() < 6 || str.contains(" ")) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(ch)){
                hasSpecialChar = true;
            }
        }

        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
    }
}
