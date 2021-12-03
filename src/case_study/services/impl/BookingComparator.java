package case_study.services.impl;


import case_study.models.Booking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class BookingComparator implements Comparator<Booking> {
    @Override
    public int compare(Booking o1, Booking o2) {
        Date date1 = null;
        Date date2 = null;
        if (o1.getDayStart().equals(o2.getDayStart())) {
            try {
                date1 = new SimpleDateFormat("dd/MM/yyyy").parse(o1.getDayEnd());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            try {
                date2 = new SimpleDateFormat("dd/MM/yyyy").parse(o2.getDayEnd());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return date1.compareTo(date2);
        } else {
            try {
                date1 = new SimpleDateFormat("dd/MM/yyyy").parse(o1.getDayStart());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            try {
                date2 = new SimpleDateFormat("dd/MM/yyyy").parse(o2.getDayStart());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return date1.compareTo(date2);
        }
    }
}
