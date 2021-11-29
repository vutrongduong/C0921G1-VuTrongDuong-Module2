package case_study.services.impl;


import case_study.models.Booking;
import case_study.models.Contract;
import case_study.services.ContactService;
import case_study.utils.FileCSV;

import java.util.*;

public class ContactServicelmpl implements ContactService {
    Scanner scanner = new Scanner(System.in);
    final String path = "D:\\codegym\\FuramaResort\\src\\data\\contract.csv";
    BookingServicelmpl bookingServicelmpl = new BookingServicelmpl();
    Set<Contract> contractSet = new TreeSet<>();
    Queue<Booking> bookingQueue = new LinkedList<>();

    {
        contractSet = convertRead();
    }

    @Override
    public void display() {
        for (Contract contract : contractSet) {
            System.out.println(contract);
        }
    }

    @Override
    public void add() {
        bookingQueue.addAll(bookingServicelmpl.bookingSet);
        Booking booking = bookingQueue.poll();
        String codeBooking = booking.getCodeBooking();
        String codeCustomer = booking.getCodeCustomer();
        System.out.println("Code booking" + codeBooking);
        System.out.println("Code customer" + codeCustomer);
        System.out.println("Enter number contract");
        double numberContract = Double.parseDouble(scanner.nextLine());
        Contract contract = new Contract();
        contract.setNumberContract(numberContract);
        while (!contractSet.contains(contract)) {
            System.err.println("Constract  does exist");
            numberContract = Double.parseDouble(scanner.nextLine());
            contract.setNumberContract(numberContract);
        }
        System.out.println("Enter deposits ");
        double deposits = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter total payment");
        double totalPayment = Double.parseDouble(scanner.nextLine());
        contractSet.add(new Contract(numberContract, codeBooking, deposits, totalPayment, codeCustomer));
        FileCSV.writeFileCSV(convertWrite(), path);
    }

    @Override
    public void editConstracts() {
        display();
        System.out.println("Enter number contract want edit");
        double numberConstract = Double.parseDouble(scanner.nextLine());
        Contract contract = new Contract();
        contract.setNumberContract(numberConstract);
        while (!contractSet.contains(contract)) {
            System.err.println("Constract  does not exist");
            numberConstract = Double.parseDouble(scanner.nextLine());
            contract.setNumberContract(numberConstract);
        }
        for (Contract contractEdit : contractSet) {
            int choice = 0;
            System.out.println(contractEdit);
            while (choice != 6) {
                System.out.println("===================================");
                System.out.println("1.\tEdit number contract\n" +
                        "2.\tEdit Edit code booking\n" +
                        "3.\tEdit code customer\n" +
                        "4.\tEdit depostis \n" +
                        "5.\tEdit total payment \n" +
                        "6.\tReturn main menu\n");
                choice = Integer.parseInt(scanner.nextLine());
                System.out.println(contractEdit);
                switch (choice) {
                    case 1:
                        System.out.println("Enter number contract");
                        contractEdit.setNumberContract(Double.parseDouble(scanner.nextLine()));
                        while (contractSet.contains(contractEdit)) {
                            System.err.println("Contract already exists , re-enter number contract");
                            contractEdit.setNumberContract(Double.parseDouble(scanner.nextLine()));
                        }
                        break;
                    case 2:
                        System.out.println("Enter code booking");
                        contractEdit.setCodeBooking(scanner.nextLine());
                        break;
                    case 3:
                        System.out.println("Enter code customer");
                        contractEdit.setCodeCustomer(scanner.nextLine());
                        break;
                    case 4:
                        System.out.println("Enter deposits ");
                        contractEdit.setDeposits(Double.parseDouble(scanner.nextLine()));
                        break;
                    case 5:
                        System.out.println("Enter total payment");
                        contractEdit.setTotalPayment(Double.parseDouble(scanner.nextLine()));
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("Enter number 1 to 6, re-enter");
                }
            }
        }
        FileCSV.writeFileCSV(convertWrite(), path);
    }

    @Override
    public List<String> convertWrite() {
        List<String> stringList = new ArrayList<>();
        for (Contract contract : contractSet) {
            stringList.add(contract.toString());
        }
        return stringList;
    }

    @Override
    public Set<Contract> convertRead() {
        List<String> stringList = FileCSV.readFileCSV(path);
        String[] arr;
        for (String line : stringList) {
            arr = line.split(",");
            contractSet.add(new Contract(Double.parseDouble(arr[0]), arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]), arr[4]));
        }
        return contractSet;
    }
}
