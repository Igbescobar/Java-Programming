
import java.util.ArrayList;
import java.util.Collections;

public class MagicSquare {

  private int[][] square;

  // ready constructor
  public MagicSquare(int size) {
    if (size < 2) {
      size = 2;
    }

    this.square = new int[size][size];
  }

  // implement these three methods
  public ArrayList<Integer> sumsOfRows() {
    ArrayList<Integer> sumOfRows = new ArrayList<>();
    for (int row = 0; row < this.getWidth(); row++) {
      int rowValue = 0;
      for (int column = 0; column < this.square[row].length; column++) {
        rowValue += this.square[row][column];
      }
      sumOfRows.add(rowValue);
    }
    return sumOfRows;
  }

  public ArrayList<Integer> sumsOfColumns() {
    ArrayList<Integer> sumOfColumnns = new ArrayList<>();
    for (int column = 0; column < this.square.length; column++) {
      int columnValue = 0;
      for (int row = 0; row < this.square[column].length; row++) {
        columnValue += this.square[row][column];
      }
      sumOfColumnns.add(columnValue);
    }
    return sumOfColumnns;
  }

  public ArrayList<Integer> sumsOfDiagonals() {
    ArrayList<Integer> sumOfDiagonals = new ArrayList<>();
    int primaryDiagonalSum = 0;
    int secondaryDiagonalSum = 0;

    int i = 0;
    while (i < this.square.length) {
      primaryDiagonalSum += this.square[i][i];
      i++;
    }

    i = 0;
    while (i < this.square.length) {
      secondaryDiagonalSum += this.square[i][this.square.length - 1 - i];
      i++;
    }
    sumOfDiagonals.add(primaryDiagonalSum);
    sumOfDiagonals.add(secondaryDiagonalSum);

    return sumOfDiagonals;
  }

  // ready-made helper methods -- don't touch these
  public boolean isMagicSquare() {
    return sumsAreSame() && allNumbersDifferent();
  }

  public ArrayList<Integer> giveAllNumbers() {
    ArrayList<Integer> numbers = new ArrayList<>();
    for (int row = 0; row < square.length; row++) {
      for (int col = 0; col < square[row].length; col++) {
        numbers.add(square[row][col]);
      }
    }

    return numbers;
  }

  public boolean allNumbersDifferent() {
    ArrayList<Integer> numbers = giveAllNumbers();

    Collections.sort(numbers);
    for (int i = 1; i < numbers.size(); i++) {
      if (numbers.get(i - 1) == numbers.get(i)) {
        return false;
      }
    }

    return true;
  }

  public boolean sumsAreSame() {
    ArrayList<Integer> sums = new ArrayList<>();
    sums.addAll(sumsOfRows());
    sums.addAll(sumsOfColumns());
    sums.addAll(sumsOfDiagonals());

    if (sums.size() < 3) {
      return false;
    }

    for (int i = 1; i < sums.size(); i++) {
      if (sums.get(i - 1) != sums.get(i)) {
        return false;
      }
    }

    return true;
  }

  public int readValue(int x, int y) {
    if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
      return -1;
    }

    return this.square[y][x];
  }

  public void placeValue(int x, int y, int value) {
    if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
      return;
    }

    this.square[y][x] = value;
  }

  public int getWidth() {
    return this.square.length;
  }

  public int getHeight() {
    return this.square.length;
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    for (int row = 0; row < square.length; row++) {
      for (int col = 0; col < square[row].length; col++) {
        result.append(square[row][col]).append("\t");
      }

      result.append("\n");
    }

    return result.toString();
  }
}
