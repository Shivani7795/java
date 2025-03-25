public class ShirtRunner{
	public static void main(String Args[]){
	
	Shirt shirt=new Shirt();
	
	System.out.println("the default Size of the shirt is:" + shirt.size);
	System.out.println("the default material of the shirt is:" + shirt.material);
	System.out.println("the default brand of the shirt is:" + shirt.brand);
	System.out.println("the default colour of the shirt is:" + shirt.colour);

	shirt.size = "s";
    shirt.material = "cotton";
    shirt.brand = "max";
    shirt.colour = "pink";
    System.out.println("the updated Size of the shirt is:" + shirt.size);
	System.out.println("the updated material of the shirt is:" + shirt.material);
	System.out.println("the updated brand of the shirt is:" + shirt.brand);
	System.out.println("the updated colour of the shirt is:" + shirt.colour);


	}
}