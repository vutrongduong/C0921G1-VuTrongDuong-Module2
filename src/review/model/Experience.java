package review.model;



public class Experience extends Candidates {
    String expInYear;
    String proSkill;

    public Experience() {
    }

    public Experience(String expInYear, String proSkill) {
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public Experience(int id, String firstName, String lastName, String birthDate, String address, String phone, String email, int candidatesType, String expInYear, String proSkill) {
        super(id, firstName, lastName, birthDate, address, phone, email, candidatesType);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public String getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(String expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
}
