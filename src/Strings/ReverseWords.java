package Strings;

public class ReverseWords {

    public static void main(String[] args) {
        String input = "  Hello World this is    JAVA ";
        String result = reverseWords(input);
        System.out.println(result);
    }

    public static String reverseWords(String input) {

        if(input == null || input.isBlank()) {
            return "";
        }

        String[] words = input.trim().split("\\s+");
        int n = words.length;

        for(int i = 0; i < n / 2; i++) {
            String temp = words[i];
            words[i] = words[n - 1 - i];
            words[n - 1 - i] = temp;
        }

//      concatenate string
        return String.join(" ", words);
    }
}
