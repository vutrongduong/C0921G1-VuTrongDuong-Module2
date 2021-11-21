package review.model;

import review.validate.EmailException;
import review.validate.PhoneException;

public class Fresher extends Candidates {
    String graduationDate;
    String graduationRank;
    String education;

    public Fresher() {
    }

    public Fresher(String graduationDate, String graduationRank, String education) {
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public Fresher(int id, String firstName, String lastName, String birthDate, String address, String phone, String email, int candidatesType, String graduationDate, String graduationRank, String education){
        super(id, firstName, lastName, birthDate, address, phone, email, candidatesType);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
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

//    @Override
//    public String toString() {
//        return super.toString() +
//                "graduationDate='" + graduationDate + '\'' +
//                ", graduationRank='" + graduationRank + '\'' +
//                ", education='" + education + '\'' +
//                '}';
//    }
}
