public class Container {
  private int capacity;

  public Container() {
    this.capacity = 0;
  }

  public int add(int addition) {
    if (addition > 0) {
      if (this.capacity + addition > 100) {
        int returnValue = 100 - this.capacity;
        this.capacity = 100;
        return returnValue;
      } else {
        this.capacity += addition;
        return addition;
      }
    }
    return 0;
  }

  public int remove(int subtraction) {
    if (subtraction > 0) {
      if (this.capacity - subtraction < 0) {
        int returnValue = capacity;
        this.capacity = 0;
        return returnValue;
      }
      this.capacity -= subtraction;
      return subtraction;
    }
    return 0;
  }

  @Override
  public String toString() {
    return this.capacity + "/100";
  }
}
