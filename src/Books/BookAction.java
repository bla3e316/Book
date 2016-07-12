package Books;

import lesson2.Point.book.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aleks on 7/6/16.
 */
public class BookAction {

    public static void main(String[] args) {
        List<lesson2.Point.book.Book> books = createBooks();

        getAutor(books,"Aeron");
        getPublisher(books,"Mask");
        getafteryear(books,0000);
    }

    private static void getafteryear(List<lesson2.Point.book.Book> books, long year) {
        ArrayList<lesson2.Point.book.Book> booklist = new ArrayList<lesson2.Point.book.Book>();
        for (lesson2.Point.book.Book boo : Book){
            if (boo.getYear() > year) {
                booklist.add(books);
            }

        }
        return booklist;
    }

    private static void getPublisher(List<lesson2.Point.book.Book> books, String publisher) {
        for (lesson2.Point.book.Book i: books){
            if (i.getPublisher().equals(i.toString()));
        }
        System.out.println("-------------------------------------");
    }

    private static void getAutor(List<lesson2.Point.book.Book> books, String autor) {
        for (lesson2.Point.book.Book i: books){
            if (i.getAuthor().equals(i.toString()));
        }
        System.out.println("-------------------------------------");
    }


    private static List<lesson2.Point.book.Book> createBooks() {

        List<lesson2.Point.book.Book> books = new ArrayList<>();
        books.add(new lesson2.Point.book.Book()
                .setAuthor("Aeron")
                .setPublisher("HOME")
                .setPrice(29.99)
                .setYear(2016));
        books.add(new lesson2.Point.book.Book()
                .setAuthor("Mars")
                .setPublisher("Mask")
                .setPrice(230023.50)
                .setYear(2020));
        books.add(new Book()
                .setAuthor("Earth")
                .setPublisher("Moon")
                .setPrice(1234567)
                .setYear("0003"));
        return books;

    }



}
