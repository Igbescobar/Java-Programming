import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
  private HashMap<LicensePlate, String> vehicleList;

  public VehicleRegistry() {
    this.vehicleList = new HashMap<>();
  }

  public boolean add(LicensePlate licensePlate, String owner) {
    if (vehicleList.containsKey(licensePlate) && vehicleList.get(licensePlate) != null
        && !vehicleList.get(licensePlate).isEmpty()) {
      return false;
    }

    vehicleList.put(licensePlate, owner);
    return true;
  }

  public String get(LicensePlate licensePlate) {
    return this.vehicleList.getOrDefault(licensePlate, null);
  }

  public boolean remove(LicensePlate licensePlate) {
    if (this.vehicleList.remove(licensePlate) == null) {
      return false;
    } else {
      return true;
    }
  }

  public void printLicensePlates() {
    for (LicensePlate plate : this.vehicleList.keySet()) {
      System.out.println(plate);
    }
  }

  public void printOwners() {
    ArrayList<String> ownersPrinted = new ArrayList<>();
    for (String owner : this.vehicleList.values()) {
      if (!ownersPrinted.contains(owner)) {
        ownersPrinted.add(owner);
        System.out.println(owner);
      }
    }
  }
}
