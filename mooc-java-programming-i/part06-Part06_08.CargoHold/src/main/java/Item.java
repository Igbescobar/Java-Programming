public class Item {
  private String name;
  private int weigth;

  public Item(String name, int weigth) {
    this.name = name;
    this.weigth = weigth;
  }

  public String getName() {
    return this.name;
  }

  public int getWeight() {
    return this.weigth;
  }

  public String toString() {
    return this.name + " (" + this.weigth + " kg)";
  }
}
