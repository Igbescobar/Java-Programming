import java.util.ArrayList;

public class Herd implements Movable {
  private ArrayList<Movable> listOfMovableObjects;

  public Herd() {
    this.listOfMovableObjects = new ArrayList<>();
  }

  @Override
  public String toString() {
    StringBuilder total = new StringBuilder();
    for (Movable object : this.listOfMovableObjects) {
      total.append(object.toString()).append("\n");
    }
    return total.toString();
  }

  public void addToHerd(Movable movable) {
    this.listOfMovableObjects.add(movable);
  }

  public void move(int dx, int dy) {
    for (Movable object : this.listOfMovableObjects) {
      object.move(dx, dy);
    }
  }
}
