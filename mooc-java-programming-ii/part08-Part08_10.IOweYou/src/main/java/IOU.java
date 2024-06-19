import java.util.HashMap;

public class IOU {
  private HashMap<String, Double> iouHashMap;

  public IOU() {
    this.iouHashMap = new HashMap<>();
  }

  public void setSum(String toWhom, double amount) {
    if (!this.iouHashMap.containsKey(toWhom)) {
      this.iouHashMap.put(toWhom, amount);
    }
  }

  public double howMuchDoIOweTo(String toWhom) {
    return this.iouHashMap.getOrDefault(toWhom, 0.0);
  }
}
