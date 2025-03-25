public class FloorRunner{
	public static void main(String Args[]){
	
	Floor floor=new Floor();
	

	System.out.println("the default Size of the floor is:" + floor.size);
	System.out.println("the default material of the floor is:" + floor.material);
	System.out.println("the default design of the floor is:" + floor.design);
	System.out.println("default Type of the room is:" + floor.room);

	floor.size = "100x100";
    floor.material = "Wood";
    floor.design = "Modern";
    floor.room = " kitchen";
    System.out.println("the updated Size of the floor is:" + floor.size);
	System.out.println("the updated material of the floor is:" + floor.material);
	System.out.println("the updated design of the floor is:" + floor.design);
	System.out.println("the updated Type of the room is:" + floor.room);


	}
}