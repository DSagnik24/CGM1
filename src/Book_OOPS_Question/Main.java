package Book_OOPS_Question;

import java.util.*;

public class Main {
    static void main() {
        List<Book> book = new ArrayList<>();

        book.add(new Book("Sapiens",550));
        book.add(new Book("Indistractable",400));
        book.add(new Book("Handsome Dance",550));
        book.add(new Book("Lincoln",550));

        BookImplementation impl = new BookImplementation();

        System.out.println(impl.getNameOfBooks(book));
        System.out.println(impl.sumCostOfAllBooks(book));
        System.out.println(impl.getMax(book));
    }

}
