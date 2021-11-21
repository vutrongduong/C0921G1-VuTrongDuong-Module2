package review.model;

public class Intern extends Candidates {
    private String majors;
    private int semester;
    private String universityName;

    public Intern() {
    }

    public Intern(String majors, int semester, String universityName) {
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public Intern(int id, String firstName, String lastName, String birthDate, String address, String phone, String email, int candidatesType, String majors, int semester, String universityName) {
        super(id, firstName, lastName, birthDate, address, phone, email, candidatesType);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
}
