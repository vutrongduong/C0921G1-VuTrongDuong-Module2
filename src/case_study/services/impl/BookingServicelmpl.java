package case_study.services.impl;

import case_study.models.Booking;
import case_study.services.BookingService;
import case_study.utils.FileCSV;

import java.util.*;


public class BookingServicelmpl implements BookingService {
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static final String path = "D:\\codegym\\FuramaResort\\src\\data\\booking.csv";
    Scanner scanner = new Scanner(System.in);

    {
        bookingSet = convertRead();
    }

    @Override
    public void display() {
        for (Booking booking : bookingSet) {
            System.out.println(booking);
        }
    }

    @Override
    public void add() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        System.out.println("Enter code booking");
        String codeBooking = scanner.nextLine();
        System.out.println("Enter day start");
        String dayStart = scanner.nextLine();
        System.out.println("Enter day end");
        String dayEnd = scanner.nextLine();
        customerService.display();
        System.out.println("Enter code customer");
        String codeCustomer = scanner.nextLine();
        facilityService.display();
        System.out.println("Enter name service");
        String nameService = scanner.nextLine();
        System.out.println("Enter type of service");
        String typeOfService = scanner.nextLine();
        bookingSet.add(new Booking(codeBooking, dayStart, dayEnd, codeCustomer, nameService, typeOfService));
        FileCSV.writeFileCSV(convertWrite(), path);
    }

    public Set<Booking> convertRead() {
        List<String> stringList = FileCSV.readFileCSV(path);
        String[] arr;
        for (String line : stringList) {
            arr = line.split(",");
            bookingSet.add(new Booking(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]));
        }
        return bookingSet;
    }

    @Override
    public List<String> convertWrite() {
        List<String> stringList = new ArrayList<>();
        for (Booking booking : bookingSet) {
            stringList.add(booking.toString());
        }
        return stringList;
    }

//    public Set<Booking> bookingList() {
//        return bookingSet;
//    }

    public Set<Booking> getBookingMonth() {
        Calendar cal = Calendar.getInstance();
        String month = Integer.toString(cal.get(Calendar.MONTH) + 1);
        String year = Integer.toString(cal.get(Calendar.YEAR));
        Set<Booking> bookingMonth = new TreeSet<>(new BookingComparator());
        for (Booking ele : bookingSet) {
            String arrStart[] = ele.getDayStart().split("/");
            String arrEnd[] = ele.getDayEnd().split("/");
            if (arrStart[1].equals(month) && arrStart[2].equals(year) || arrEnd[1].equals(month) && arrEnd[2].equals(year)) {
                bookingMonth.add(ele);
            }
        }
        return bookingMonth;
    }

//    public static void main(String[] args) {
//        BookingServicelmpl bookingService = new BookingServicelmpl();
//        System.out.println(bookingService.getBookingMonth());
//    }
}


