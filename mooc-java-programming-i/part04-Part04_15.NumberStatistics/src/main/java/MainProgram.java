
import java.util.Scanner;

public class MainProgram {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Statistics sum = new Statistics();
    Statistics sumEven = new Statistics();
    Statistics sumOdd = new Statistics();
    while (true) {
      System.out.println("Enter numbers: ");
      int value = Integer.valueOf(scanner.nextLine());
      if (value == -1) {
        break;
      }
      sum.addNumber(value);
      if (value % 2 == 0) {
        sumEven.addNumber(value);
      } else {
        sumOdd.addNumber(value);
      }
    }
    System.out.println("Sum:" + sum.sum());
    System.out.println("Sum of even numbers:" + sumEven.sum());
    System.out.println("Sum of odd numbers:" + sumOdd.sum());

    // you can write test code here
    // however, remove all unnecessary code when doing the final parts of the
    // exercise

    // In order for the tests to work, the objects must be created in the
    // correct order in the main program. First the object that tracks the total
    // sum, secondly the object that tracks the sum of even numbers,
    // and lastly the one that tracks the sum of odd numbers!
  }
}
