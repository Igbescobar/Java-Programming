
import java.util.Scanner;

public class LiquidContainers {

  public static void main(String[] args) {
    Container first = new Container();
    Container second = new Container();
    Scanner scan = new Scanner(System.in);

    while (true) {
      System.out.println("First: " + first.toString());
      System.out.println("Second: " + second.toString());

      String input = scan.nextLine();
      String[] parts = input.split(" ");
      if (parts[0].equals("quit")) {
        break;
      } else if (parts[0].equals("add")) {

        int numberToAdd = Integer.parseInt(parts[1]);
        first.add(numberToAdd);
      } else if (parts[0].equals("move")) {

        int numberToMove = Integer.parseInt(parts[1]);
        int firstValue = first.remove(numberToMove);
        second.add(firstValue);
      } else if (parts[0].equals("remove")) {

        int numberToRemove = Integer.parseInt(parts[1]);
        second.remove(numberToRemove);
      }

    }
  }

}
