package case_study.models;

public class Employee extends Person {
    private String level;
    private String position;
    private int salary;

    public Employee() {
    }

    public Employee(String level, String position, int salary) {
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String code, String name, String birthDate, String gender, int idNumber, String phone, String email, String level, String position, int salary) {
        super(code, name, birthDate, gender, idNumber, phone, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getCode() + "," + getName() + "," + getBirthDate() + "," + getGender() + "," + getIdNumber() + "," + getPhone() + "," + getEmail() + "," + level + "," + position + "," + salary;
    }
}
