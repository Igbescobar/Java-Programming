import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
  private Scanner scanner;
  private RecipeBook recipeList;

  public UserInterface(Scanner scanner, RecipeBook recipeList) {
    this.scanner = scanner;
    this.recipeList = recipeList;
  }

  public void start() {
    printCommands();
    boolean continueLoop = true;
    while (continueLoop) {
      System.out.println("Enter command: ");
      String command = scanner.nextLine();

      switch (command) {
        case "stop":
          continueLoop = false;
          break;
        case "list":
          System.out.println("Recipes:");
          recipeList.printRecipeBook();
          break;
        case "find name":
          System.out.println("Searched word:");
          String nameToFind = scanner.nextLine();
          System.out.println("Recipes:");
          recipeList.findByName(nameToFind);
          break;
        case "find cooking time":
          System.out.println("Max cooking time");
          int maxTime = Integer.parseInt(scanner.nextLine());
          recipeList.findByTime(maxTime);
          break;
        case "find ingredient":
          System.out.println("Ingredient:");
          String findIngredient = scanner.nextLine();
          recipeList.findByIngredient(findIngredient);
          break;
        default:
          break;
      }
    }
  }

  public String askForFile() {
    System.out.println("File to read: ");
    return scanner.nextLine();
  }

  public void printCommands() {
    System.out.println("Commands:");
    System.out.println("list - lists the recipes");
    System.out.println("stop - stops the program");
    System.out.println("find name - searches recipes by name");
    System.out.println("find cooking time - searches recipes by cooking time");
    System.out.println("find ingredient - searches recipes by ingredient");
  }
}
