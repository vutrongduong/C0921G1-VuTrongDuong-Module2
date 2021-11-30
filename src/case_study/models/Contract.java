package case_study.models;

import java.util.Objects;

public class Contract {
    private int numberContract;
    private String codeBooking;
    private double deposits;
    private double totalPayment;
    private String codeCustomer;

    public Contract() {
    }

    public Contract(int numberContract, String codeBooking, double deposits, double totalPayment, String codeCustomer) {
        this.numberContract = numberContract;
        this.codeBooking = codeBooking;
        this.deposits = deposits;
        this.totalPayment = totalPayment;
        this.codeCustomer = codeCustomer;
    }

    public int getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(int numberContract) {
        this.numberContract = numberContract;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public double getDeposits() {
        return deposits;
    }

    public void setDeposits(double deposits) {
        this.deposits = deposits;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    @Override
    public String toString() {
        return numberContract + "," + codeBooking + "," + deposits + "," + totalPayment + "," + codeCustomer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contract contract = (Contract) o;
        return numberContract == contract.numberContract;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberContract);
    }
}
