public class CraneRunner{
	public static void main(String Args[]){
	
	Crane crane=new Crane();
	
	System.out.println("the default length of the crane is:" + crane.length);
	System.out.println("the default type of the crane is:" + crane.type);
	System.out.println("the default weight of the crane is:" + crane.weight);
	System.out.println("the default price of the crane is:" + crane.price);

	crane.length = "100 m";
    crane.type = "gantry";
    crane.weight = "54000";
    crane.price = "100000";
    System.out.println("the updated length of the crane is:" + crane.length);
	System.out.println("the updated type of the crane is:" + crane.type);
	System.out.println("the updated weight of the crane is:" + crane.weight);
	System.out.println("the updated price of the crane is:" + crane.price);


	}
}