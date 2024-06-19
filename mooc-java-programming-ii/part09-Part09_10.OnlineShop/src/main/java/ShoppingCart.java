import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
  private Map<String, Item> items;

  public ShoppingCart() {
    this.items = new HashMap<>();
  }

  public void add(String product, int price) {
    if (items.keySet().contains(product)) {

      increaseQuantity(product);

    } else {

      items.put(product, new Item(product, 1, price));
    }

  }

  public void increaseQuantity(String product) {

    this.items.get(product).increaseQuantity();

  }

  public int price() {
    int total = 0;
    for (Item item : this.items.values()) {
      total += item.price();
    }
    return total;
  }

  public void print() {
    for (String item : this.items.keySet()) {
      System.out.println(this.items.get(item).toString());
    }
  }
}
