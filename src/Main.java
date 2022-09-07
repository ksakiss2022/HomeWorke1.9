public class Main {
    public static void main(String[] args) {
        Author firstAutor = new Author("Artur", "Konan Doil");
        Author seconAuthor = new Author("Barbara", "Mitchelhill");

        Book myBookFirst = new Book("theLostWorld", 1984, firstAutor);

        System.out.println("myBookFirst.titleOfTheBook = " + myBookFirst.titleOfTheBook() + ", " +
                "yearOfPublicationOfTheBook = " + myBookFirst.getYearOfPublicationOfTheBook() + ", " +
                "fullName" + myBookFirst.getFullName());

        Book myBookSecond = new Book("seeYouSoon", 2000, seconAuthor);


        System.out.println("myBookSecond.titleOfTheBook = " + myBookSecond.titleOfTheBook() + ", " +
                "yearOfPublicationOfTheBook = " + myBookSecond.getYearOfPublicationOfTheBook() + ", " +
                "fullName" + myBookSecond.getFullName());

        myBookSecond.setYearOfPublicationOfTheBook(2022);
        System.out.println("myBookSecond.yearOfPublicationOfTheBook = " + myBookSecond.getYearOfPublicationOfTheBook());

        // 1/10
        System.out.println("myBookFirst = " + myBookFirst);
        System.out.println("myBookSecond =" + myBookSecond);
    }

}