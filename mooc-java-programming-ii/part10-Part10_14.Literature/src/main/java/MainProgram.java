
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Book> listOfBooks = new ArrayList<>();
    while (true) {
      System.out.println("Input the name of the book, empty stops:");
      String nameOfBook = scanner.nextLine();
      if (nameOfBook.isEmpty()) {
        break;
      }
      System.out.println("Input the age recommendation:");
      int ageRecomendation = Integer.parseInt(scanner.nextLine());

      listOfBooks.add(new Book(nameOfBook, ageRecomendation));
    }
    System.out.println(listOfBooks.size() + " books in total.");
    System.out.println();

    Comparator<Book> comparator = Comparator
        .comparing(Book::getAgeRecomendation)
        .thenComparing(Book::getNameOfBook);

    Collections.sort(listOfBooks, comparator);

    System.out.println("Books:");
    for (Book book : listOfBooks) {
      System.out.println(book);
    }
  }

}
