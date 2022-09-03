public class Book {

    private String titleOfTheBook;
    private int yearOfPublicationOfTheBook;
    private Author fullName;

    public Book(String titleOfTheBook, int yearOfPublicationOfTheBook,Author fullName) {
        this.yearOfPublicationOfTheBook = yearOfPublicationOfTheBook;
        this.titleOfTheBook = titleOfTheBook;
        this.fullName=fullName;
    }
    public Author getFullName(){
        return this.fullName;
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

    @Override
    public String toString() {
        return "Book{" +
                "titleOfTheBook='" + titleOfTheBook + '\'' +
                ", yearOfPublicationOfTheBook=" + yearOfPublicationOfTheBook +
                ", fullName=" + fullName +
                '}';
    }
}
