import java.util.ArrayList;

public class Package {
  private ArrayList<Gift> listOGifts;

  public Package() {
    this.listOGifts = new ArrayList<>();
  }

  public void addGift(Gift gift) {
    this.listOGifts.add(gift);
  }

  public int totalWeight() {
    int total = 0;
    for (Gift gift : listOGifts) {
      total += gift.getWeight();
    }
    return total;
  }
}
