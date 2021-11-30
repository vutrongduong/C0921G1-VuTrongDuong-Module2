package case_study.services;

import case_study.models.Booking;
import case_study.models.Contract;

import java.util.List;
import java.util.Set;

public interface BookingService extends Service {
    Set<Booking> convertRead();

    List<String> convertWrite();

    List<String> convertWriteContact();

    List<Contract> convertReadContact();

    void addContact();

    void displayContact();

    void editConstracts();
}
