import java.util.Date;

public class User {
    String firstName;
    String lastName;
    String gender;
    Long phoneNumber;
    String birthDate;


    public User(String firstName, String lastName, String gender, Long phoneNumber, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
    }
    public User() {
        this ("", "", "", null, null);
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBirthDate(String  birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return this.lastName + " " +
                this.firstName + " " +
                this.birthDate + " " +
                this.phoneNumber +" " +
                this.gender;
    }
}
