
// *Q.4.  Write a Java Program to accept the string input from user and print all the string in reverse order use StringBuilder class.
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String originalString = input.nextLine();

        StringBuilder reversedStringBuilder = new StringBuilder(originalString);
        reversedStringBuilder.reverse();

        System.out.println("Reversed string: " + reversedStringBuilder.toString());
    }
}