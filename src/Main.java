import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<Book> books = new ArrayList<>();
    books.add(new Book("Author1", "Title1", 111));
    books.add(new Book("Author2", "Title2", 222));
    books.add(new Book("Author3", "Title3", 333));
    books.add(new Book("Author3", "Title3", 322));
    books.add(new Book("Author4", "Title4", 333));

    Collections.sort(books);

    for (Book book : books) {
      System.out.println(book);
    }
  }
}