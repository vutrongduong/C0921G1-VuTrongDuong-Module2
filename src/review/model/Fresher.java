package review.model;


public class Fresher extends Candidates {
    double graduationDate;
    String graduationRank;
    String education;

    public Fresher() {
    }

    public Fresher(double graduationDate, String graduationRank, String education) {
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public Fresher(int id, String firstName, String lastName, int birthDate, String address, double phone, String email, int candidatesType, double graduationDate, String graduationRank, String education) {
        super(id, firstName, lastName, birthDate, address, phone, email, candidatesType);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public double getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(double graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

}
