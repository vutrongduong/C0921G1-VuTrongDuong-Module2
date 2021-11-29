package case_study.services;

import case_study.models.Booking;

import java.util.Set;

public interface BookingService extends Service {
    Set<Booking> convertRead();
}
