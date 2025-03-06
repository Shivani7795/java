//write a program to find sum of a specific row.
public class SpecificRowSum {
    public static void main(String[] args) {
        // Defining a matrix
        int[][] matrix = {{1, 2, 3},{4, 5, 6},{7, 8, 9}
        };

        int rowIndex = 1;
        
        int rowSum ;

        
        for (int i = 0; i < matrix[rowIndex].length; i++) {
            rowSum += matrix[rowIndex][i];
        }

        System.out.println("The sum of row " + (rowIndex + 1) + " is: " + rowSum);
    }
}
