import java.util.ArrayList;

public class Suitcase {
  private ArrayList<Item> itemList;
  private int maxWeight;

  public Suitcase(int maxWeight) {
    this.itemList = new ArrayList<>();
    this.maxWeight = maxWeight;
  }

  public void addItem(Item item) {
    int currentWeight = totalWeight();
    if (!(item.getWeight() + currentWeight > this.maxWeight)) {
      itemList.add(item);
    }
  }

  public void printItems() {
    for (Item item : itemList) {
      System.out.println(item.getName() + " (" + item.getWeight() + "kg)");
    }
  }

  public String listItems() {

    String listItems = "";

    for (Item item : itemList) {
      listItems += item.toString() + "\n";
    }

    return listItems;
  }

  public int totalWeight() {
    int currentWeight = 0;
    for (Item singleItem : itemList) {
      currentWeight += singleItem.getWeight();
    }
    return currentWeight;
  }

  public Item heaviestItem() {
    if (itemList.isEmpty()) {
      return null;
    }
    Item heavistItem = itemList.get(0);

    for (Item item : itemList) {
      if (item.getWeight() > heavistItem.getWeight())
        heavistItem = item;
    }
    return heavistItem;
  }

  public String toString() {
    int numOfItems = itemList.size();
    int totalWeight = 0;
    for (Item item : itemList) {
      totalWeight += item.getWeight();
    }
    if (numOfItems == 0) {
      return "no items (0kg)";
    } else if (numOfItems == 1) {
      return "1 item (" + totalWeight + "kg)";
    }
    return numOfItems + " items (" + totalWeight + " kg)";
  }
}
