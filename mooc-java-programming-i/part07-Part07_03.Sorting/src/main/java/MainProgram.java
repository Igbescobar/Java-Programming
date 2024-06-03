import java.util.Arrays;

public class MainProgram {

  public static void main(String[] args) {
    // write your test code here
    int[] numbers = { 8, 3, 7, 9, 1, 2, 4 };

    MainProgram.sort(numbers);

  }

  public static int smallest(int[] array) {
    int smallestValue = array[0];
    for (int value : array) {
      if (smallestValue > value) {
        smallestValue = value;
      }
    }
    return smallestValue;
  }

  public static int indexOfSmallest(int[] array) {
    int smallest = smallest(array);
    int index = 0;
    for (int i = 0; i < array.length; i++) {
      if (smallest == array[i]) {
        index = i;
      }
    }
    return index;
  }

  public static int indexOfSmallestFrom(int[] table, int startIndex) {
    int smallest = table[startIndex];
    int index = startIndex;
    for (int i = startIndex; i < table.length; i++) {
      if (smallest > table[i]) {
        smallest = table[i];
        index = i;
      }
    }
    return index;
  }

  public static void swap(int[] array, int index1, int index2) {
    int firstValue = array[index1];
    int secondValue = array[index2];

    array[index2] = firstValue;
    array[index1] = secondValue;
  }

  public static void sort(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println(Arrays.toString(array));
      int smallest = indexOfSmallestFrom(array, i);
      swap(array, i, smallest);
      System.out.println(Arrays.toString(array));

    }
  }

}
