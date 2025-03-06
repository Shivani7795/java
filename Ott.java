public class Ott {
    public static void main(String[] args) {
        int[] a = {9, 9, 9};
        
        for (int index = a.length - 1; index >= 0; index--) {
            a[index] = a[index] + 1;
            if (a[index] == 10) {
                a[index] = 0;
            } else {
                break;
            }
        }
        
        if (a[0] == 0) {
            System.out.print("Modified Array: [1");
            for (int i = 0; i < a.length; i++) {
                System.out.print(" "+a[i]);
            }
            System.out.println("]");
        } else {
            
            System.out.print("Modified Array: [");
            for (int i = 0; i < a.length; i++) {
                System.out.print(" "+a[i]);
            }
            System.out.println("]");
        }
    }
}
