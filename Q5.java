import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String originalString = input.nextLine();

        String vowels = "";

        for (int i = 0; i < originalString.length(); i++) {
            char c = originalString.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vowels += c;
            }
        }

        System.out.println("Vowels in the string: " + vowels);
    }
}
