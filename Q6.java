
/*Q.6. Write  a  Java  Program  to  accept  the  string  input  from  user  Print  no  of 
words , No of white spaces and total number of characters present in the 
string. */
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String originalString = input.nextLine();

        int wordCount = 0;
        int spaceCount = 0;
        int charCount = 0;

        for (int i = 0; i < originalString.length(); i++) {
            char c = originalString.charAt(i);

            if (c == ' ') {
                spaceCount++;
            } else {
                charCount++;
            }

            if (i == 0 || originalString.charAt(i - 1) == ' ') {
                wordCount++;
            }
        }

        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of white spaces: " + spaceCount);
        System.out.println("Total number of characters: " + charCount);
    }
}
