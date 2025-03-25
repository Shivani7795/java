public class DivisionOfDatatypes{
	public static void division(int a,int b){
		System.out.println("the Division is:" + (a / b));
	}
	public static void division(int a,byte b){
		System.out.println("the Division is:" + (a / b));
	}
	public static void division(int a,short b){
		System.out.println("the Division is:" + (a / b));
	}
	public static void division(int a,long b){
		System.out.println("the Division is:" + (a / b));
	}
	public static void division(int a,double b){
		System.out.println("the Division is:" + (a / b));
	}
	public static void division(int a,float b){
		System.out.println("the Division is:" + (a / b));
	}
	public static void division(byte a,int b){
		System.out.println("the Division is:" + (a / b));
	}
	public static void division(byte a,short b){
		System.out.println("the Division is:" + (a / b));
	}
	public static void division(long a,long b){
		System.out.println("the Division is:" + (a / b));
	}
	public static void division(double a,double b){
		System.out.println("the Division is:" + (a / b));
	}
	public static void main(String args[]){
		division(2,2);
		division(3,(byte)3);
		division(4,(short)4);
		division(5,5l);
		division(6,6.0);
		division(7,7f);
		division((byte)8,8);
		division((byte)9,(short)9);
		division(10l,10l);
		division(20.0,20.0);
	}

}