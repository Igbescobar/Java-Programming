import java.util.ArrayList;

public class Hold {
  private ArrayList<Suitcase> suitcases;
  private int maxWeight;

  public Hold(int maxWeight) {
    this.maxWeight = maxWeight;
    this.suitcases = new ArrayList<>();
  }

  public void addSuitcase(Suitcase suitcase) {
    if (this.totalWeight() + suitcase.totalWeight() <= maxWeight) {
      this.suitcases.add(suitcase);
    }
  }

  public int totalWeight() {
    int sumOfWeights = 0;
    for (Suitcase suitcase : suitcases) {
      sumOfWeights += suitcase.totalWeight();
    }

    return sumOfWeights;
  }

  public void printItems() {
    for (Suitcase suitcase : suitcases) {
      System.out.println(suitcase.listItems());

    }
  }

  public String toString() {
    return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
  }
}
