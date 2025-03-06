public class MatrixRowSum{
	public static void main(String args[]){
	int [][]number = {{1,2,3},{4,5,6},{7,8,9}};

	for (int index = 0; index < number.length; index++) {
    int sumRow = 0;
    for (int i = 0; i < number[index].length; i++) {
        sumRow += number[index][i];
        System.out.println(number[index][i] + " ");
	}
		System.out.println();
		System.out.println("the sum of array is:" + sumRow);
		System.out.println("---------------");

	}
		
}
}
