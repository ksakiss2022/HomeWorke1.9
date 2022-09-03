public class Author {
    private String firstName;
    private String lastName;

    private String fullName;

    public Author(String fullName) {
        this.fullName = fullName;
    }

    public Author(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }
    public String getFullName() {
        return this.fullName;


    }
    public String getLastName() {
        return this.lastName;

    }

    public String getFirstName() {
        return this.firstName;

    }
}


