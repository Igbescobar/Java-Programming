import java.util.ArrayList;

public class ChangeHistory {
  private ArrayList<Double> history;

  public ChangeHistory() {
    this.history = new ArrayList<>();
  }

  public void add(double status) {
    this.history.add(status);
  }

  public void clear() {
    this.history.clear();
  }

  public double maxValue() {
    if (history.isEmpty()) {
      return 0.0;
    }
    double largest = history.get(0);
    for (double eachNumber : history) {
      if (eachNumber > largest) {
        largest = eachNumber;
      }
    }
    return largest;
  }

  public double minValue() {
    if (history.isEmpty()) {
      return 0.0;
    }
    double smallest = history.get(0);
    for (double eachNumber : history) {
      if (eachNumber < smallest) {
        smallest = eachNumber;
      }
    }
    return smallest;
  }

  public double average() {
    if (history.isEmpty()) {
      return 0.0;
    }
    double additionOfAllStatus = 0;
    int totalNumberOfStatus = 0;
    for (double eachNumber : history) {
      additionOfAllStatus += eachNumber;
      totalNumberOfStatus++;
    }
    return (additionOfAllStatus / totalNumberOfStatus);
  }

  public String toString() {
    return history.toString();
  }
}
