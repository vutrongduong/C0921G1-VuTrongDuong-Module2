package case_study.services.impl;

import case_study.models.Customer;
import case_study.models.facility.Validate;
import case_study.services.CustomerService;
import case_study.utils.FileCSV;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    static final String path = "D:\\codegym\\FuramaResort\\src\\data\\customer.csv";
    static List<Customer> customerList = new LinkedList<>();
    Validate validate = new Validate();
    Scanner scanner = new Scanner(System.in);

    static {
        customerList = convertRead();
    }


    @Override
    public void display() {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void add() {
        System.out.println("Enter Code ");
        String code = scanner.nextLine();
        Customer customer = new Customer();
        customer.setCode(code);
        while (!customerList.contains(customer)) {
            System.err.println("Customer does exist");
            code = scanner.nextLine();
            customer.setCode(code);
        }
        System.out.println("Enter Name ");
        String name = scanner.nextLine();
        System.out.println("Enter birth date ");
        String birthDate = scanner.nextLine();
        System.out.println("Enter Gender ");
        String gender = scanner.nextLine();
        System.out.println("Enter Id Number ");
        int idNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Phone ");
        String phone = scanner.nextLine();
        String email = validate.email();
        String customerType = validate.customerType();
        System.out.println("Enter Address");
        String address = scanner.nextLine();
        customerList.add(new Customer(code, name, birthDate, gender, idNumber, phone, email, customerType, address));
        FileCSV.writeFileCSV(convertWrite(), path);
    }

    @Override
    public void edit() {
        display();
        System.out.println("Enter the code the customer wants edit ");
        String codeEdit = scanner.nextLine();
        Customer customer = new Customer();
        customer.setCode(codeEdit);
        while (!customerList.contains(customer)) {
            System.err.println("Customer does not exist");
            codeEdit = scanner.nextLine();
            customer.setCode(codeEdit);
        }
        for (Customer customerEdit : customerList) {
            if (customerEdit.getCode().equals(codeEdit)) {
                int choice = 0;
                while (choice != 10) {
                    System.out.println("===================================");
                    System.out.println(customerEdit);
                    System.out.println("1.\tEdit code customer\n" +
                            "2.\tEdit name \n" +
                            "3.\tEdit birth date \n" +
                            "4.\tEdit gender \n" +
                            "5.\tEdit idNumber \n" +
                            "6.\tEdit phone \n" +
                            "7.\tEdit email \n" +
                            "8.\tEdit Customer Type \n" +
                            "9.\tEdit address\n" +
                            "10.\tReturn main menu\n");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            System.out.println("Enter code customer");
                            String code = scanner.nextLine();
                            customerEdit.setCode(code);
                            while (customerList.contains(customerEdit)) {
                                System.err.println("Customer does not exist");
                                customerEdit.setCode(scanner.nextLine());
                            }
                            break;
                        case 2:
                            System.out.println("Enter name");
                            customerEdit.setName(scanner.nextLine());
                            break;
                        case 3:
                            System.out.println("Enter birthdate");
                            customerEdit.setBirthDate(scanner.nextLine());
                            break;
                        case 4:
                            System.out.println("Enter gender ");
                            customerEdit.setGender(scanner.nextLine());
                            break;
                        case 5:
                            System.out.println("Enter idNumber");
                            customerEdit.setIdNumber(Integer.parseInt(scanner.nextLine()));
                            break;
                        case 6:
                            System.out.println("Enter phone");
                            customerEdit.setPhone(scanner.nextLine());
                            break;
                        case 7:
                            System.out.println("Enter email");
                            customerEdit.setEmail(validate.email());
                            break;
                        case 8:
                            System.out.println("Enter Customer Type");
                            customerEdit.setLoaiKhach(validate.customerType());
                            break;
                        case 9:
                            System.out.println("Enter address");
                            customerEdit.setAddress(scanner.nextLine());
                            break;
                        case 10:
                            break;
                        default:
                            System.out.println("Enter number 1 to 10, re-enter");
                    }
                }
            }
        }
        FileCSV.writeFileCSV(convertWrite(), path);
    }


    @Override
    public List<String> convertWrite() {
        List<String> stringList = new ArrayList<>();
        for (Customer customer : customerList) {
            stringList.add(customer.toString());
        }
        return stringList;
    }

    public static List<Customer> convertRead() {
        List<String> stringList = FileCSV.readFileCSV(path);
        String[] arr;
        for (String line : stringList) {
            arr = line.split(",");
            customerList.add(new Customer(arr[0], arr[1], arr[2], arr[3], Integer.parseInt(arr[4]), arr[5], arr[6], arr[7], arr[8]));
        }
        return customerList;
    }
}
