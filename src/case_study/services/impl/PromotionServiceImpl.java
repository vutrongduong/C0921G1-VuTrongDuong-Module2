package case_study.services.impl;


import case_study.models.Booking;
import case_study.models.Customer;
import case_study.validate.Validate;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class PromotionServiceImpl {
    Scanner scanner = new Scanner(System.in);
    Validate validate =new Validate();
    BookingServicelmpl bookingServicelmpl = new BookingServicelmpl();
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    List<Customer> customerList = customerService.convertRead();
    Customer customer = new Customer();

    public void displayListCustomer() {
        System.out.println("Enter the service year : ");
        int year = Integer.parseInt(scanner.nextLine());
        for (Booking booking : bookingServicelmpl.bookingSet()) {
            String[] arrStart = booking.getDayStart().split("/");
            String[] arrEnd = booking.getDayEnd().split("/");
            if (arrStart[2].equals(Integer.toString(year)) || arrEnd[2].equals(Integer.toString(year))) {
                System.out.println(booking);
            }
        }
    }

    public void getVoucher() {
        Stack<Booking> bookingStack = new Stack<>();
        bookingStack.addAll(bookingServicelmpl.getBookingMonth());
        System.out.println("Enter the number of voucher 10%");
        int voucher10 = validate.checkNumber(scanner.nextLine());
        System.out.println("Enter the number of voucher 20%");
        int voucher20 =validate.checkNumber(scanner.nextLine());
        System.out.println("Enter the number of voucher 50%");
        int voucher50 = validate.checkNumber(scanner.nextLine());
        for (int i = 0; i < voucher10; i++) {
            if (!bookingStack.isEmpty()) {
                customer.setCode(bookingStack.pop().getCodeCustomer());
                int index = customerList.indexOf(customer);
                if (index != -1) {
                    System.out.println(customerList.get(index) + " : voucher 10%");
                }
            }
        }
        for (int i = 0; i < voucher20; i++) {
            if (!bookingStack.isEmpty()) {
                customer.setCode(bookingStack.pop().getCodeCustomer());
                int index = customerList.indexOf(customer);
                if (index != -1) {
                    System.out.println(customerList.get(index) + " : voucher 20%");
                }
            }
        }
        for (int i = 0; i < voucher50; i++) {
            if (!bookingStack.isEmpty()) {
                customer.setCode(bookingStack.pop().getCodeCustomer());
                int index = customerList.indexOf(customer);
                if (index != -1) {
                    System.out.println(customerList.get(index) + " : voucher 50%");
                }
            }
        }
    }

//    public static void main(String[] args) {
//        PromotionServiceImpl promotionService = new PromotionServiceImpl();
//        promotionService.getVoucher();
//    }
}

