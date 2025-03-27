public class HairRunner{
	public static void main(String Args[]){
	
	Hair hair=new Hair();
	
	System.out.println("the default length of the hair is:" + hair.length);
	System.out.println("the default thickness of the hair is:" + hair.thickness);
	System.out.println("the default texture of the hair is:" + hair.texture);
	System.out.println("the default colour of the hair is:" + hair.colour);

	hair.length = "50 cm";
    hair.thickness = 0.5;
    hair.texture = "curly";
    hair.colour = "black";
    System.out.println("the updated length of the hair is:" + hair.length);
	System.out.println("the updated thickness of the hair is:" + hair.thickness);
	System.out.println("the updated texture of the hair is:" + hair.texture);
	System.out.println("the updated colour of the hair is:" + hair.colour);


	}
}