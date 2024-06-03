
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Archive> listOfArchives = new ArrayList<>();

    while (true) {
      System.out.println("Identifier? (empty will stop)");
      String identifier = scanner.nextLine();

      if (identifier.isEmpty()) {
        break;
      }

      System.out.println("Name? (empty will stop)");
      String name = scanner.nextLine();

      if (name.isEmpty()) {
        break;
      }

      Archive item = new Archive(identifier, name);
      if (listOfArchives.contains(item)) {
        continue;
      } else {
        listOfArchives.add(item);
      }
    }

    System.out.println("==Items==");

    for (Archive item : listOfArchives) {
      System.out.println(item.getIdentifier() + ": " + item.getName());
    }
  }
}
