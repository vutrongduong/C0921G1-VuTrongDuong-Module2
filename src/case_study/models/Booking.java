package case_study.models;

import java.io.Serializable;
import java.util.Objects;

public class Booking implements Serializable {
    private String codeBooking;
    private String dayStart;
    private String dayEnd;
    private String codeCustomer;
    private String nameService;
    private String typeOfService;

    public Booking() {
    }

    public Booking(String codeBooking, String dayStart, String dayEnd, String codeCustomer, String nameService, String typeOfService) {
        this.codeBooking = codeBooking;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.codeCustomer = codeCustomer;
        this.nameService = nameService;
        this.typeOfService = typeOfService;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    @Override
    public String toString() {
        return codeBooking + "," + dayStart + "," + dayEnd + "," + codeCustomer + "," + nameService + "," + typeOfService;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Objects.equals(codeBooking, booking.codeBooking);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeBooking);
    }
}
