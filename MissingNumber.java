//write a logic to find the missing number in the given array
//input: {2,4,5}
//out put: {2,3,4,5} or 3
public class MissingNumber {
  public static void main(String[] args) {
    int[] array = {2, 4, 5};

    Arrays.sort(array); 

    System.out.print("Missing number(s): ");
    for (int i = array[0]; i <= array[array.length - 1]; i++) {
      boolean found = false;
      for (int j = 0; j < array.length; j++) {
        if (array[j] == i) {
          found = true;
          break;
        }
      }
      if (!found) {
        System.out.print(i + " ");
      }
    }
  }
}
