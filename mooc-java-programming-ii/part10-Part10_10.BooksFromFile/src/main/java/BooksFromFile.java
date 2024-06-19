
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // test your method here

  }

  public static List<Book> readBooks(String file) {
    List<Book> result = new ArrayList<>();
    try {
      Files.lines(Paths.get(file)).forEach(line -> {
        String[] parts = line.split(",");
        if (parts.length == 4) {
          String name = parts[0];
          int publishingYear = Integer.parseInt(parts[1]);
          int pageCount = Integer.parseInt(parts[2]);
          String author = parts[3];
          result.add(new Book(name, publishingYear, pageCount, author));
        }
      });
    } catch (Exception e) {
      System.out.println("Error " + e.getMessage());
    }
    return result;
  }

}
