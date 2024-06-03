import java.util.ArrayList;

public class Container {
  private int currentLiters;
  private int maximumCapacity;

  public Container() {
    this.currentLiters = 0;
    this.maximumCapacity = 100;
  }

  public int contains() {
    return this.currentLiters;
  }

  public void add(int amount) {
    if (amount > 0) {
      if (this.currentLiters + amount <= 100) {
        this.currentLiters += amount;
      } else {
        this.currentLiters = 100;
      }
    }
  }

  public void remove(int amount) {
    if (amount > 0) {
      if (this.currentLiters - amount >= 0) {
        this.currentLiters -= amount;
      } else {
        this.currentLiters = 0;
      }
    }
  }

  @Override
  public String toString() {
    return currentLiters + "/" + maximumCapacity;
  }

}
