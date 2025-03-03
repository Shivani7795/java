public class Message{
	public static void main(String[] args){
	long contactNumber=9876543210l;
	while(contactNumber!=0)
		long digit = contactNumber%10;
		contactNumber=contactNumber/10;
	
		System.out.println(digit);
		if(digit==1){
			System.out.println("hii");
		}
		else if(contactNumber==2){
			System.out.println("hello");
		}
		else if(contactNumber==3){
			System.out.println("I");
		}
		else if(contactNumber==4){
			System.out.println("am");
		}
		else if(contactNumber==5){
			System.out.println("ABC");
		}
		else if(contactNumber==6){
			System.out.println("this");
		}
		else if(contactNumber==7){
			System.out.println("is");
		}
		else if(contactNumber==8){
			System.out.println("me");
		}
		else if(contactNumber==9){
			System.out.println("and");
		}
		else if(contactNumber==0){
			System.out.println("you");
		}

	}
}
