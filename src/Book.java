import java.util.Objects;

public class Book {

    private String titleOfTheBook;
    private int yearOfPublicationOfTheBook;
    private Author fullName;

    @Override
    public String toString() {
        return "Book{" +
                "titleOfTheBook='" + titleOfTheBook + '\'' +
                ", yearOfPublicationOfTheBook=" + yearOfPublicationOfTheBook +
                ", fullName=" + fullName +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(titleOfTheBook, book.titleOfTheBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleOfTheBook);
    }

    public Book(String titleOfTheBook, int yearOfPublicationOfTheBook, Author fullName) {
        this.yearOfPublicationOfTheBook = yearOfPublicationOfTheBook;
        this.titleOfTheBook = titleOfTheBook;
        this.fullName = fullName;
    }

    public Author getFullName() {
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

}
// public String toString () {
//   return "Название книги: " + this.titleOfTheBook + ", год публикации:" + this.yearOfPublicationOfTheBook +
//  ", Автор книги: " + fullName;
//     }


//### **Простой уровень**
//
//Реализовать методы toString, equals и hashCode в классах Author и Book, которые были созданы на
// прошлом уроке. Обратите внимание, что toString книги не должен дублировать код
// из toString автора, а должен делегировать (вызывать) его версию метода.
//
//- **Критерии оценки**
//
//    – Метод toString реализован корректно.
//
//    – Метод equals реализован корректно.
//
//    – Метод hashCode реализован корректно.
//
//    – Методы не дублируют друг друга в классах Author и Book.