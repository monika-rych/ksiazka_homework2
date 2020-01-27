import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookList {


        List<Book> listBooks = new ArrayList<>();

        public List<Book> getListBook(){
            return listBooks;
        }

    public void dodawanieKsiazek(Book book) {
            listBooks.add(book);
    }

    public void odejmowanieKsiazek(String title) {
        for (int i = 0; i < listBooks.size(); i++) {
            if (listBooks.get(i).getTitle() == title) {
                listBooks.remove(i);
            }
        }
    }
    public void changePrice(String title, Double price){
        for (int i = 0; i < listBooks.size(); i++) {
            if (listBooks.get(i).getTitle() == title) {
                listBooks.get(i).setPrice(price);
            }
        }
    }
}
