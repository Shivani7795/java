public class Largest2{
  public static void main(String[] args){
	int []a={60,30,40};
	

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
System.out.println(":"+ a[a.length-2]);
}
}