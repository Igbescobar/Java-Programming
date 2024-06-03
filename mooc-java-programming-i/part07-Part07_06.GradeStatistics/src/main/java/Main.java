
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Score score = new Score();
    UserInterface userInterface = new UserInterface(scanner, score);

    userInterface.start();
    // Write your program here -- consider breaking the program into
    // multiple classes.
  }
}
