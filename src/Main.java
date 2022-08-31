public class Main {
    public static void main(String[] args) {
        Author firstAutor = new Author("Artur", "Konan Doil");


        System.out.println("firstAutor.firstName = " + firstAutor.getFirstName());
        System.out.println("firstAutor.lastName = " + firstAutor.getLastName());


        Author seconAuthor = new Author("Barbara", "Mitchelhill");


        System.out.println("seconAuthor.firstName = " + seconAuthor.getFirstName());
        System.out.println("seconAuthor.lastName = " + seconAuthor.getLastName());

        Author alicesAdventuresInWonderland = new Author("Lewis", "Carroll");


        Book myBookFirst = new Book("theLostWorld", 1984);


        System.out.println("myBookFirst.titleOfTheBook = " + myBookFirst.titleOfTheBook());
        System.out.println("myBookFirst.yearOfPublicationOfTheBook = " + myBookFirst.getyearOfPublicationOfTheBook());

        Book myBookSecond = new Book("seeYouSoon", 2000);


        System.out.println("myBookSecond.titleOfTheBook = " + myBookSecond.titleOfTheBook());
        System.out.println("myBookSecond.yearOfPublicationOfTheBook = " + myBookSecond.getyearOfPublicationOfTheBook());

        myBookSecond.setYearOfPublicationOfTheBook(2022);
        System.out.println("myBookSecond.yearOfPublicationOfTheBook = " + myBookSecond.getyearOfPublicationOfTheBook());
    }
}