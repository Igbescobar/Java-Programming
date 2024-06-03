
public class HealthStation {
  private int numberOfWeightings;

  public int weigh(Person person) {
    // return the weight of the person passed as the parameter
    numberOfWeightings++;
    return person.getWeight();
  }

  public void feed(Person person) {
    person.setWeight(person.getWeight() + 1);
  }

  public int weighings() {
    return numberOfWeightings;
  }

  @Override
  public String toString() {
    return "weighings performed:" + numberOfWeightings;
  }

}
