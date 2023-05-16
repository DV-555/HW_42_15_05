import java.util.Objects;

public class Book implements Comparable<Book> {

// Задача 1.
// Создать класс Book (книга), в конструктор которого передавайте автора,
// название книги и количество страниц.
// Реализуйте интерфейс для сравнения книг: они должны сортироваться по авторам,
// а если авторы совпадают - по названиям (и там, и там - по алфавиту, "в словарном порядке").

  private final String author;
  private final String title;
  private final int numberOfPages;

  public Book(String author, String title, int numberOfPages) {
    this.author = author;
    this.title = title;
    this.numberOfPages = numberOfPages;
  }

  public String getAuthor() {
    return author;
  }

  public String getTitle() {
    return title;
  }

  public int getNumberOfPages() {
    return numberOfPages;
  }

  @Override
  public String toString() {
    return "Book{" +
        "author='" + author + '\'' +
        ", title='" + title + '\'' +
        ", numberOfPages=" + numberOfPages +
        '}';
  }


  @Override
  public int compareTo(Book o) {
    return author.compareTo(o.author);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(author,title,numberOfPages);
  }
}
