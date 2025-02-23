public class Palindrome{
	public static void main(String[] args) {
		int palindrome=12326;
		String st=""+palindrome;
		if(st.equals(new StringBuilder(st).reverse().toString())){
			System.out.println("The number is palindrome");
		}
		else{
			System.out.println("The number is not a Palindrome");
		}
	}
}