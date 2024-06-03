import java.util.ArrayList;

public class Room {
  ArrayList<Person> listOfPersons;

  public Room() {
    this.listOfPersons = new ArrayList<>();
  }

  public void add(Person person) {
    listOfPersons.add(person);
  }

  public boolean isEmpty() {
    if (listOfPersons.isEmpty()) {
      return true;
    }
    return false;
  }

  public ArrayList<Person> getPersons() {
    return listOfPersons;
  }

  public Person shortest() {
    if (listOfPersons.isEmpty()) {
      return null;
    }

    Person shortestPerson = listOfPersons.get(0);

    for (Person person : listOfPersons) {
      if (person.getHeight() < shortestPerson.getHeight()) {
        shortestPerson = person;
      }
    }
    return shortestPerson;
  }

  public Person take() {
    Person shortest = this.shortest();
    listOfPersons.remove(shortest);
    return shortest;
  }
}
