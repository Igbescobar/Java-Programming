
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("File? ");
    String file = scanner.nextLine();
    System.out.print("Lower bound? ");
    int lowerBound = Integer.valueOf(scanner.nextLine());
    System.out.print("Upper bound? ");
    int upperBound = Integer.valueOf(scanner.nextLine());

    ArrayList<Integer> list = new ArrayList<>();
    try (Scanner scan = new Scanner(Paths.get(file))) {
      while (scan.hasNextLine()) {
        list.add(Integer.valueOf(scan.nextLine()));
      }
    } catch (Exception e) {
      System.out.println("File " + file + " did capput.");
    }
    int count = 0;
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) >= lowerBound && list.get(i) <= upperBound) {
        count++;
      }
    }
    System.out.println("Numbers: " + count);
  }

}
