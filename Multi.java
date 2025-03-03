public class Multi{
	static int multi;
	public static void main(String[] args){
		int[] num={1,2,3,4,5,6,7,8};
		int target=2;
		for(int i=0; i < num.length ;i++){
		    if(num[i]%target==0)
		    	multi++;
		}
		    	System.out.println("The count of multiple of the target value are:" +multi);
		    }
		}