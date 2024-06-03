import java.util.Scanner;

public class UserInterface {
  private JokeManager jokeManager;
  private Scanner scanner;

  public UserInterface(JokeManager jokeManager, Scanner scanner) {
    this.jokeManager = jokeManager;
    this.scanner = scanner;
  }

  public void start() {
    String command = chooseACommand();
    execution(command);
  }

  public String chooseACommand() {
    while (true) {
      System.out.println("Commands:");
      System.out.println(" 1 - add a joke");
      System.out.println(" 2 - draw a joke");
      System.out.println(" 3 - list jokes");
      System.out.println(" X - stop");

      String command = scanner.nextLine();
      return command;
    }
  }

  public void execution(String command) {
    if (command.equals("1")) {
      System.out.println("Write the joke to be added:");
      String joke = scanner.nextLine();
      jokeManager.addJoke(joke);
    } else if (command.equals("2")) {
      System.out.println("Drawing a joke.");
      String drawnJoke = jokeManager.drawJoke();
      System.out.println(drawnJoke);
    } else if (command.equals("3")) {
      System.out.println("Printing the jokes.");
      jokeManager.printJokes();
    }
  }
}
