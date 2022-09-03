public class Book {

    private String titleOfTheBook;
    private int yearOfPublicationOfTheBook;

    private Author author;


    public Book(String titleOfTheBook, int yearOfPublicationOfTheBook, Author author) {
        this.yearOfPublicationOfTheBook = yearOfPublicationOfTheBook;
        this.titleOfTheBook = titleOfTheBook;
        this.author = author;
    }

    public Author author() {
        return this.author;
    }

    public String titleOfTheBook() {
        return this.titleOfTheBook;

    }

    public int getyearOfPublicationOfTheBook() {
        return this.yearOfPublicationOfTheBook;

    }

    public void setYearOfPublicationOfTheBook(int yearOfPublicationOfTheBook) {
        this.yearOfPublicationOfTheBook = yearOfPublicationOfTheBook;
    }
}
