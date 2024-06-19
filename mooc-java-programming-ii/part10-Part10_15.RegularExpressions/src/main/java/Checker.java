import java.util.regex.Pattern;

public class Checker {
  public boolean isDayOfWeek(String string) {
    String regex = "^(mon|tue|wed|thu|fri|sat|sun)$";
    return Pattern.matches(regex, string.toLowerCase());
  }

  public boolean allVowels(String string) {
    String regex = "^[aeiouAEIOU]*$";
    return Pattern.matches(regex, string);
  }

  public boolean timeOfDay(String string) {
    String regex = "^([01]\\d|2[0-3]):([0-5]\\d):([0-5]\\d)$";
    return Pattern.matches(regex, string);
  }

}
