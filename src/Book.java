public class Book {

    private String titleOfTheBook;
    private int yearOfPublicationOfTheBook;

    public Book(String titleOfTheBook, int yearOfPublicationOfTheBook) {
        this.yearOfPublicationOfTheBook = yearOfPublicationOfTheBook;
        this.titleOfTheBook = titleOfTheBook;
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
