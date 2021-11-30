package case_study.controllers;

import case_study.services.*;
import case_study.services.impl.*;

import java.util.Scanner;

public class FuramaController {
    EmployeeService employeeService = new EmployeeServiceImpl();
    CustomerService customerService = new CustomerServiceImpl();
    FacilityService facilityService = new FacilityServiceImpl();
    BookingService bookingService = new BookingServicelmpl();
    PromotionServiceImpl promotionService = new PromotionServiceImpl();

    public void displayMainMenu() {
        int choice;
        int choice1;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    do {
                        System.out.println("1\tDisplay list employees\n" +
                                "2\tAdd new employee\n" +
                                "3\tEdit employee\n" +
                                "4\tReturn main menu\n");
                        choice1 = Integer.parseInt(scanner.nextLine());
                        switch (choice1) {
                            case 1:

                                employeeService.display();
                                break;
                            case 2:
                                employeeService.add();
                                break;
                            case 3:
                                employeeService.edit();
                                break;
                        }
                    } while (choice1 != 4);
                    break;

                case 2:
                    do {
                        System.out.println("1.\tDisplay list customers\n" +
                                "2.\tAdd new customer\n" +
                                "3.\tEdit customer\n" +
                                "4.\tReturn main menu\n");
                        choice1 = Integer.parseInt(scanner.nextLine());
                        switch (choice1) {
                            case 1:
                                customerService.display();
                                break;
                            case 2:
                                customerService.add();
                                break;
                            case 3:
                                customerService.edit();
                                break;
                        }
                    } while (choice1 != 4);
                    break;
                case 3:
                    do {
                        System.out.println("==================================");
                        System.out.println("1\tDisplay list facility\n" +
                                "2\tAdd new facility\n" +
                                "3\tDisplay list facility maintenance\n" +
                                "4\tReturn main menu\n");
                        choice1 = Integer.parseInt(scanner.nextLine());
                        switch (choice1) {
                            case 1:
                                facilityService.display();
                                break;
                            case 2:
                                facilityService.add();
                                break;
                            case 3:
                                facilityService.displayFacilityMaintenance();
                                break;
                        }
                    } while (choice1 != 4);
                    break;
                case 4:
                    do {
                        System.out.println("1.\tAdd new booking\n" +
                                "2.\tDisplay list booking\n" +
                                "3.\tCreate new constracts\n" +
                                "4.\tDisplay list contracts\n" +
                                "5.\tEdit contracts\n" +
                                "6.\tReturn main menu\n");
                        choice1 = Integer.parseInt(scanner.nextLine());
                        switch (choice1) {
                            case 1:
                                bookingService.add();
                                break;
                            case 2:
                                bookingService.display();
                                break;
                            case 3:
                                bookingService.addContact();
                                break;
                            case 4:
                                bookingService.displayContact();
                                break;
                            case 5:
                                bookingService.editConstracts();
                                break;
                            case 6:
                                break;
                            default:
                                System.out.println("Enter number 1 to 6");

                        }
                    } while (choice1 != 6);
                    break;
                case 5:
                    do {
                        System.out.println("1.\tDisplay list customers use service\n" +
                                "2.\tDisplay list customers get voucher\n" +
                                "3.\tReturn main menu\n");
                        choice1 = Integer.parseInt(scanner.nextLine());
                        switch (choice1) {
                            case 1:
                                promotionService.displayListCustomer();
                                break;
                            case 2:
                                promotionService.getVoucher();
                                break;
                        }
                    } while (choice1 != 3);
                case 6:
                    break;
            }
        } while (choice != 6);
    }
}
