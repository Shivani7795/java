public class Dustbin{
	int dno;
	double length;
	double width;
	double height;
	String brand;
	String colour;
	String material;
	String design;
	String shape;
	String cornertype;
	String captype;
	int no_wheel;
	String hangertype;
	int no_hanger;
	int compartment;
	String usedfor;
	String opentype;
	String wastetype;
	String ownername;
	String buyername;

    public Dustbin(int dno, double length, double width, double height, String brand, String colour, String material,
                   String design, String shape, String cornertype, String captype, int no_wheel, String hangertype,
                   int no_hanger, int compartment, String usedfor, String opentype, String wastetype,
                   String ownername, String buyername) {
        this.dno = dno;
        this.length = length;
        this.width = width;
        this.height = height;
        this.brand = brand;
        this.colour = colour;
        this.material = material;
        this.design = design;
        this.shape = shape;
        this.cornertype = cornertype;
        this.captype = captype;
        this.no_wheel = no_wheel;
        this.hangertype = hangertype;
        this.no_hanger = no_hanger;
        this.compartment = compartment;
        this.usedfor = usedfor;
        this.opentype = opentype;
        this.wastetype = wastetype;
        this.ownername = ownername;
        this.buyername = buyername;
    }

    public void dustbin() {
        System.out.println("Dustbin Details:");
        System.out.println("Dustbin Number: " + dno);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Brand: " + brand);
        System.out.println("Colour: " + colour);
        System.out.println("Material: " + material);
        System.out.println("Design: " + design);
        System.out.println("Shape: " + shape);
        System.out.println("Corner Type: " + cornertype);
        System.out.println("Cap Type: " + captype);
        System.out.println("Number of Wheels: " + no_wheel);
        System.out.println("Hanger Type: " + hangertype);
        System.out.println("Number of Hangers: " + no_hanger);
        System.out.println("Compartment: " + compartment);
        System.out.println("Used For: " + usedfor);
        System.out.println("Open Type: " + opentype);
        System.out.println("Waste Type: " + wastetype);
        System.out.println("Owner Name: " + ownername);
        System.out.println("Buyer Name: " + buyername);
    }
}