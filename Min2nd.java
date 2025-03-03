//Find the 2n Minimun element in the given array
public class Min2nd{
  public static void main(String[] args){
	int []a={60,50,30,40};
	

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
System.out.println(":"+ a[1]);
}
}