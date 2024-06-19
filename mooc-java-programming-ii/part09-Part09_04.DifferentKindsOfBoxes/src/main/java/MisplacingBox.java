import java.util.ArrayList;

public class MisplacingBox extends Box {
  private ArrayList<Item> itemsInMisplaceBox;

  public MisplacingBox() {
    this.itemsInMisplaceBox = new ArrayList<>();
  }

  @Override
  public void add(Item item) {
    itemsInMisplaceBox.add(item);
  }

  @Override
  public boolean isInBox(Item item) {
    return false;
  }
}
