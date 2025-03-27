public class JamoonRunner{
	public static void main(String Args[]){
	
	Jamoon jamoon=new Jamoon();
	
	System.out.println("the default Size of the jamoon is:" + jamoon.size);
	System.out.println("the default type of the jamoon is:" + jamoon.type);
	System.out.println("the default flavour of the jamoon is:" + jamoon.flavour);
	System.out.println("the default colour of the jamoon is:" + jamoon.colour);

	jamoon.size = 2;
    jamoon.type = "kala jamun";
    jamoon.flavour = "rose";
    jamoon.colour = "dark brown";
    System.out.println("the updated Size of the jamoon is:" + jamoon.size);
	System.out.println("the updated type of the jamoon is:" + jamoon.type);
	System.out.println("the updated flavour of the jamoon is:" + jamoon.flavour);
	System.out.println("the updated colour of the jamoon is:" + jamoon.colour);


	}
}