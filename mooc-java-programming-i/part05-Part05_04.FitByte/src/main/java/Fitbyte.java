public class Fitbyte {
  private int age;
  private int restingHeart;

  public Fitbyte(int age, int restingHeart) {
    this.age = age;
    this.restingHeart = restingHeart;
  }

  public double targetHeartRate(double percentageOfMaximum) {
    return ((206.3 - (0.711 * this.age) - this.restingHeart) * (percentageOfMaximum) + this.restingHeart);
  }
}
