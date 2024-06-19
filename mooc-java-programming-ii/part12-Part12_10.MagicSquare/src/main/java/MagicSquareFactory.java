
public class MagicSquareFactory {

  public MagicSquare createMagicSquare(int size) {

    MagicSquare square = new MagicSquare(size);
    int row = 0;
    int column = size / 2;
    square.placeValue(row, column, 1);
    for (int i = 2; i <= size * size; i++) {
      int currentRow = row;
      int currentColumn = column;
      row -= 1;
      column += 1;
      if (row < 0) {
        row = size - 1;
      }
      if (column > size - 1) {
        column = 0;
      }
      if (square.readValue(row, column) > 0) {
        row = currentRow + 1;
        column = currentColumn;
      }
      square.placeValue(row, column, i);
    }
    return square;
  }

}
