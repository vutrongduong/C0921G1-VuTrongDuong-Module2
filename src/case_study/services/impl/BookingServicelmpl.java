package case_study.services.impl;

import case_study.models.Booking;
import case_study.models.Contract;
import case_study.models.facility.Facility;
import case_study.services.BookingService;
import case_study.services.ContactService;
import case_study.utils.FileCSV;
import case_study.validate.Validate;

import java.util.*;

public class BookingServicelmpl implements BookingService, ContactService {
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    private FacilityServiceImpl facilityService = new FacilityServiceImpl();
    final String pathContact = "D:\\codegym\\C0921G1-VuTrongDuong-Module2\\src\\case_study\\data\\contract.csv";
    static final String pathBooking = "D:\\codegym\\C0921G1-VuTrongDuong-Module2\\src\\case_study\\data\\booking.csv";
    static List<Contract> contractList = new ArrayList<>();
    private Queue<Booking> bookingQueue = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    {
        bookingSet = convertRead();
        contractList = convertReadContact();
        bookingQueue.addAll(bookingSet);
    }

    @Override
    public void display() {
        for (Booking booking : bookingSet) {
            System.out.println(booking);
        }
    }

    @Override
    public void add() {
        System.out.print("Enter code booking by fomrmat in : BO-XX (X is number to 0-9) ");
        String codeBooking = Validate.checkCodeBooking(scanner.nextLine());
        System.out.print("Enter day start ");
        String dayStart = Validate.checkDay(scanner.nextLine());
        System.out.print("Enter day end ");
        String dayEnd = Validate.checkDay(scanner.nextLine());
        customerService.display();
        System.out.println("Enter code customer ");
        String codeCustomer = scanner.nextLine();
        facilityService.display();
        System.out.print("Enter code service ");
        String nameService = scanner.nextLine();
        System.out.print("Enter type of service ");
        String typeOfService = scanner.nextLine();
        bookingSet.add(new Booking(codeBooking, dayStart, dayEnd, codeCustomer, nameService, typeOfService));
        FileCSV.writeFileCSV(convertWrite(), pathBooking);
    }

    public Set<Booking> convertRead() {
        List<String> stringList = FileCSV.readFileCSV(pathBooking);
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

    @Override
    public void displayContact() {
        for (Contract contract : contractList) {
            System.out.println(contract);
        }
    }

    @Override
    public void addContact() {
        // chuy???n danh s??ch booking ???????c s???p x???p theo ng??y v??o h??ng ?????i
        Booking booking = bookingQueue.poll();
        // l???y ???????c booking s???m nh???t
        boolean flag = true;
        for (Booking bookinCheck : bookingSet) {
            for (Contract contract : contractList) {
                if (!(bookinCheck.getCodeBooking().equals(contract.getCodeBooking()))) {
                    flag = false;
                    continue;
                } else {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                booking = bookinCheck;
                break;
            }
        }
        String codeBooking = booking.getCodeBooking();
        String codeCustomer = booking.getCodeCustomer();
        System.out.println("Code booking : " + codeBooking);
        System.out.println("Code customer : " + codeCustomer);
        System.out.print("Enter number contact ");
        int numberContract = Validate.checkNumber(scanner.nextLine());
        Contract contract = new Contract();
        contract.setNumberContract(numberContract);
        while (contractList.contains(contract)) {
            System.err.print("Contact does exist ");
            numberContract = Validate.checkNumber(scanner.nextLine());
            contract.setNumberContract(numberContract);
        }
        System.out.print("Enter deposits ");
        int deposits = Validate.checkNumber(scanner.nextLine());
        Map<Facility, Integer> facilityIntegerMap = facilityService.facilityList();
        int totalPayment = 0;
        for (Facility key : facilityIntegerMap.keySet()) {
            if (key.getCodeService().equals(booking.getNameService())) {
                System.out.println("Total payment : " + key.getExpense());
                totalPayment = key.getExpense();
            }
        }
        contractList.add(new Contract(numberContract, codeBooking, deposits, totalPayment, codeCustomer));
        FileCSV.writeFileCSV(convertWriteContact(), pathContact);
    }

    @Override
    public void editConstracts() {
        displayContact();
        System.out.print("Enter number contact want edit ");
        int numberConstract = Validate.checkNumber(scanner.nextLine());
        Contract contract = new Contract();
        contract.setNumberContract(numberConstract);
        while (!contractList.contains(contract)) {
            System.err.print("Contact  does not exist ");
            numberConstract = Validate.checkNumber(scanner.nextLine());
            contract.setNumberContract(numberConstract);
        }//ch??? cho edit h???p ?????ng ???? t???n t???i
        for (Contract contractEdit : contractList) {
            int choice = 0;
            System.out.print(contractEdit);
            while (choice != 6) {
                System.out.println("1.\tEdit number contact\n" +
                        "2.\tEdit Edit code booking\n" +
                        "3.\tEdit code customer\n" +
                        "4.\tEdit depostis \n" +
                        "5.\tEdit total payment \n" +
                        "6.\tReturn main menu\n");
                choice = Validate.checkNumber(scanner.nextLine());
                System.out.print(contractEdit);
                switch (choice) {
                    case 1:
                        System.out.print("Enter number contract ");
                        contractEdit.setNumberContract(Integer.parseInt(scanner.nextLine()));
                        while (contractList.contains(contractEdit)) {
                            System.err.print("Contract already exists , re-enter number contract ");
                            contractEdit.setNumberContract(Integer.parseInt(scanner.nextLine()));
                        }
                        break;
                    case 2:
                        System.out.print("Enter code booking ");
                        contractEdit.setCodeBooking(scanner.nextLine());
                        break;
                    case 3:
                        System.out.print("Enter code customer ");
                        contractEdit.setCodeCustomer(scanner.nextLine());
                        break;
                    case 4:
                        System.out.print("Enter deposits ");
                        contractEdit.setDeposits(Validate.checkNumber(scanner.nextLine()));
                        break;
                    case 5:
                        System.out.print("Enter total payment ");
                        contractEdit.setTotalPayment(Validate.checkNumber(scanner.nextLine()));
                        break;
                    case 6:
                        break;
                    default:
                        System.out.print("Enter number 1 to 6, re-enter ");
                }
            }
        }
        FileCSV.writeFileCSV(convertWriteContact(), pathContact);
    }

    @Override
    public List<String> convertWriteContact() {
        List<String> stringList = new ArrayList<>();
        for (Contract contract : contractList) {
            stringList.add(contract.toString());
        }
        return stringList;
    }

    @Override
    public List<Contract> convertReadContact() {
        List<String> stringList = FileCSV.readFileCSV(pathContact);
        String[] arr;
        for (String line : stringList) {
            arr = line.split(",");
            contractList.add(new Contract(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4]));
        }
        return contractList;
    }

    public Set<Booking> bookingSet() {
        return bookingSet;
    }
}

