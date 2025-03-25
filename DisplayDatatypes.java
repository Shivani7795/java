public class DisplayDatatypes{
	public static void display(int a){
		System.out.println("the value of int datatype is:"+ a);
	}
	public static void display(byte a){
		System.out.println("the value of byte datatype is:"+ a);
	}
	public static void display(short a){
		System.out.println("the value of short datatype is:"+ a);
	}
	public static void display(long a){
		System.out.println("the value of long datatype is:"+ a);
	}
	public static void display(double a){
		System.out.println("the value of double datatype is:"+ a);
	}
	public static void display(float a){
		System.out.println("the value of float datatype is:"+ a);
	}
	public static void display(int a , byte b){
		System.out.println("the value of int and byte datatype are:"+ a +" and " +b);
	}
	public static void display(int a , short b){
		System.out.println("the value of int and short datatype are:"+ a + " and " + b);
	}
	public static void display(int a , int b){
		System.out.println("the value of 2 int datatype are:"+ a +" and " +b);
	}
	public static void display(int a , double b){
		System.out.println("the value of int and double datatype are:" + a + " and " +b);
	}

	public static void main(String args[]){
		display(24);
		display((byte)2);
		display((short)12);
		display(456l);
		display(40.0);
		display(50.0f);
		display(10,(byte)20);
		display(10,(short)20);
		display(10,20);
		display(10,20.0);
	}
} 