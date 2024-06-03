import java.lang.reflect.Array;
import java.util.ArrayList;

public class Score {
  private ArrayList<Integer> scores;
  private int[] grades = { 0, 0, 0, 0, 0, 0 };

  public Score() {
    this.scores = new ArrayList<>();
  }

  public double calculateAverage(ArrayList<Integer> scores) {
    int total = 0;
    int numberOfInputs = 0;
    for (int score : scores) {
      total += score;
      numberOfInputs++;
    }
    return (double) total / numberOfInputs;
  }

  public ArrayList<Integer> getScores() {
    return this.scores;
  }

  public void addScore(int score) {
    this.scores.add(score);
  }

  public double calculateAveregeForPassingScores(ArrayList<Integer> scores) {
    int total = 0;
    int numberOfInputs = 0;
    for (int score : scores) {
      if (score >= 50) {
        total += score;
        numberOfInputs++;
      }
    }
    return (double) total / numberOfInputs;
  }

  public double calculatePassingPercentage(ArrayList<Integer> scores) {
    int total = 0;
    int numberOfInputs = 0;
    for (int score : scores) {
      if (score >= 50) {
        total++;
      }
      numberOfInputs++;
    }
    System.out.println(total);
    System.out.println(numberOfInputs);
    return ((double) total / numberOfInputs) * 100;
  }

  public void findGradeDistribution(ArrayList<Integer> scores) {
    int[] grades = { 0, 0, 0, 0, 0, 0 };
    for (int score : scores) {
      if (score < 50) {
        this.grades[0] += 1;
      } else if (score < 60) {
        this.grades[1] += 1;
      } else if (score < 70) {
        this.grades[2] += 1;
      } else if (score < 80) {
        this.grades[3] += 1;
      } else if (score < 90) {
        this.grades[4] += 1;
      } else if (score >= 90) {
        this.grades[5] += 1;
      }
    }
  }

  public int[] getGrades() {
    return grades;
  }
}
