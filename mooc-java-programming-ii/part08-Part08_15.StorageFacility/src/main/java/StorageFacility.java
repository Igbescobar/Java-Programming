import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
  private HashMap<String, ArrayList<String>> storageFacilityHash;

  public StorageFacility() {
    this.storageFacilityHash = new HashMap<>();
  }

  public void add(String unit, String item) {
    this.storageFacilityHash.putIfAbsent(unit, new ArrayList<>());

    this.storageFacilityHash.get(unit).add(item);

  }

  public ArrayList<String> contents(String storageUnit) {
    ArrayList<String> list = new ArrayList<>();

    return this.storageFacilityHash.getOrDefault(storageUnit, list);
  }

  public void remove(String storageUnit, String item) {
    this.storageFacilityHash.get(storageUnit).remove(item);

    if (this.storageFacilityHash.get(storageUnit).size() == 0) {
      this.storageFacilityHash.remove(storageUnit);
    }
  }

  public ArrayList<String> storageUnits() {
    ArrayList<String> list = new ArrayList<>();

    for (String e : this.storageFacilityHash.keySet()) {
      if (!this.storageFacilityHash.get(e).isEmpty()) {
        list.add(e);
      }
    }
    return list;
  }
}
