public class HangerRunner{
	public static void main(String Args[]){
	
	Hanger hanger=new Hanger();
	
	System.out.println("the default Size of the hanger is:" + hanger.size);
	System.out.println("the default material of the hanger is:" + hanger.material);
	System.out.println("the default shape of the hanger is:" + hanger.shape);
	System.out.println("the default weight of the hanger is:" + hanger.weight);

	hanger.size = 15;
    hanger.material = "steel";
    hanger.shape = "triangle";
    hanger.weight = 50;
    System.out.println("the updated Size of the hanger is:" + hanger.size);
	System.out.println("the updated material of the hanger is:" + hanger.material);
	System.out.println("the updated shape of the hanger is:" + hanger.shape);
	System.out.println("the updated weight of the hanger is:" + hanger.weight);


	}
}