package MCS;

import java.util.Date;

public abstract class Person {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    // Address
    // Phone No
    // Email

    public Person(String firstName, String lastName, MCS.Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = new Date();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setFirstName(String firstName) {
        if (firstName.isEmpty()) {
            throw new IllegalArgumentException("First name cannot be empty");
        } else if (firstName.length() > 30) {
            throw new IllegalArgumentException("Wow! Long name! First name cannot be longer than 30 characters");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName.isEmpty()) {
            throw new IllegalArgumentException("First name cannot be empty");
        } else if (lastName.length() > 30) {
            throw new IllegalArgumentException("Wow! Long name! First name cannot be longer than 30 characters");
        }
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + dateOfBirth;
    }
}
