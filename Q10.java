/* Q.10.  Write a Java Program to accept the string to “MATHEMATICS” and print 
Total number of different words possible using the word 
“MATHEMATICS”. */
public class Q10 {
    public static void main(String[] args) {
        String word = "MATHEMATICS";
        int n = word.length();

        int numM = countOccurrences(word, 'M');
        int numA = countOccurrences(word, 'A');
        int numT = countOccurrences(word, 'T');
        int numE = countOccurrences(word, 'E');

        long permutations = factorial(n + numM + numA + numT + numE - 1)
                / (factorial(numM) * factorial(numA) * factorial(numT) * factorial(numE)
                        * factorial(n - numM - numA - numT - numE));

        System.out.println("Total number of different words possible: " + permutations);
    }

    private static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    private static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
