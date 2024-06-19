public class Cat extends Animal implements NoiseCapable {

  public Cat(String name) {
    super(name);
  }

  public Cat() {
    super("Cat");
  }

  public void makeNoise() {
    this.purr();
  }

  public void purr() {
    System.out.println(super.getName() + " purrs");
  }
}
