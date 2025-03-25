public class Array3 {

	public static void main(String args[]){
	int a[]={1, 2, 3, 4, 20,15,17};
    int k=3;
    for(int i=0;i<a.length;i++){
    for (int j=0;j<a.length-1;j++){
		if(a[i]<a[j+1])

    	a[i]=a[j+1];
    	a[j+1]=k;
    	k=a[i];
		
    		System.out.println(":"+k);
    		}
		}
	}
}
