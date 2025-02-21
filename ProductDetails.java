public class ProductDetails{
	public static void main(String args[]){
	String productName = "TV";
	int price = 45000;
	int discount = 15;
	String brandName = "Samsung";
	byte gst = 6;
	int donation = 1000;
	int deliveryFees = 500;
	int platformFees= 100;
	double total = (price - (discount/100)) + gst + deliveryFees + platformFees;
	double totalwithoutgst = (price - (discount/100)) + deliveryFees + donation + platformFees;
	double actualamount =  (price -(discount / 100)) ;
	System.out.println("The Product Name:" + productName);
	System.out.println("Price of the Product:" + price);
	System.out.println("Discount is:" + discount);
	System.out.println("The Brand Name is:" + brandName);
	System.out.println("GST for the Product is: " + gst);
	System.out.println("Donation:" + donation);
	System.out.println("Delivery fees :" + deliveryFees);
	System.out.println("Platform fees:" + platformFees);
	System.out.println("Total Payable Amount:" + total );
	System.out.println("total Payable amount without GST :" + totalWithoutGst);
	System.out.println("Actual payable amount:" + actualamount);
	}
}