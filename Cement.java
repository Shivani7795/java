public class Cement{
	String name;
	int no_packs;
	double weight;
	String brand;
	int settingtime;
	int heathydration;
	int ignitionloss;
	int density;
	String ownername;
	String buyername;

	public Cement(){

	}
	public Cement(String name){
		this.name=name;
	}
	public Cement(String name,int no_packs){
		this(name);
		this.no_packs=no_packs;
	}
	public Cement(String name,int no_packs ,double weight){
		this(name,no_packs);
		this.weight=weight;
	}
	public Cement(String name,int no_packs ,double weight,String brand){
		this(name,no_packs,weight);
		this.brand=brand;
	}
	public Cement(String name,int no_packs ,double weight,String brand,int settingtime){
		this(name,no_packs,weight,brand);
		this.settingtime=settingtime;
	}
	public Cement(String name,int no_packs ,double weight,String brand,int settingtime,int heathydration){
		this(name,no_packs,weight,brand,settingtime);
		this.heathydration=heathydration;
	}
	public Cement(String name,int no_packs ,double weight,String brand,int settingtime,int heathydration,int ignitionloss){
		this(name,no_packs,weight,brand,settingtime,heathydration);
		this.ignitionloss=ignitionloss;
	}
	public Cement(String name,int no_packs ,double weight,String brand,int settingtime,int heathydration,int ignitionloss,int density){
		this(name,no_packs,weight,brand,settingtime,heathydration,ignitionloss);
		this.density=density;
	}
	public Cement(String name,int no_packs ,double weight,String brand,int settingtime,int heathydration,int ignitionloss,int density,String ownernam){
		this(name,no_packs,weight,brand,settingtime,heathydration,ignitionloss,density);
		this.ownername=ownername;
	}
	public Cement(String name,int no_packs ,double weight,String brand,int settingtime,int heathydration,int ignitionloss,int density,String ownername
,String buyername){
		this(name,no_packs,weight,brand,settingtime,heathydration,ignitionloss,density,ownername);
		this.buyername=buyername;
	}
	public void info() {
        System.out.println("Cement Details:");
        System.out.println("Name: " + name);
        System.out.println("Number of Packs: " + no_packs);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Brand: " + brand);
        System.out.println("Setting Time: " + settingtime + " minutes");
        System.out.println("Heat of Hydration: " + heathydration + " units");
        System.out.println("Ignition Loss: " + ignitionloss + "%");
        System.out.println("Density: " + density + " kg/m³");
        System.out.println("Owner Name: " + ownername);
        System.out.println("Buyer Name: " + buyername);
        System.out.println("---------------------");





	}
}

