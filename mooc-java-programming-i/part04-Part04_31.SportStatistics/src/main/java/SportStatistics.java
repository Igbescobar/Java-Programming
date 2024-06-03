
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("File:");
    String file = scan.nextLine();
    System.out.println("Team:");
    String team = scan.nextLine();
    int count = 0;
    int wins = 0;
    int looses = 0;

    ArrayList<String> list = new ArrayList<>();
    try (Scanner scanner = new Scanner(Paths.get(file))) {
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        list.add(line);
        String[] parts = line.split(",");
        String homeTeam = parts[0];
        String awayTeam = parts[1];
        int homeScore = Integer.valueOf(parts[2]);
        int awayScore = Integer.valueOf(parts[3]);
        if (homeTeam.equals(team)) {
          count++;
          if (homeScore > awayScore) {
            wins++;
          } else {
            looses++;
          }
        }
        if (awayTeam.equals(team)) {
          count++;
          if (awayScore > homeScore) {
            wins++;
          } else {
            looses++;
          }
        }
      }
      System.out.println("Games: " + count);
      System.out.println("Wins: " + wins);
      System.out.println("Losses: " + looses);
    } catch (Exception e) {
      System.out.println("Fiesta");
    }
  }
}
