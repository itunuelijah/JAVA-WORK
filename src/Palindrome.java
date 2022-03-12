import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String aString = input.nextLine();
        int low = 0;
        int high = aString.length() - 1;
        boolean palindrome = true;

        while (low < high) {
            if (aString.charAt(low) != aString.charAt(high)) {
                palindrome = false;
                break;
            }

            low++;
            high--;
        }
        if (palindrome)
            System.out.println(aString + " is a palindrome");
        else
            System.out.println(aString + " is not a palindrome");

        }
    }
