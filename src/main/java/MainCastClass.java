import java.io.File;
import java.io.IOException;

public class MainCastClass {

    public static void main(String[] args) throws IOException {
        String text = "aa zz4";
        int shift = 3;
        StringShifting stringShifting = new StringShifting();
        System.out.println("Start text is " + text + " Shift is " + shift);
        System.out.println("Encode Shift " + stringShifting.encode(text, shift));
        System.out.println("Decode Shift " + stringShifting.decode(stringShifting.encode(text, shift), shift));
        String text1 = "ab cd";
        int[] array = new int[] {3, 2, 1, 4, 0};
        ShuffleEnc shuffleEnc = new ShuffleEnc();
        System.out.println("Start text is " + text1);
        System.out.println("Encode Shuffle " + shuffleEnc.encode(text1, array));
        System.out.println("Decode Shuffle " + shuffleEnc.decode(shuffleEnc.encode(text1, array), array));
        File input = new File("src/main/resources/text.txt");
        File encDir = new File("src/main/resources/");
        File decrDir = new File("src/main/resources/");
        File encrypt = GammaEnc.encrypt(input, encDir);
        File decrypt = GammaEnc.decrypt(encrypt, decrDir);
    }
}
