public class ProductDetailsShopping{
	public static void main(String args[]){
		double crayons=50;
		double paint=50;
		double drawingBook=100;
		double totalBill=crayons+paint+drawingBook;
		double totalBillAD=totalBill/100*10;
		if (totalBill<100){
			System.out.println("The Total Bill of Shopping cart is" +totalBill);
		}
		else{
			System.out.println("The Total Bill of Shopping cart after 10% is" + (totalBill-totalBillAD));
		}
	}
}