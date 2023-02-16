public class Q7 {
    public static void main(String[] args) {
        String originalString = "Welcome to School of Computer science";

        boolean startsWithWelcome = originalString.startsWith("Welcome");
        boolean endsWithScience = originalString.endsWith("Science");

        if (startsWithWelcome && endsWithScience) {
            System.out.println("The string starts with 'Welcome' and ends with 'Science'");
        } else {
            System.out.println("The string does not start with 'Welcome' and/or does not end with 'Science'");
        }
    }
}
