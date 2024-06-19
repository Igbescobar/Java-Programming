package dictionary;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.imageio.IIOException;

public class SaveableDictionary {
  private HashMap<String, String> listOfTranslations;

  private String file;

  public SaveableDictionary() {
    this.listOfTranslations = new HashMap<>();
  }

  public SaveableDictionary(String file) {
    this();
    this.file = file;
  }

  public void add(String words, String translation) {
    if (!(this.listOfTranslations.containsKey(translation)) && !this.listOfTranslations.containsKey(words)) {
      this.listOfTranslations.putIfAbsent(words, translation);
      this.listOfTranslations.putIfAbsent(translation, words);
    }
  }

  public String translate(String word) {
    return this.listOfTranslations.getOrDefault(word, null);
  }

  public void delete(String word) {
    String translation = this.listOfTranslations.get(word);
    this.listOfTranslations.remove(word);
    this.listOfTranslations.remove(translation);
  }

  public boolean load() {
    try {
      Files.lines(Paths.get(this.file))
          .map(lines -> lines.split(":"))
          .filter(lines -> lines.length == 2)
          .forEach(phrase -> {
            String word = phrase[0].trim();
            String translation = phrase[1].trim();
            this.listOfTranslations.put(word, translation);
            this.listOfTranslations.put(translation, word);
          });
      return true;
    } catch (IOException e) {
      return false;
    }
  }

  public boolean save() {
    try {
      Set<String> savedTranslations = new HashSet<>();

      List<String> lines = this.listOfTranslations.entrySet().stream()
          .filter(entry -> !savedTranslations.contains(entry.getValue()))
          .peek(entry -> savedTranslations.add(entry.getKey()))
          .map(entry -> entry.getKey() + ":" + entry.getValue())
          .collect(Collectors.toList());

      Files.write(Paths.get(this.file), lines, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}
