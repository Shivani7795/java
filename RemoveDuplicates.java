// Write a program to remove all duplicate elements in the given array
public class RemoveDuplicates {
  public static void main(String[] args) {
    int[] array = {10, 20, 10, 30, 40, 20, 50};

    int[] uniqueArray = new int[array.length];
    int uniqueCount = 0;

    for (int i = 0; i < array.length; i++) {
      boolean isDuplicate = false;

      for (int j = 0; j < uniqueCount; j++) {
        if (array[i] == uniqueArray[j]) {
          isDuplicate = true;
          break;
        }
      }

      if (!isDuplicate) {
        uniqueArray[uniqueCount++] = array[i];
      }
    }


    System.out.print("Array after removing duplicates: ");
    for (int i = 0; i < uniqueCount; i++) {
      System.out.print(uniqueArray[i] + " ");
    }
  }
}
