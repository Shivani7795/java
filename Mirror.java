public class Mirror{
  int mno;
	double length;
	double width;
	double thickness;
	String brand;
	String material;
	String shape;
	String colour;
	String mirrortype;
	String frameDesign;
	double weight;
	String usedfor;
	int warranty;
	String corner;
	String fixingtype;
	double price;
	double tax;
	String availablein;
	String  ownerName;
	String buyerName;

    public Mirror(int mno, double length, double width, double thickness, String brand, String material, String shape,
                  String colour, String mirrortype, String frameDesign, double weight, String usedfor, int warranty,
                  String corner, String fixingtype, double price, double tax, String availablein, String ownerName,
                  String buyerName) {
        this.mno = mno;
        this.length = length;
        this.width = width;
        this.thickness = thickness;
        this.brand = brand;
        this.material = material;
        this.shape = shape;
        this.colour = colour;
        this.mirrortype = mirrortype;
        this.frameDesign = frameDesign;
        this.weight = weight;
        this.usedfor = usedfor;
        this.warranty = warranty;
        this.corner = corner;
        this.fixingtype = fixingtype;
        this.price = price;
        this.tax = tax;
        this.availablein = availablein;
        this.ownerName = ownerName;
        this.buyerName = buyerName;
    }

    public void mirrorDetails() {
        System.out.println("Mirror Details:");
        System.out.println("Mirror Number: " + mno);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Thickness: " + thickness);
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Shape: " + shape);
        System.out.println("Colour: " + colour);
        System.out.println("Mirror Type: " + mirrortype);
        System.out.println("Frame Design: " + frameDesign);
        System.out.println("Weight: " + weight);
        System.out.println("Used For: " + usedfor);
        System.out.println("Warranty: " + warranty);
        System.out.println("Corner Style: " + corner);
        System.out.println("Fixing Type: " + fixingtype);
        System.out.println("Price: " + price);
        System.out.println("Tax: " + tax);
        System.out.println("Available In: " + availablein);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Buyer Name: " + buyerName);
    }
}