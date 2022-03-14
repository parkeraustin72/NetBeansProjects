package TwoDArray;

public class ReverseMethods {

    public static int[][] reverseTransposeArray(int[][] original) {
        int x = 0;
        int y = 0;
        for (int row = 4; row >= x; row--) {
            for (int col = 2; col >= y; col--) {

                System.out.print("[" + Math.abs(4 - row) + "][" + Math.abs(2 - col) + "] = " + original[row][col] + "\t");

            }
            System.out.println();

        }
        return original;

    }

    public static int[][] flipArrayHorizontally(int[][] original) {
        int x = 3;
        int y = 5;

        for (int row = 0; row < x; row++) {
            for (int col = 0; col < y; col++) {
                System.out.print("[" + row + "]" + "[" + col + "] = " + original[2 - row][col] + "\t");
            }
            System.out.println();
        }
        return original;
    }

    public static int[][] flipArrayVertically(int[][] original) {
        int x = 3;
        int y = 5;

        for (int row = 0; row < x; row++) {
            for (int col = 0; col < y; col++) {
                System.out.print("[" + row + "]" + "[" + col + "] = " + original[row][4 - col] + "\t");
            }
            System.out.println();
        }
        return original;
    }

    public static int[][] reverseArray(int[][] original) {
        int x = 0;
        int y = 0;
        for (int row = 2; row >= x; row--) {
            for (int col = 4; col >= y; col--) {

                System.out.print("[" + Math.abs(2 - row) + "][" + Math.abs(4 - col) + "] = " + original[row][col] + "\t");

            }
            System.out.println();

        }
        return original;
    }

}
