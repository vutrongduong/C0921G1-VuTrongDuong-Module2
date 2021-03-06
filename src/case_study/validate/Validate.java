package case_study.validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Validate {
    static Scanner scanner = new Scanner(System.in);

    private Validate() {
    }

    public static String code() {
        final String regex = "^(SV)(VL|HO|RO)-(\\d{4}$)";
        System.out.println("Enter code service ");
        String code = scanner.nextLine();
        while (!code.matches(regex)) {
            System.out.println("Service code must be true format: SVXX-YYYY, with YYYY is the number from 0-9, XX is:\n" +
                    "If is Villa, XX will be VL\n" +
                    "If is House, XX will be HO\n" +
                    "If Room, XX will be RO");
            code = scanner.nextLine();
            code.matches(regex);
        }
        return code;
    }

    public static String name() {
        final String regex = "^([A-Z]\\w+)*$";
        System.out.println("Enter Area ");
        String name = scanner.nextLine();
        while (!name.matches(regex)) {
            System.out.println("Name service must capitalize the first character, the following characters are normal characters");
            name = scanner.nextLine();
            name.matches(regex);
        }
        return name;
    }

    public static double area() {
        final String regex = "^[3-9]\\d{1,}$";
        System.out.println("Enter area service ");
        String area = scanner.nextLine();
        while (!area.matches(regex)) {
            System.out.println("Usable area and pool area must be real numbers greater than 30m2");
            area = scanner.nextLine();
            area.matches(regex);
        }
        return Double.parseDouble(area);
    }

    public static int expense() {
        final String regex = "^\\d+$";
        System.out.println("Enter expense service ");
        String area = scanner.nextLine();
        while (!area.matches(regex)) {
            System.out.println("Rent must be a positive number");
            area = scanner.nextLine();
            area.matches(regex);
        }
        return Integer.parseInt(area);
    }

    public static int numbeOfPeople() {
        while (true) {
            try {
                System.out.println("Enter number of people ");
                int numbeOfPeople = Integer.parseInt(scanner.nextLine());
                if (numbeOfPeople > 0 && numbeOfPeople < 20) {
                    return numbeOfPeople;
                } else {
                    System.out.println("Maximum volume must be > 0 and less than < 20 ,re-enter");
                }
            } catch (NumberFormatException e) {
                System.out.println("Maximum volume must be > 0 and less than < 20 ,re-enter");
            }
        }
    }

    public static int numberOfFloors() {
        final String regex = "^\\d+$";
        System.out.println("Enter number of floors ");
        String numberOfFloors = scanner.nextLine();
        while (!numberOfFloors.matches(regex)) {
            System.out.println("The number of floors must be a positive integer");
            numberOfFloors = scanner.nextLine();
            numberOfFloors.matches(regex);
        }
        return Integer.parseInt(numberOfFloors);
    }

    public static String rentStyle() {
        final String regex = "^([A-Z]\\w+)*$";
        System.out.println("Enter rent style ");
        String rentStyle = scanner.nextLine();
        while (!rentStyle.matches(regex)) {
            System.err.println("Rent style must capitalize the first character, the following characters are normal characters");
            rentStyle = scanner.nextLine();
            rentStyle.matches(regex);
        }
        return rentStyle;
    }

    public static String roomStandard() {
        final String regex = "^([A-Z]\\w+)*$";
        System.out.println("Enter room stacdard ");
        String roomStandard = scanner.nextLine();
        while (!roomStandard.matches(regex)) {
            System.err.println("Room standard must capitalize the first character, the following characters are normal characters");
            roomStandard = scanner.nextLine();
            roomStandard.matches(regex);
        }
        return roomStandard;
    }

    public static double areaPool() {
        final String regex = "^[3-9]\\d{1,}$";
        System.out.println("Enter the pool area ");
        String area = scanner.nextLine();
        while (!area.matches(regex)) {
            System.err.println("Pool area must be real numbers greater than 30m2");
            area = scanner.nextLine();
            area.matches(regex);
        }
        return Double.parseDouble(area);
    }

    public static String level() {
        List<String> levelList = new ArrayList<>();
        {
            levelList.add("Intermediate");
            levelList.add("College");
            levelList.add("University");
            levelList.add("Postgraduate");
        }
        System.out.println("Enter level . Levels include: Intermediate, College, University and Postgraduate");
        String level = scanner.nextLine();
        while (!levelList.contains(level)) {
            System.err.println("Wrong level ,Levels include: Intermediate, College, University and Postgraduate");
            level = scanner.nextLine();
        }
        return level;
    }

    public static String position() {
        List<String> positionList = new ArrayList<>();
        {
            positionList.add("Receptionist");
            positionList.add("Waiter");
            positionList.add("Specialist");
            positionList.add("Supervisor");
            positionList.add("Manager");
            positionList.add("Director");
        }
        System.out.println("Enter position : Receptionist, Waiter, Specialist, Supervisor, Manager, Director");
        String level = scanner.nextLine();
        while (!positionList.contains(level)) {
            System.err.println("Wrong position , positions include: Receptionist, Waiter, Specialist, Supervisor, Manager, Director");
            level = scanner.nextLine();
        }
        return level;
    }

    public static String email() {
        final String regex = "^\\w+@\\w+[.]\\w+$";
        while (true) {
            System.out.println("Enter Email  : ");
            String email = scanner.nextLine();
            if (email.matches(regex)) {
                return email;
            } else {
                System.err.println("Invalid data , please re-enter email with fomat <account name>@<domain>.(eg:annguyen@gmail.com");
            }
        }
    }

    public static String customerType() {
        List<String> customerTypeList = new ArrayList<>();
        {
            customerTypeList.add("Diamonds");
            customerTypeList.add("Platinum");
            customerTypeList.add("Gold");
            customerTypeList.add("Silver");
            customerTypeList.add("Members");
        }
        System.out.println("Enter customer styple ,Customer style include: (Diamonds, Platinum, Gold, Silver, Members)");
        String customerType = scanner.nextLine();
        while (!customerTypeList.contains(customerType)) {
            System.err.println("Wrong customer type ,Customer styple include: (Diamonds, Platinum, Gold, Silver, Members)");
            customerType = scanner.nextLine();
        }
        return customerType;
    }

    public static int checkNumber(String number) {
        final String regex = "^\\d+$";
        while (!number.matches(regex)) {
            System.err.println("Invalid data , please re-enter ");
            number = scanner.nextLine();
        }
        return Integer.parseInt(number);
    }

    public static String checkDay(String day) {
        final String regex = "^\\d{2}/\\d{2}/\\d{4}$";
        while (!day.matches(regex)) {
            System.err.println("Invalid data, please re-enter by fomrmat in : dd/MM/yyyy ");
            day = scanner.nextLine();
        }
        return day;
    }

    public static String checkCodeBooking(String code) {
        final String regex = "^BO-\\d{2}$";
        while (!code.matches(regex)) {
            System.out.println("Invalid data, please re-enter by fomrmat in : BO-XX\n X is number to 0-9");
            code = scanner.nextLine();
        }
        return code;
    }

    public static String checkCodeCustomer(String code) {
        final String regex = "^CU-\\d{2}$";
        while (!code.matches(regex)) {
            System.out.println("Invalid data, please re-enter by fomrmat in : CU-XX\n X is number to 0-9");
            code = scanner.nextLine();
        }
        return code;
    }
}





