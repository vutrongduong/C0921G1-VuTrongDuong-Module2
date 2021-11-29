package case_study.models;

public class Customer extends Person {
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(String customerType, String address) {
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String code, String name, String birthDate, String gender, int idNumber, String phone, String email, String customerType, String address) {
        super(code, name, birthDate, gender, idNumber, phone, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getLoaiKhach() {
        return customerType;
    }

    public void setLoaiKhach(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return getCode() + "," + getName() + "," + getBirthDate() + "," + getGender() + "," + getIdNumber() + "," + getPhone() + "," + getEmail() + "," + customerType + "," + address;
    }

}
