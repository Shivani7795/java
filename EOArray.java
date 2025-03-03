public class EOArray{
    public static void main(String[] args) {
        int[] num = {2, 4, 10, 90, 3, 7, 5, 6};
        
        int e = 0, o = 0; 

        for (int i : num) {
            if (i % 2 == 0) {
                e++; 
            } else {
                o++; 
            }
        }

        System.out.println("Even Count: " + e);
        System.out.println("Odd Count: " + o);
    }
}
