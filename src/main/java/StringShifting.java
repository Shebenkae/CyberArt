import java.io.File;
import java.util.Arrays;

public class StringShifting {

    public static String encode(String text, int shift) {
        char[] array = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            boolean isLowerCase = Character.isLetter(text.charAt(i)) && Character.isUpperCase(text.charAt(i));
            if (shift < 0) {
                if (isLowerCase) {
                    array[i] = (char) (((text.charAt(i) - 90 + shift) % 26) + 90);
                } else {
                    if (Character.isLowerCase(text.charAt(i))) {
                        array[i] = (char) (((text.charAt(i) - 122 + shift) % 26) + 122);
                    } else array[i] = text.charAt(i);
                }
            } else {
                if (isLowerCase) {
                    array[i] = (char) (((text.charAt(i) - 65 + shift) % 26) + 65);
                } else {
                    if (Character.isLowerCase(text.charAt(i))) {
                        array[i] = (char) (((text.charAt(i) - 97 + shift) % 26) + 97);
                    } else array[i] = text.charAt(i);
                }
            }
        }
        return new String(array);
    }

    public static String decode(String text, int shift) {
        return encode(text, -shift);
    }
}
