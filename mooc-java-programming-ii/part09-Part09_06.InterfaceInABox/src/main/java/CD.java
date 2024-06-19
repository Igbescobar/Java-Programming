public class CD implements Packable {
  private String artist;
  private String name;
  private int publicationyear;
  private double weight;

  public CD(String artist, String name, int publicationyear) {
    this.artist = artist;
    this.name = name;
    this.publicationyear = publicationyear;
    this.weight = 0.1;
  }

  public double weight() {
    return this.weight;
  }

  @Override
  public String toString() {
    return this.artist + ": " + this.name + " (" + this.publicationyear + ")";
  }
}
