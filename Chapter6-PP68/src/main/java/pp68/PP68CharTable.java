package pp68;

public class PP68CharTable {
// Print a table of Chars and their numeric

    public static void main(String[] args) {
        final int MIN = 32, MAX = 126, PER_LINE = 5;
        int count = 0;

        for (int chValue = MIN; chValue <= MAX; chValue++) {
            System.out.print(chValue + " " + (char) chValue + "\t");
            count++;
            if (count % PER_LINE == 0) {
                System.out.println();
            }
        }

    }

}
