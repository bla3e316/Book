package Books;


import java.util.Objects;

/**
 * Created by Aleks on 7/6/16.
 */
public class Book {

    private static int nextid = 0;

    private final int id = nextid++;
    private String name;
    private String author;
    private String publisher;
    private long datePublish;
    private long year;
    private int pages;
    private double price;
    private String type;

    public Book() {
    }

    // -- Getters & Setters --


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Book setName(String name) {
        this.name = name;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getPublisher() {
        return publisher;
    }

    public Book setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }


    public String getPublisher() {
        return datePublish;
    }

    public Book setPublisher(String publisher) {
        this.publisher = datePublish;
        return this;
    }

    public String getYear() {
        return year;
    }

    public Book setYear(String year) {
        this.year = year;
        return this;
    }

    public String getPages() {
        return pages;
    }

    public Book setPages(String pages) {
        this.pages = pages;
        return this;
    }

    public String getPrice() {
        return price;
    }

    public Book setPrice(String price) {
        this.price = price;
        return this;
    }

    public String getType() {
        return type;
    }

    public Book setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == 0) return true;
        if (!(0 instanceof Book)) return false;
        Book book = (Book) o;
        return datePublish == book.datePublish &&
                pages == book.pages &&
                Objects.equals(name, book.name) &&
                Objects.equals(author, book.author) &&
                Objects.equals(publisher, book.publisher) &&
                Objects.equals(type, book.type);
        }

    @Override
    public int hashCode() {
        return Objects.hash(name,author,publisher,datePublish,pages,price);
    }


    //    @Override
//    public int hashCode() {
//        int result;
//        long temp;
//        result = id;
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        result = 31 * result + (author != null ? author.hashCode() : 0);
//        result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
//        result = 31 * result + (int) (datePublish ^ (datePublish >>> 32));
//        result = 31 * result + (year != null ? year.hashCode() : 0);
//        result = 31 * result + pages;
//        temp = Double.doubleToLongBits(price);
//        result = 31 * result + (int) (temp ^ (temp >>> 32));
//        result = 31 * result + (type != null ? type.hashCode() : 0);
//        return result;
//    }



    @Override
    public String toString() {
        return "Book{" + "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", datebuplish='" + datePublish + '\'' +
                ", year='" + year + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
}
