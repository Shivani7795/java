//Write a program to find the largest element in each row of a array.
public class LargestElementInEachRow {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {9, 5, 6},
            {7, 8, 4}
        };

        for (int i = 0; i < matrix.length; i++) {
            int maxInRow = matrix[i][0];
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxInRow) {
                    maxInRow = matrix[i][j];
                }
            }
            System.out.println("The largest element in row " + (i + 1) + " is: " + maxInRow);
        }
    }
}
