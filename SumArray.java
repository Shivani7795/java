public class SumArray{
	static int sum;
	public static void main(String[] args){
		int[] num={1,2,3,4};
		int target=10;
        for(int i=0; i < num.length ;i++){
		sum += num[i];
	}
		if(sum == target)
			System.out.println("the target value is equals to the sum of all the array elements");
		else
			System.out.println("the target value is not equals to the sum of all the array elements");
	}
}