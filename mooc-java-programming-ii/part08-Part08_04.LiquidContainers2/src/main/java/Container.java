public class Container {
  private int capacity;

  public Container() {
    this.capacity = 0;
  }

  public int contains() {
    return this.capacity;
  }

  public void add(int addition) {
    if (addition > 0) {
      if (this.capacity + addition > 100) {
        this.capacity = 100;
      } else {
        this.capacity += addition;
      }
    }
  }

  public void remove(int subtraction) {
    if (subtraction > 0) {
      if (this.capacity - subtraction < 0) {
        this.capacity = 0;
      } else {
        this.capacity -= subtraction;
      }
    }
  }

  @Override
  public String toString() {
    return this.capacity + "/100";
  }
}
