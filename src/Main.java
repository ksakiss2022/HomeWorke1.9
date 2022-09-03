public class Main {
    public static void main(String[] args) {


        Author firstAutor = new Author("Artur", "Konan Doil");

        System.out.println("firstAutor.firstName = " + firstAutor.getFirstName());
        System.out.println("firstAutor.lastName = " + firstAutor.getLastName());


        Author seconAuthor = new Author("Barbara", "Mitchelhill");

        System.out.println("seconAuthor.firstName = " + seconAuthor.getFirstName());
        System.out.println("seconAuthor.lastName = " + seconAuthor.getLastName());

        Author alicesAdventuresInWonderland = new Author("Lewis", "Carroll");


        Author fullName = new Author("Artur Konan Doil");
        Author secondFullName = new Author("Barbara Mitchelhill");
        System.out.println("fullName.fullName=" + fullName.getFullName());
        System.out.println("secondFullName.secondFullName=" + secondFullName.getFullName());


        Book myBookFirst = new Book("theLostWorld", 1984, ArturKonanDoil);


        System.out.println("myBookFirst.titleOfTheBook = " + myBookFirst.titleOfTheBook());
        System.out.println("myBookFirst.yearOfPublicationOfTheBook = " + myBookFirst.getyearOfPublicationOfTheBook());
        System.out.println("myBookFirst.author = " + myBookFirst.author());

        Book myBookSecond = new Book("seeYouSoon", 2000, BarbaraMitchelhill);


        System.out.println("myBookSecond.titleOfTheBook = " + myBookSecond.titleOfTheBook());
        System.out.println("myBookSecond.yearOfPublicationOfTheBook = " + myBookSecond.getyearOfPublicationOfTheBook());
        System.out.println("myBookSecond.author = " + myBookSecond.author());


        myBookSecond.setYearOfPublicationOfTheBook(2022);

        System.out.println("myBookSecond.yearOfPublicationOfTheBook = " + myBookSecond.getyearOfPublicationOfTheBook());
    }
}