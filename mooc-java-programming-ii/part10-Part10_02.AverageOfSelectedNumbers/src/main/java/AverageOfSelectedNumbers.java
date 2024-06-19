
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> allInputs = new ArrayList<>();

    while (true) {
      String userInput = scanner.nextLine();
      if (userInput.equals("end")) {
        break;
      }
      allInputs.add(userInput);
    }
    System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
    String negativeOrPositive = scanner.nextLine();

    double average = 0;

    if (negativeOrPositive.equals("n")) {
      average = allInputs.stream()
          .mapToDouble(s -> Integer.valueOf(s))
          .filter(s -> s < 0)
          .average()
          .getAsDouble();
    } else {
      average = allInputs.stream()
          .mapToDouble(s -> Integer.valueOf(s))
          .filter(s -> s > 0)
          .average()
          .getAsDouble();
    }

    System.out.println("average of the numbers: " + average);

  }
}
