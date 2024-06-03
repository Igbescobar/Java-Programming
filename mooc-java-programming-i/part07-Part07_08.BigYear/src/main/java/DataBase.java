import java.util.ArrayList;

public class DataBase {
  private ArrayList<Bird> birds;

  public DataBase() {
    this.birds = new ArrayList<>();
  }

  public void addBirdToDataBase(String name, String latinName) {
    birds.add(new Bird(name, latinName, 0));
  }

  public void addObservation(String name) {
    if (birds.isEmpty()) {
      System.out.println("Bird not available");
    }

    for (Bird bird : this.birds) {
      if (bird.getName().toLowerCase().equals(name.toLowerCase())) {
        bird.addObservation();
        return;
      }
    }
    System.out.println("Not a bird!");
  }

  public void setBirds(ArrayList<Bird> birds) {
    this.birds = birds;
  }

  public void printAll() {
    for (Bird bird : this.birds) {
      System.out.println(bird);
    }
  }

  public void findOneBird(String birdName) {
    for (Bird bird : this.birds) {
      if (bird.getName().toLowerCase().equals(birdName.toLowerCase())) {
        System.out.println(bird);
      }
    }
  }
}
