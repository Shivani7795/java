//Write a program to find the row in a matrix that has the maximum sum of its elements.
public class MaxSumRow {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int maxSumRow = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            int currentRowSum = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                currentRowSum += matrix[i][j];
            }

            if (currentRowSum > maxSum) {
                maxSum = currentRowSum;
                maxSumRow = i;
            }
        }

        System.out.println("The row with the maximum sum is: " + (maxSumRow + 1));
    }
}





