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
