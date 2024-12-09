package week1.kate;

public class T09_PasswordValidation {

    public static boolean validatePassword(String password) {
        //Password MUST be at least have 6 characters and should not contain space
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // at least one uppercase letter
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        // at least one lowercase letter
        if (!password.matches(".*[a-z].*")) {
            return false;
        }

        // at least one special character
        if (!password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            return false;
        }
        // at least one digit
        if (!password.matches(".*\\d.*")) {
            return false;
        }

        return true;
    }

    public static boolean validatePassword2(String password){

        if (password.length() < 6 || password.contains(" ")) {
            System.out.println("Password is not valid");
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        // Iterate through each character in the password
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecialChar = true;
            }

            // If all conditions are met, return true
            if (hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar) {
                System.out.println("You've ebtered a valid password");
                return true;
            }
        }

        // Return false if any condition is not met
        return false;
    }

    public static void main(String[] args) {
        System.out.println("validatePassword(\"hghjgk1We\") = " + validatePassword("hghjgk1We"));
    }
}

/*
    PasswordValidation
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



