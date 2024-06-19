public class Book {
  private String nameOfBook;
  private int ageRecomendation;

  public Book(String nameOfBook, int ageRecomendation) {
    this.nameOfBook = nameOfBook;
    this.ageRecomendation = ageRecomendation;
  }

  public String getNameOfBook() {
    return nameOfBook;
  }

  public void setNameOfBook(String nameOfBook) {
    this.nameOfBook = nameOfBook;
  }

  public int getAgeRecomendation() {
    return ageRecomendation;
  }

  public void setAgeRecomendation(int ageRecomendation) {
    this.ageRecomendation = ageRecomendation;
  }

  @Override
  public String toString() {
    return this.nameOfBook + " (recommended for " + this.ageRecomendation + " years-olds or older)";
  }
}
