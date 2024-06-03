
import java.util.Scanner;

public class LiquidContainers {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int firstTankCurrentCapacity = 0;
    int secondTankCurrentCapacity = 0;
    int maximunCapacity = 100;

    while (true) {

      String input = scan.nextLine();
      if (input.equals("quit")) {
        break;
      }

      String[] parts = input.split(" ");
      String command = parts[0];
      int amount = Integer.valueOf(parts[1]);

      System.out.println("First: " + firstTankCurrentCapacity + "/" + maximunCapacity);
      System.out.println("Second:" + secondTankCurrentCapacity + "/" + maximunCapacity);

      if (command.equals("add")) {
        if (amount < 0) {
          continue;
        }
        if (firstTankCurrentCapacity + amount >= 100) {
          firstTankCurrentCapacity = 100;
        } else {
          firstTankCurrentCapacity += amount;
        }
      } else if (command.equals("move")) {
        if (amount > firstTankCurrentCapacity) {
          amount = firstTankCurrentCapacity;
        }
        firstTankCurrentCapacity -= amount;
        secondTankCurrentCapacity += amount;
        if (secondTankCurrentCapacity > 100) {
          secondTankCurrentCapacity = 100;
        }
      } else if (command.equals("remove")) {
        if (amount > secondTankCurrentCapacity) {
          amount = secondTankCurrentCapacity;
        }
        secondTankCurrentCapacity -= amount;
      }
    }
    System.out.println("First: " + firstTankCurrentCapacity + "/" + maximunCapacity);
    System.out.println("Second: " + secondTankCurrentCapacity + "/" + maximunCapacity);
  }

}
