import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
  private List<Person> listOfPersons;

  public Employees() {
    this.listOfPersons = new ArrayList<>();
  }

  public void add(Person personToAdd) {
    listOfPersons.add(personToAdd);
  }

  public void add(List<Person> peopleToAdd) {
    peopleToAdd.stream()
        .forEach(person -> listOfPersons.add(person));
  }

  public void print() {
    listOfPersons.stream()
        .forEach(person -> System.out.println(person));
  }

  public void print(Education education) {
    Iterator<Person> iterator = listOfPersons.iterator();

    while (iterator.hasNext()) {
      Person person = iterator.next();
      if (person.getEducation() == education) {
        System.out.println(person);
      }
    }
  }

  public void fire(Education education) {
    Iterator<Person> iterator = listOfPersons.iterator();

    while (iterator.hasNext()) {
      Person person = iterator.next();
      if (person.getEducation() == education) {
        iterator.remove();
      }
    }
  }
}
