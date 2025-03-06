//write a program to find row with maximum number
public class MatrixMaxRow {
    public static void main(String args[]) {
        int[][] number = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        int maxRow = 0;
        int maxElement = number[0][0];

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                if (number[i][j] > maxElement) {
                    maxElement = number[i][j];
                    maxRow = i;
                }
            }
        }
        System.out.println("The row with the maximum element is: " + (maxRow + 1));
    }
}
