package midterm.giorgi_meparishvili_1.task3;

public class Student {
    private String name;
    private String surname;
    private String personalNumber;

    // Constructor
    public Student(String name, String surname, String personalNumber) {
        this.name = name;
        this.surname = surname;
        this.personalNumber = personalNumber;
    }

    // Getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for surname
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    // Getter and setter for personalNumber
    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    // Overriding toString method to provide a brief description of the student
    @Override
    public String toString() {
        return "Student: " + name + " " + surname + " (Personal Number: " + personalNumber + ")";
    }
}
