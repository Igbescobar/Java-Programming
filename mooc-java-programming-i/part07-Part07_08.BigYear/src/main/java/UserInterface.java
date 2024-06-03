import java.util.Scanner;

public class UserInterface {
  private Scanner scanner;
  private DataBase dataBase;

  public UserInterface(Scanner scanner, DataBase dataBase) {
    this.scanner = scanner;
    this.dataBase = dataBase;
  }

  public void start() {
    boolean keepIteration = true;

    while (keepIteration) {
      System.out.println("?");
      String command = scanner.nextLine();
      switch (command.toLowerCase()) {
        case "quit":
          keepIteration = false;
          break;
        case "add":
          System.out.println("Name:");
          String name = scanner.nextLine();
          System.out.println("Name in Latin:");
          String latinName = scanner.nextLine();

          dataBase.addBirdToDataBase(name, latinName);
          break;
        case "observation":
          System.out.println("Bird?");
          String nameOfTheBird = scanner.nextLine();

          dataBase.addObservation(nameOfTheBird);
          break;
        case "all":
          dataBase.printAll();
          break;
        case "one":
          System.out.println("Bird?");
          String birdName = scanner.nextLine();
          dataBase.findOneBird(birdName);
        default:

          break;
      }
    }
  }
}
