
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    RecipeBook recipeList = new RecipeBook();

    System.out.print("File to read: ");

    String fileName = scanner.nextLine();

    try (Scanner scannerFile = new Scanner(Paths.get(fileName))) {

      ArrayList<String> fileLines = new ArrayList<>();

      while (scannerFile.hasNextLine()) {

        String line = scannerFile.nextLine();

        if (line.trim().isEmpty() || !scannerFile.hasNextLine()) {
          String name = fileLines.get(0);
          int time = Integer.parseInt(fileLines.get(1));
          ArrayList<String> ingredients = new ArrayList<>();
          for (int i = 2; i < fileLines.size(); i++) {
            ingredients.add(fileLines.get(i));
          }
          recipeList.addRecipes(new Recipe(name, time, ingredients));
          fileLines.removeAll(fileLines);
        } else {
          fileLines.add(line);
        }
      }
      scannerFile.close();
    } catch (Exception e) {
      System.out.println("Error " + e.getMessage());
    }

    UserInterface userInterface = new UserInterface(scanner, recipeList);

    userInterface.start();

  }

}
