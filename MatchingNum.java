public class MatchingNum{
    public static void main(String[] args) {
        int[] numbers = {2, 4, 10, 90, 4, 6};
        int target = 8;
        
        System.out.println("the sum is: " + target + ":");
        findPairs(numbers, target);
    }

    public static void findPairs(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("[" + arr[i] + ", " + arr[j] + "]");
                }
            }
        }
    }
}
