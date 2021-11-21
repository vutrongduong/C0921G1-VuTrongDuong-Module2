package review.model;



public abstract class Candidates {
    private int id;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String address;
    private String phone;
    private String email;
    private int candidatesType;

    public Candidates() {
    }

    public Candidates(int id, String firstName, String lastName, String birthDate, String address, String phone, String email, int candidatesType) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.candidatesType = candidatesType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCandidatesType() {
        return candidatesType;
    }

    public void setCandidatesType(int candidatesType) {
        this.candidatesType = candidatesType;
    }

    @Override
    public String toString() {
        return
                firstName +" "+ lastName + '|' + birthDate + '|' + address + '|' + phone + "|" + email + '|' + candidatesType;

    }
}
