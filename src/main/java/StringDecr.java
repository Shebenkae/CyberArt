import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * расшифровка методом протяжного слова
 */
public class StringDecr {
    public static void main(String[] args) {
        String text = "dd cc4";
        decryptByWord(text, "zz4", 6);
    }


    public static void decryptByWord(String text, String possibleWord, int length) {
        for (int i = 0; i < length; i++) {
            String answer = StringShifting.decode(text, i);
            System.out.println(answer);
            if (answer.contains(possibleWord)){
                System.out.println("Answer is " + answer + " key is " + i);
            }
        }
    }

}