import java.util.ArrayList;

public class Box implements Packable {
  private double maxWeight;
  private ArrayList<Packable> items;

  public Box(double maxWeight) {
    this.maxWeight = maxWeight;
    this.items = new ArrayList<>();
  }

  public void add(Packable item) {
    if (item.weight() + this.weight() <= maxWeight) {
      items.add(item);
    }
  }

  public double weight() {
    double total = 0;

    for (Packable e : this.items) {
      total += e.weight();
    }
    return total;
  }

  @Override
  public String toString() {
    return "Box: " + items.size() + " items, total weight " + this.weight() + " kg";
  }
}
