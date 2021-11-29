package case_study.models.facility;

import java.util.Objects;

public abstract class Facility {
    private String codeService;
    private String name;
    private double area;
    private int expense;
    private int numbeOfPeople;
    private String rentStyle;

    public Facility() {
    }

    public Facility(String codeService, double area, int expense, int numbeOfPeople, String rentStyle) {
        this.codeService = codeService;
        this.area = area;
        this.expense = expense;
        this.numbeOfPeople = numbeOfPeople;
        this.rentStyle = rentStyle;
    }

    public String getCodeService() {
        return codeService;
    }

    public void setCodeService(String codeService) {
        this.codeService = codeService;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getExpense() {
        return expense;
    }

    public void setExpense(int expense) {
        this.expense = expense;
    }

    public int getNumbeOfPeople() {
        return numbeOfPeople;
    }

    public void setNumbeOfPeople(int numbeOfPeople) {
        this.numbeOfPeople = numbeOfPeople;
    }

    public String getRentStyle() {
        return rentStyle;
    }

    public void setRentStyle(String rentStyle) {
        this.rentStyle = rentStyle;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "codeService='" + codeService + '\'' +
                ", area=" + area +
                ", expense=" + expense +
                ", numbeOfPeople=" + numbeOfPeople +
                ", rentStyle='" + rentStyle + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return Objects.equals(codeService, facility.codeService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeService);
    }
}