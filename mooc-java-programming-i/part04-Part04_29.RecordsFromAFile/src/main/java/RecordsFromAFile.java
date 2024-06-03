
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordsFromAFile {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Name of the file: ");
    String file = scanner.nextLine();

    ArrayList<String> list = new ArrayList<>();

    try (Scanner scan = new Scanner(Paths.get(file))) {
      while (scan.hasNextLine()) {
        list.add(scan.nextLine());
      }
    } catch (Exception e) {
      System.out.println("Peto gordito");
    }
    for (String person : list) {
      String[] parts = person.split(",");

      String name = parts[0];
      int age = Integer.valueOf(parts[1]);
      if (age == 1) {
        System.out.println(name + ", age: " + age + " year");
      } else {
        System.out.println(name + ", age: " + age + " years");
      }
    }
  }
}
