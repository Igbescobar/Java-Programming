import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

  private int capacity;
  private ArrayList<Item> itemsInMaxBox;

  public BoxWithMaxWeight(int capacity) {
    this.capacity = capacity;
    this.itemsInMaxBox = new ArrayList<>();
  }

  public int currentBoxWeight() {
    int totalBoxWeight = 0;

    for (Item itemWeight : this.itemsInMaxBox) {
      totalBoxWeight += itemWeight.getWeight();
    }
    return totalBoxWeight;
  }

  @Override
  public void add(Item item) {
    if (item.getWeight() + currentBoxWeight() <= this.capacity) {
      itemsInMaxBox.add(item);
    }
  }

  @Override
  public boolean isInBox(Item item) {
    return itemsInMaxBox.contains(item);
  }
}
