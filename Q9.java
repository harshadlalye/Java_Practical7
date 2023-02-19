
/* Q.9. Write a Java Program to accept the first string input from user 
“Welcome to MIT- WPU”  and Second String input “School of Computer 
Science” 
and Print “Welcome to MIT- WPU School of Computer Science” Using 
append() function. */
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = input.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = input.nextLine();

        StringBuilder stringBuilder = new StringBuilder(firstString);

        stringBuilder.append(" ");
        stringBuilder.append(secondString);

        System.out.println("The resulting string is: " + stringBuilder.toString());
    }
}
