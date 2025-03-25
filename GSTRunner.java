public class GSTRunner{	

	public static void main(String args[]){
    GSTCal.CalGST("cloth","bags");
    GSTCal.CalGST(200,300);
    GSTCal.CalGST("Frill and Thrill","a", 200);
    GSTCal.CalGST(200.0);
    GSTCal.CalGST(200.0 , 0.5);
    double[] prices = {200.0, 300.0, 150.0}; 
    String[] items = {"Cloth", "Shoes", "Hat"};
    GSTCal.CalGST(prices, items);
    GSTCal.CalGST(500, "2024UT0!", "cloth");
    int[] array1 = {1, 3};
    int[] array2 = {1, 4, 3};
    int[] array3 = {3, 7, 8, 9};
    GSTCal.CalGST(array1, array2, array3);
	}
}