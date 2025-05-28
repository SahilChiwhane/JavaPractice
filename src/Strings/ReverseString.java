package Strings;

public class ReverseString {

    public static void main(String[] args) {
        String str = "My alias is MishraHt";
        String res = reverseString(str);
        System.out.print(res);
    }

    static String reverseString(String str) {
        StringBuilder res = new StringBuilder();

        for(int i = str.length() - 1; i >= 0; i--) {
            res.append(str.charAt(i));
        }

        return res.toString();
    }
}
