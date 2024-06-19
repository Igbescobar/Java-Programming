import java.util.ArrayList;
import java.util.List;

public class Hideout<T> {

  private List<T> tObject;

  public Hideout() {
    this.tObject = new ArrayList<>();
  }

  public void putIntoHideout(T toHide) {
    if (!this.tObject.isEmpty()) {
      this.tObject.clear();
    }
    this.tObject.add(toHide);
  }

  public T takeFromHideout() {
    if (this.tObject.isEmpty()) {
      return null;
    } else {
      T result = this.tObject.get(0);
      this.tObject.clear();
      return result;
    }
  }

  public boolean isInHideout() {
    if (this.tObject.isEmpty()) {
      return false;
    } else {
      return true;
    }
  }
}
