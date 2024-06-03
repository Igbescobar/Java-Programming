public class Archive {
  private String identifier;
  private String name;

  public Archive(String identifier, String name) {
    this.identifier = identifier;
    this.name = name;
  }

  public String getIdentifier() {
    return identifier;
  }

  public String getName() {
    return name;
  }

  public boolean equals(Object item) {
    if (this == item) {
      return true;
    }

    if (!(item instanceof Archive)) {
      return false;
    }

    Archive comparedItem = (Archive) item;

    return this.identifier.equals(comparedItem.identifier);

  }
}
