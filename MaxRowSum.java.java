//Write a program to find the row in a matrix that has the maximum sum of its elements.
public class MatrixRowSum{
	public static void main(String args[]){
	int [][]number = {{1,2,3},{4,5,6},{7,8,9}};
	int max=0;
	int row = 0;

	for (int index = 0; index < number.length; index++) {
		int sum = 0;
		for (int i = 0; i < number[index].length; i++) {
			sum += number[index][i];
			if ( sum > max) {
                max = sum;
                row = index;
            }
        System.out.println("the row of maximum sum of its elements:" + row+1);
	}
		
		
		

	}
		
}
}





