import java.util.Scanner;

public class UserInterface {
  private Scanner scanner;
  private Score score;

  public UserInterface(Scanner scanner, Score score) {
    this.scanner = scanner;
    this.score = score;
  }

  public void start() {
    readUserInput();
    printAverage();
    printPassingAverage();
    printPassPercentage();
    printGradeDistribution();
  }

  public void readUserInput() {
    while (true) {
      System.out.println("Enter point totals, -1 stops:");
      int userInput = Integer.parseInt(scanner.nextLine());
      if (userInput == -1) {
        break;
      } else if (userInput >= 0 && userInput <= 100) {
        score.addScore(userInput);
      }
    }
  }

  public void printAverage() {
    System.out.println("Point average (all): " + score.calculateAverage(score.getScores()));
  }

  public void printPassingAverage() {
    if (score.calculateAveregeForPassingScores(score.getScores()) == 0) {
      System.out.println("Point average (passing): -");
    } else {
      System.out.println("Point average (passing): " + score.calculateAveregeForPassingScores(score.getScores()));
    }
  }

  public void printPassPercentage() {
    System.out.println("Pass percentage: " + score.calculatePassingPercentage(score.getScores()));
  }

  public void printStarts(int numberOfStarsToPrint) {
    for (int i = 0; i < numberOfStarsToPrint; i++) {
      System.out.print("*");
    }
    System.out.println();
  }

  public void printGradeDistribution() {
    score.findGradeDistribution(score.getScores());
    int[] grades = score.getGrades();
    System.out.println("Grade distribution:");
    System.out.print("5: ");
    printStarts(grades[5]);
    System.out.print("4: ");
    printStarts(grades[4]);
    System.out.print("3: ");
    printStarts(grades[3]);
    System.out.print("2: ");
    printStarts(grades[2]);
    System.out.print("1: ");
    printStarts(grades[1]);
    System.out.print("0: ");
    printStarts(grades[0]);
  }
}
