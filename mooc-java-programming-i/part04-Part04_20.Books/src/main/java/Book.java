public class Book {
  private String title;
  private int pages;
  private int publicationYear;

  public Book(String title, int pages, int publicationYear) {
    this.title = title;
    this.pages = pages;
    this.publicationYear = publicationYear;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getPages() {
    return pages;
  }

  public void setPages(int pages) {
    this.pages = pages;
  }

  public int getPublicationYear() {
    return publicationYear;
  }

  public void setPublicationYear(int publicationYear) {
    this.publicationYear = publicationYear;
  }

  @Override
  public String toString() {
    return title + ", " + pages + " pages, " + publicationYear;
  }

}
