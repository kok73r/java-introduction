package dream.team.homework.lesson11;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class PasswordGenerator {
    private static final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER_CASE = LOWER_CASE.toUpperCase();
    private static final String NUMBERS = "0123456789";
    private static final String OTHER_CHAR = "_";
    private static final String ALL_CHARS = LOWER_CASE + UPPER_CASE + NUMBERS;


    public static void main(String[] args) throws IOException {
        int sizePassword = 8;
        System.out.println("Random password : " + (generatePassword(sizePassword)));


    }

    public static String generatePassword(int length) {
        if (length < 1) throw new IllegalArgumentException();
        StringBuilder password = new StringBuilder();
        password.append(getSizeOfPartPassword(1, LOWER_CASE))
                .append(getSizeOfPartPassword(1, UPPER_CASE))
                .append(getSizeOfPartPassword(2, NUMBERS))
                .append(getSizeOfPartPassword(3, ALL_CHARS))
                .append(OTHER_CHAR);
        return shuffleString(password.toString());
    }

    public static String shuffleString(String string) {
        List letters = Arrays.asList(string.split(""));
        Collections.shuffle(letters);
        return (String) letters.stream().collect(Collectors.joining());
    }

    public static String getSizeOfPartPassword(int size, String str) {
        StringBuilder string = new StringBuilder();
        int index;
        for (int i = 0; i < size; i++) {
            index = (int) (Math.random() * str.length());
            string.append(str.charAt(index));
        }
        return string.toString();
    }
}