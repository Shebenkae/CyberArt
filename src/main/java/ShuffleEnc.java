public class ShuffleEnc {

    public String encode(String text, int[] array) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(array[i]);
        }
        return new String(chars);
    }

    public String decode(String text, int[] array) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[array[i]] = text.charAt(i);
        }
        return new String(chars);
    }
}
