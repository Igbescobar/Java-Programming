import java.util.ArrayList;

public class RecipeBook {
  private ArrayList<Recipe> recipes;

  public RecipeBook() {
    this.recipes = new ArrayList<>();
  }

  public void printRecipeBook() {
    for (Recipe recipe : this.recipes) {
      System.out.println(recipe);
    }
  }

  public void addRecipes(Recipe recipe) {
    this.recipes.add(recipe);
  }

  public void findByName(String nameToFind) {
    if (this.recipes.isEmpty()) {
      System.out.println("No recipes available");
    }

    for (Recipe recipe : this.recipes) {
      if (recipe.getName().toLowerCase().contains(nameToFind.toLowerCase())) {
        System.out.println(recipe);
      }
    }
  }

  public void findByTime(int maxTime) {
    if (this.recipes.isEmpty()) {
      System.out.println("No recipes available");
    }

    for (Recipe recipe : this.recipes) {
      if (recipe.getCookingTime() <= maxTime) {
        System.out.println(recipe);
      }
    }
  }

  public void findByIngredient(String findIngredient) {
    if (this.recipes.isEmpty()) {
      System.out.println("No recipes available");
    }

    for (Recipe recipe : this.recipes) {
      if (recipe.getIngredients().contains(findIngredient)) {
        System.out.println(recipe);
      }
    }
  }
}
