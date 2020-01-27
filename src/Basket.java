import java.util.ArrayList;
import java.util.List;

public class Basket {
    List<Book> listBooks = new ArrayList<>();

    public List<Book> getListBook(){
        return listBooks;
    }

    public void addingBookToBasket(Book book) {
        listBooks.add(book);
    }

    public void deleteBookFromBasket(String title) {
        for (int i = 0; i < listBooks.size(); i++) {
            if (listBooks.get(i).getTitle() == title) {
                listBooks.remove(i);
            }
        }
    }
}
