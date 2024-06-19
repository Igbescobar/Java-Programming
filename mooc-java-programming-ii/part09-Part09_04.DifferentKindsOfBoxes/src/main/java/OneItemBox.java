import java.util.ArrayList;

public class OneItemBox extends Box {
  private boolean empty;
  private ArrayList<Item> itemInSingleBox;

  public OneItemBox() {
    this.empty = true;
    this.itemInSingleBox = new ArrayList<>();
  }

  @Override
  public void add(Item item) {
    if (this.empty) {
      itemInSingleBox.add(item);
      this.empty = false;
    }
  }

  @Override
  public boolean isInBox(Item item) {
    return itemInSingleBox.contains(item);
  }
}
