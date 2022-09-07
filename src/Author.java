import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object other) {

        if (this.getClass()  != other.getClass()) {
            return false;
        }
        Author author = (Author) other;
        return Objects.equals(firstName, author.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName);
    }

    public Author(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;

    }

    public String getFirstName() {
        return this.firstName;
    }


    //  public String toString(){
    //     return "Имя- "+this.firstName+", Фамилия- "+this.lastName;
    //}
}




