//Find all unique triplets in an array that sum up to a given number.
public class FindTriplets {
  public static void main(String[] args) {
    int[] array = {1, 2, -1, 0, -2, 1, 2};
    int targetSum = 2; // Change this to the desired sum


    for (int i = 0; i < array.length - 1; i++) {
      for (int j = 0; j < array.length - 1 - i; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }

    System.out.println("Unique triplets that sum up to " + targetSum + ":");
    for (int i = 0; i < array.length - 2; i++) {
      if (i > 0 && array[i] == array[i - 1]) {
        continue;
      }
      int left = i + 1;
      int right = array.length - 1;

      while (left < right) {
        int sum = array[i] + array[left] + array[right];

        if (sum == targetSum) {
          System.out.println(array[i] + ", " + array[left] + ", " + array[right]);
          left++;
          right--;

          while (left < right && array[left] == array[left - 1]) {
            left++;
          }
          while (left < right && array[right] == array[right + 1]) {
            right--;
          }
        } else if (sum < targetSum) {
          left++;
        } else {
          right--;
        }
      }
    }
  }
}
