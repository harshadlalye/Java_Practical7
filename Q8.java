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
