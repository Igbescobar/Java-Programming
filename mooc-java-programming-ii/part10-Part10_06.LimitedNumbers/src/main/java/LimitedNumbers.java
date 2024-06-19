
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> values = new ArrayList<>();

    while (true) {
      int userInput = Integer.valueOf(scanner.nextLine());
      if (userInput < 0) {
        break;
      }
      values.add(userInput);
    }

    values.stream()
        .filter(s -> s >= 1 && s <= 5)
        .forEach(number -> System.out.println(number));
  }
}
