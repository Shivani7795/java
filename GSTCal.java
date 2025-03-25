public class GSTCal {
	public static void CalGST(String item1, String item2){
		System.out.println(item1);
		System.out.println(item2);
	}
	
	public static void CalGST(int price1, int price2){
		System.out.println(price1);
		System.out.println(price2);
	}

	public static void CalGST(String brandName, String item1 , int price){
		System.out.println(brandName);
		System.out.println(item1);
		System.out.println(price);
	}

	public static void CalGST(double price){
    	double gst=price * 0.18;
    	System.out.println("GST for the amount " + price + " is: " + gst);
	}
	
    public static void CalGST(double price, double discount) {
        double discounted = price * 0.5;
        double discountedprice = price - discount;
        double AfterDiscount = discountedprice * 0.18;
        System.out.println("the discount before GST" + discounted);
        System.out.println("discountedprice " + discountedprice );
        System.out.println("GST after GST " + AfterDiscount);
    }

    public static void CalGST(double[] prices, String[] items) {
        if (prices.length == items.length) {
            for (int i = 0; i < items.length; i++) {
                System.out.println(items[i] + ": " + prices[i]);
            }
        }
    }

	public static void CalGST(double totalAmount,String couponCode,String item){
		double discount = 0;
		if (couponCode.equals("2024UT0!")) {
        	discount = totalAmount * 0.25; 
        } else if (couponCode.equals("202345hdg") && item.equals("t-shirt")) {
        	discount = totalAmount * 0.333;
        } else {
    	    discount = totalAmount * 0.10;
        }
        double discountedAmount = totalAmount - discount;
        System.out.println("Total Amount after GST: " + totalAmount);
        System.out.println("Discount Applied: " + discount);
        System.out.println("Final Amount after Discount: " + discountedAmount);
    }

    public static void CalGST(int[] array1, int[] array2, int[] array3) {
    System.out.print("Common numbers: ");
    for (int i = 0; i < array1.length; i++) {
        boolean foundInArray2 = false;
        boolean foundInArray3 = false;

        for (int j = 0; j < array2.length; j++) {
            if (array1[i] == array2[j]) {
                foundInArray2 = true;
                break;
            }
        }
        for (int k = 0; k < array3.length; k++) {
            if (array1[i] == array3[k]) {
                foundInArray3 = true;
                break;
            }
        }
            if (foundInArray2 && foundInArray3) {
                System.out.print(array1[i] + " ");
            }
        }
    }


    
}


    

   
