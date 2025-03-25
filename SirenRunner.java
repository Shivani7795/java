public class SirenRunner{
	public static void main(String Args[]){
	
	Siren siren=new Siren();
	
	System.out.println("the default loudness of the siren is:" + siren.loudness);
	System.out.println("the default type of the siren is:" + siren.type);
	System.out.println("the default brand of the siren is:" + siren.brand);
	System.out.println("the default price of the siren is:" + siren.price);

	siren.loudness = "100 decibels";
    siren.type = "security siren";
    siren.brand = "Autonics";
    siren.price = "500";
    System.out.println("the updated loudness of the siren is:" + siren.loudness);
	System.out.println("the updated type of the siren is:" + siren.type);
	System.out.println("the updated brand of the siren is:" + siren.brand);
	System.out.println("the updated price of the siren is:" + siren.price);


	}
}