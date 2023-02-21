/* Q.10.  Write a Java Program to accept the string to "MATHEMATICS" and print 
Total number of different words possible using the word 
"MATHEMATICS". */
public class Q10 {
    public static void main(String[] args) {
        String word = "MATHEMATICS";
        int n = word.length();
        int numM = countOccurrences(word, 'M');
        int numA = countOccurrences(word, 'A');
        int numT = countOccurrences(word, 'T');
        int numH = countOccurrences(word, 'H');
        int numE = countOccurrences(word, 'E');
        int numI = countOccurrences(word, 'I');
        int numC = countOccurrences(word, 'C');
        int numS = countOccurrences(word, 'S');

        long numWords = factorial(n) / (factorial(numM) * factorial(numA) * factorial(numT) *
                factorial(numH) * factorial(numE) * factorial(numI) * factorial(numC) * factorial(numS));
        System.out.println("Number of words that can be formed from the letters in " + word + " is " + numWords);
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
