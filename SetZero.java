//Write a program that sets an entire row and an entire column to zero if an element in the matrix is zero.
public class SetZero {
    public static void main(String args[]) {
        int[][] number = {{1, 2, 3}, {4, 0, 6}, {7, 8, 9}};
        boolean zeroFound = false;

        for (int index = 0; index < number.length; index++) {
            for (int i = 0; i < number[index].length; i++) {
                if (number[index][i] == 0) {
                    zeroFound = true;
                    break;
                }
            }
            if (zeroFound) break;
        }

        if (zeroFound) {
            for (int index = 0; index < number.length; index++) {
                for (int i = 0; i < number[index].length; i++) {
                    number[index][i] = 0;
                }
            }
        }

        for (int index = 0; index < number.length; index++) {
            for (int i = 0; i < number[index].length; i++) {
                System.out.print(number[index][i] + " ");
            }
            System.out.println();
        }
    }
}

