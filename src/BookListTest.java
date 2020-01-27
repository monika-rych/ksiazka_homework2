import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class BookListTest {

    BookList listaKsiazek;

    @BeforeEach
    public void setUp() {
        listaKsiazek = new BookList();
    }

    @Test
    public void addingBook() {
        Book book = new Book("Harry Potter", "J.K. Rowling", 12.50);
        Book book1 = new Book("Pan Tadusz", "Adam Mickiewicz", 13.50);
        Book book2 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 15.50);

        int sizeOld = listaKsiazek.getListBook().size();

        listaKsiazek.dodawanieKsiazek(book);
        listaKsiazek.dodawanieKsiazek(book1);
        listaKsiazek.dodawanieKsiazek(book2);

        int size = listaKsiazek.getListBook().size();

        assertThat(size).isEqualTo(sizeOld + 3);
    }

    @Test
    public void deleteOldBook() {
        Book book = new Book("Harry Potter", "J.K. Rowling", 12.50);
        Book book1 = new Book("Pan Tadusz", "Adam Mickiewicz", 13.50);
        Book book2 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 15.50);

        listaKsiazek.dodawanieKsiazek(book);
        listaKsiazek.dodawanieKsiazek(book1);
        listaKsiazek.dodawanieKsiazek(book2);

        int sizeAfterAddingBooks = listaKsiazek.getListBook().size();

        listaKsiazek.odejmowanieKsiazek("Harry Potter");


        int size = listaKsiazek.getListBook().size();


        assertThat(size).isEqualTo(sizeAfterAddingBooks - 1);

    }

        @Test
        public void testPrice(){
            double newPrice=9.99;
            Book book = new Book("Harry Potter", "J.K. Rowling", 12.50);
            listaKsiazek.dodawanieKsiazek(book);
            book = new Book("Dziady", "J.K. Rowling", 12.50);
            listaKsiazek.dodawanieKsiazek(book);
            listaKsiazek.changePrice("Harry Potter", newPrice);
            assertEquals(newPrice, listaKsiazek.listBooks.get(1).getPrice());
        }

    }
