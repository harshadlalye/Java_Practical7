import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String originalString = input.nextLine();

        String reversedString = "";

        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString += originalString.charAt(i);
        }

        if (originalString.equals(reversedString)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
