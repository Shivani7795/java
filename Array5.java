public class Array5 {
	public static void main(String[] args){
	int a[]={1, 2, 3, 4, 20,15,17};
    int k = 3;
	int temp=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		int largest = a[a.length - k]; 
		System.out.println("The " + k + "th largest number is: " + largest);
	}
}

