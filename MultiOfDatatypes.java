public class MultiOfDatatypes{
	public static void multi(int a,int b){
		System.out.println("the multiplication is:" + (a * b));
	}
	public static void multi(int a,byte b){
		System.out.println("the multiplication is:" + (a * b));
	}
	public static void multi(int a,short b){
		System.out.println("the multiplication is:" + (a * b));
	}
	public static void multi(int a,long b){
		System.out.println("the multiplication is:" + (a * b));
	}
	public static void multi(int a,double b){
		System.out.println("the multiplication is:" + (a * b));
	}
	public static void multi(int a,float b){
		System.out.println("the multiplication is:" + (a * b));
	}
	public static void multi(byte a,int b){
		System.out.println("the multiplication is:" + (a * b));
	}
	public static void multi(byte a,short b){
		System.out.println("the multiplication is:" + (a * b));
	}
	public static void multi(long a,long b){
		System.out.println("the multiplication is:" + (a * b));
	}
	public static void multi(double a,double b){
		System.out.println("the multiplication is:" + (a * b));
	}
	public static void main(String args[]){
		multi(2,2);
		multi(3,(byte)3);
		multi(4,(short)4);
		multi(5,5l);
		multi(6,6.0);
		multi(7,7f);
		multi((byte)8,8);
		multi((byte)9,(short)9);
		multi(10l,10l);
		multi(20.0,20.0);
	}

}