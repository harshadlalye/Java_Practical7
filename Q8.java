
// *Q.8. Write a Java Program to accept the string input from user and store it in StringBulilder and check the Capacity of StringBulder.
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String originalString = input.nextLine();

        StringBuilder stringBuilder = new StringBuilder(originalString);

        System.out.println("The capacity of the StringBuilder object is " + stringBuilder.capacity());
    }
}
