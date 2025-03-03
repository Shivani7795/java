//find the frequency of the each elements
//input: {2,2,3,4,5,6,6,3}
//output: 2-2,3-2,4-1,6-2
public class ElementFrequency {
  public static void main(String[] args) {
    int[] array = {2, 2, 3, 4, 5, 6, 6, 3};


    for (int i = 0; i < array.length; i++) {
      int count = 1;
      if (array[i] != -1) { 
        for (int j = i + 1; j < array.length; j++) {
          if (array[i] == array[j]) {
            count++;
            array[j] = -1; 
          }
        }
        System.out.print(array[i] + "-" + count + " ");
      }
    }
  }
}