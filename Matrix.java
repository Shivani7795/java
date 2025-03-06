public class Matrix{
	public static void main(String args[]){
	int [][]number = {{1,2,3},{4,5,6},{7,8,9}};
	int sum = 0;

	for(int index=0;index<number.length; index++){
		for(int i = 0;i <number[index].length; i++){
			sum += number[index][i];
			System.out.println(number[index][i]+" ");
	}
		System.out.println();
		System.out.println("---------------");

	}
		System.out.println("the sum of array is:" + sum);
}
}
