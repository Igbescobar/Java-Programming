import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
  private HashMap<String, ArrayList> translationHashMap;

  public DictionaryOfManyTranslations() {
    this.translationHashMap = new HashMap<>();
  }

  public void add(String word, String translation) {

    this.translationHashMap.putIfAbsent(word, new ArrayList<>());

    ArrayList<String> completed = this.translationHashMap.get(word);
    completed.add(translation);
  }

  public ArrayList<String> translate(String word) {
    return this.translationHashMap.getOrDefault(word, new ArrayList<>());
  }

  public void remove(String word) {
    this.translationHashMap.remove(word);
  }
}
