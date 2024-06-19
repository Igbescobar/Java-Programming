import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {
  private List<Card> listOfCardsInHand;

  public Hand() {
    this.listOfCardsInHand = new ArrayList<>();
  }

  public void add(Card card) {
    this.listOfCardsInHand.add(card);
  }

  public void print() {
    this.listOfCardsInHand.stream()
        .forEach(card -> System.out.println(card));
  }

  public void sort() {
    Collections.sort(this.listOfCardsInHand);
  }

  @Override
  public int compareTo(Hand handCompare) {
    int thisHandValue = this.listOfCardsInHand.stream()
        .mapToInt(Card::getValue)
        .sum();

    int compareHandValue = handCompare.listOfCardsInHand.stream()
        .mapToInt(Card::getValue)
        .sum();

    return thisHandValue - compareHandValue;
  }

  public void sortBySuit() {
    Collections.sort(this.listOfCardsInHand, new BySuitInValueOrder());
  }
}
