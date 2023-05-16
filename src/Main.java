import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<Book> books = new ArrayList<>();
    books.add(new Book("Author2", "Title1", 111));
    books.add(new Book("Author2", "Title2", 222));
    books.add(new Book("Author3", "Title3", 333));
    books.add(new Book("Author4", "Title3", 322));
    books.add(new Book("Author1", "Title2", 333));
    System.out.println(books);

 // for (Book book : books) {
 //   System.out.println(book);
 // }
    Collections.sort(books);
    System.out.println(books);
    }

  }
//}