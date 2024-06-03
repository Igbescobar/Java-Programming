
import java.util.Scanner;

public class Cubes {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      String valueString = scanner.nextLine();
      if (valueString.equals("end")) {
        break;
      }
      int value = Integer.valueOf(valueString);
      System.out.println(value * value * value);
    }
  }
}
