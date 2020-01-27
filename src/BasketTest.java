import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BasketTest {

    Basket listaKsiazek;

    @BeforeEach
    public void setUp() {
        listaKsiazek = new Basket();
    }

    @Test
    public void addingBookToBasket() {
        Book book = new Book("Harry Potter", "J.K. Rowling", 12.50);
        Book book1 = new Book("Pan Tadusz", "Adam Mickiewicz", 13.50);
        Book book2 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 15.50);

        int sizeOld = listaKsiazek.getListBook().size();

        listaKsiazek.addingBookToBasket(book);
        listaKsiazek.addingBookToBasket(book1);
        listaKsiazek.addingBookToBasket(book2);

        int size = listaKsiazek.getListBook().size();

        assertThat(size).isEqualTo(sizeOld + 3);
    }
    @Test
    public void deleteBookFromBasket() {
        Book book = new Book("Harry Potter", "J.K. Rowling", 12.50);
        Book book1 = new Book("Pan Tadusz", "Adam Mickiewicz", 13.50);
        Book book2 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 15.50);

        listaKsiazek.addingBookToBasket(book);
        listaKsiazek.addingBookToBasket(book1);
        listaKsiazek.addingBookToBasket(book2);

        int sizeAfterAddingBooks = listaKsiazek.getListBook().size();

        listaKsiazek.deleteBookFromBasket("Harry Potter");


        int size = listaKsiazek.getListBook().size();


        assertThat(size).isEqualTo(sizeAfterAddingBooks - 1);

    }

}