package arrays;

public class reverseString {

    public static String reverseStr(String string) {
        char charact[] = string.toCharArray();
        String reversedString = "";

        for (int i = charact.length - 1; i >= 0; i--) {
            reversedString += charact[i];
        }
        return reversedString;
    }

    public static String rev(String string) {
        StringBuilder str = new StringBuilder(string);
        str.reverse();
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(rev("my name is Itunuoluwa"));
        System.out.println(reverseStr( "my name is Itunuoluwa"));
    }

}