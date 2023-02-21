/* Q.10.  Write a Java Program to accept the string to "MATHEMATICS" and print 
Total number of different words possible using the word 
"MATHEMATICS".  */
public class Permutation {
    public static void main(String args[]) {

        String str = "Maths";

        int length = str.length();
        Permutation per = new Permutation();

        per.permutation(str, 0, length - 1);
    }

    private void permutation(String str, int si, int li) {
        if (si == li)
            System.out.println(str);
        else {
            for (int i = si; i <= li; i++) {

                str = swapChar(str, si, i);

                permutation(str, si + 1, li);
                str = swapChar(str, si, i);
            }
        }
    }

    public String swapChar(String str, int i, int j) {
        char temp;

        char[] chArray = str.toCharArray();
        temp = chArray[i];
        chArray[i] = chArray[j];
        chArray[j] = temp;

        return String.valueOf(chArray);
    }
}
