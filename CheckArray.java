public class CheckArray{
	public static void main(String[] args){
		int[] num={1,2,3};
		int target=5;
		boolean found=false;

		for(int i = 0;i < num.length; i++){

		if(num[i] == target){
			found = true;
			break;
			}
		}
		if (found){
			System.out.println("The target number is present in a array");
		
		}
			else{
				System.out.println("The target number is not present in a array");
		}

	}
}
     
