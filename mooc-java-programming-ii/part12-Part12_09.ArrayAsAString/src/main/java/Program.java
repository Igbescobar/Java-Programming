
public class Program {

  public static void main(String[] args) {
    // Test your method here
    int[][] matrix = {
        { 0, 5, 0 },
        { 3, 0, 7 }
    };
    System.out.println(arrayAsString(matrix));
  }

  public static String arrayAsString(int[][] array) {
    StringBuilder numbers = new StringBuilder();
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        numbers.append(array[i][j]);
      }
      numbers.append("\n");
    }
    return numbers.toString();
  }

}
