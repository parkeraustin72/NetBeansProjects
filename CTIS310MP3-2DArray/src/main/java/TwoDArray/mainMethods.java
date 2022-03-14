package TwoDArray;

public class mainMethods extends main {

    public static void printArray(int[][] array) {

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {

                System.out.print("[" + row + "][" + col + "] = " + array[row][col] + "\t");

            }
            System.out.println();

        }
    }

    public static int[][] transposeArray(int[][] original) {

        int[][] temp = new int[original[0].length][original.length];
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[0].length; j++) {
                temp[j][i] = original[i][j];
            }
        }
        return temp;
    }

    public static void printArray(double[][] array) {

    }

    public static int getTotal(int[][] array) {
        int total = 0;

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                total = total + array[row][col];

            }
        }

        return total;
    }

    public static int getAverage(int[][] array) {
        int getaverage = 0;
        int total = 0;
        int matrixC = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                total = total + array[row][col];
                matrixC++;
            }
        }
        getaverage = total / matrixC;
        return getaverage;
    }

    public static int getRowTotal(int[][] array, int row) {
        int total = 0;
        for (int j = 0; j < array[row].length; j++) {
            total += array[row][j];
        }
        return total;
    }

    public static int getColumnTotal(int[][] array, int col) {
        int total = 0;
        for (int row = 0; row < array.length; row += 1) {
            total += array[row][col];
        }
        return total;
    }

    public static int getHighestInRow(int[][] array, int row) {
        int highrow = 0;
        for (int j = 0; j < array[row].length; j++) {
            if (highrow < array[row][j]) {
                highrow = array[row][j];
            } else {
                break;
            }
        }
        return highrow;
    }

    public static int getLowestInRow(int[][] array, int row) {
        int lowrow = array[row][row];
        for (int j = 0; j < array[row].length; j++) {
            if (lowrow > array[row][j]) {
                lowrow = array[row][j];
            } else {
                break;
            }
        }
        return lowrow;
    }

}
