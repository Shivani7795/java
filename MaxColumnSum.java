// Find the column with the maximum sum in a matrix.
public class MaxColumnSum {
    public static void main(String[] args) {
        // Define the matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int maxSum = Integer.MIN_VALUE; 
        int maxColumn = -1; 
        
        for (int j = 0; j < matrix[0].length; j++) {
            int columnSum = 0; // Sum of the current column
            for (int i = 0; i < matrix.length; i++) {
                columnSum += matrix[i][j]; 
            }
            
            if (columnSum > maxSum) {
                maxSum = columnSum;
                maxColumn = j;
            }
        }

        System.out.println("Column with the maximum sum: " + maxColumn);
        System.out.println("Maximum sum: " + maxSum);
    }
}
