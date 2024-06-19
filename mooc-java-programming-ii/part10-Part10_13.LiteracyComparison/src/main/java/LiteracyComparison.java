
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LiteracyComparison {

  public static void main(String[] args) {
    orderedLiteracyRate();
  }

  public static void orderedLiteracyRate() {
    List<CountryLiteracy> result = new ArrayList<>();

    try {
      result = Files.lines(Paths.get("literacy.csv"))
          .map(row -> row.replaceAll("\\s*,\\s*", ","))
          .map(row -> row.split(","))
          .filter(parts -> parts.length >= 6)
          .map(parts -> new CountryLiteracy(parts[0], parts[1], parts[2].replaceAll("\\s*\\(.*\\)\\s*", ""), parts[3],
              Integer.parseInt(parts[4]),
              Double.parseDouble(parts[5])))
          .sorted((a, b) -> Double.compare(a.getLiteracyPercent(), b.getLiteracyPercent()))
          .collect(Collectors.toList());

    } catch (IOException e) {
      System.out.println("Error reading file: " + e.getMessage());
    } catch (NumberFormatException e) {
      System.out.println("Error parsing number: " + e.getMessage());
    }
    result.forEach(country -> System.out.println(country));
  }
}
