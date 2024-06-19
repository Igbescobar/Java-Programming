public class ProductWarehouseWithHistory extends ProductWarehouse {
  private ChangeHistory changeHistory = new ChangeHistory();

  public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
    super(productName, capacity);
    super.addToWarehouse(initialBalance);
    changeHistory.add(initialBalance);
  }

  public void addToWarehouse(double amount) {
    double totalAfterAddition = super.getBalance() + amount;

    changeHistory.add(totalAfterAddition);

    super.addToWarehouse(amount);
  }

  public double takeFromWarehouse(double amount) {
    if (amount > super.getBalance()) {
      amount = super.getBalance();
    }
    double totalAfterSubtraction = super.getBalance() - amount;

    changeHistory.add(totalAfterSubtraction);

    super.takeFromWarehouse(amount);

    return amount;
  }

  public String history() {
    return changeHistory.toString();
  }

  public void printAnalysis() {
    System.out.println("Product: " + super.getName());
    System.out.println("History: " + changeHistory.toString());
    System.out.println("Largest amount of product: " + changeHistory.maxValue());
    System.out.println("Smallest amount of product: " + changeHistory.minValue());
    System.out.println("Average: " + changeHistory.average());
  }
}
