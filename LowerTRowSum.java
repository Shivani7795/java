//write a jva program for sum of row in a lower triangular matrix.
public class LowerTRowSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 0},
            {4, 5, 0},
            {7, 8, 9}
        };

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j <= i; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("The sum of row " + (i + 1) + " is: " + rowSum);
        }
    }
}
