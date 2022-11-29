public class Person {
    private String firstName;
    private String lastName;
    private String email;

    public Person (String f, String l, String e) {
        firstName = f;
        lastName = l;
        email = e;
    }
    public Person (String f, String l) {
        firstName = f;
        lastName = l;
        email = "N/A";
    }

    public void introduce () {
        System.out.println("Hello, my name is " + firstName + " " + lastName);
    }

    public String getFirstName () {
        return firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String e) {
        email = e;
    }

}
