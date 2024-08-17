package sw_proj.helper;

import sw_proj.usermanagement.User;


import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public static final String VALID = "Valid";




    private Validation() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean regexMatcher(String regex, String value) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }

    private static String emptyUserFieldsTest(User user) {
        if (user.getEmail().isEmpty()) return "Email address can't be empty";
        if (user.getPhoneNumber().isEmpty()) return "Phone number can't be empty";
        if (user.getPassword().isEmpty()) return "Password can't be empty";
        if (user.getUsername().isEmpty()) return "Username can't be empty";
        if (user.getFirstName().isEmpty()) return "First name can't be empty";
        if (user.getLastName().isEmpty()) return "Last name can't be empty";
        if (user.getUserType().isEmpty()) return "User type can't be empty";
        return VALID;
    }



    public static String rollValidationTest(User roll) {
        String emptyFieldsTest = emptyUserFieldsTest(roll);
        if (!emptyFieldsTest.equals(VALID))
            return emptyFieldsTest;
        if (emailValidationTest(roll.getEmail())) {
            if (phoneNumberValidationTest(roll.getPhoneNumber())) {
                if (passwordValidationTest(roll.getPassword())) {
                    if (roll.getUserType().equals("admin") || roll.getUserType().equals("owner") || roll.getUserType().equals("user"))
                        return VALID;
                    else {
                        return "Invalid user type";
                    }
                } else {
                    return "Invalid password";
                }
            }
            return "Invalid phone number";
        }
        return "Invalid email address";
    }


    public static List<String> findNotFoundImages(List<String> imagePaths) {
        List<String> notFoundImages = new ArrayList<>();

        for (String path : imagePaths) {
            File file = new File(path);
            if (!file.exists()) {
                notFoundImages.add(path);
            }
        }

        return notFoundImages;
    }

    public static boolean phoneNumberValidationTest(String phoneNumber) {
        String regex = "^[0-9]{10}$";
        return regexMatcher(regex, phoneNumber);
    }

    public static boolean integerValidationTest(String number) {
        String regex = "^[0-9]{1,}$";
        return regexMatcher(regex, number);
    }



    public static boolean emailValidationTest(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return regexMatcher(regex, email);
    }

    public static boolean passwordValidationTest(String password) {
        String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$";
        return regexMatcher(regex, password);

    }



}