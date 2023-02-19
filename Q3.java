
// *Q.3. Write  a  Java  program  to  Use  Array  of  String  to  accept multiple  strings input and Print the string in sorting order.
import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int n = input.nextInt();

        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = input.next();
        }

        Arrays.sort(strings);

        System.out.println("Strings in sorting order:");
        for (int i = 0; i < n; i++) {
            System.out.println(strings[i]);
        }
    }
}
