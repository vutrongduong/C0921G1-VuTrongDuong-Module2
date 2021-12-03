package case_study.services.impl;

import case_study.models.Customer;
import case_study.validate.Validate;
import case_study.services.CustomerService;
import case_study.utils.FileCSV;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    static final String path = "D:\\codegym\\C0921G1-VuTrongDuong-Module2\\src\\case_study\\data\\customer.csv";
    private List<Customer> customerList = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    {
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
        System.out.print("Enter Code ");
        String code = Validate.checkCodeCustomer(scanner.nextLine());
        Customer customer = new Customer();
        customer.setCode(code);
        while (customerList.contains(customer)) {
            System.err.println("Customer does exist");
            code = scanner.nextLine();
            customer.setCode(code);
        }
        System.out.print("Enter Name ");
        String name = scanner.nextLine();
        System.out.print("Enter birth date ");
        String birthDate = Validate.checkDay(scanner.nextLine());
        System.out.print("Enter Gender ");
        String gender = scanner.nextLine();
        System.out.print("Enter Id Number ");
        int idNumber = Validate.checkNumber(scanner.nextLine());
        System.out.print("Enter Phone ");
        String phone = scanner.nextLine();
        String email = Validate.email();
        String customerType = Validate.customerType();
        System.out.print("Enter Address");
        String address = scanner.nextLine();
        customerList.add(new Customer(code, name, birthDate, gender, idNumber, phone, email, customerType, address));
        FileCSV.writeFileCSV(convertWrite(), path);
    }

    @Override
    public void edit() {
        display();
        System.out.print("Enter the code the customer wants edit ");
        String codeEdit = Validate.checkCodeCustomer(scanner.nextLine());
        Customer customer = new Customer();
        customer.setCode(codeEdit);
        while (!customerList.contains(customer)) {
            System.err.print("Customer does not exist");
            codeEdit = scanner.nextLine();
            customer.setCode(codeEdit);
        }
        for (Customer customerEdit : customerList) {
            if (customerEdit.getCode().equals(codeEdit)) {
                int choice = 0;
                while (choice != 10) {
                    System.out.print("===================================");
                    System.out.print(customerEdit);
                    System.out.print("1.\tEdit code customer\n" +
                            "2.\tEdit name \n" +
                            "3.\tEdit birth date \n" +
                            "4.\tEdit gender \n" +
                            "5.\tEdit idNumber \n" +
                            "6.\tEdit phone \n" +
                            "7.\tEdit email \n" +
                            "8.\tEdit Customer Type \n" +
                            "9.\tEdit address\n" +
                            "10.\tReturn main menu\n");
                    choice = Validate.checkNumber(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            System.out.print("Enter code customer ");
                            String code = Validate.checkCodeCustomer(scanner.nextLine());
                            customerEdit.setCode(code);
                            while (customerList.contains(customerEdit)) {
                                System.err.print("Customer does not exist ");
                                customerEdit.setCode(scanner.nextLine());
                            }
                            break;
                        case 2:
                            System.out.print("Enter name ");
                            customerEdit.setName(scanner.nextLine());
                            break;
                        case 3:
                            System.out.print("Enter birthdate ");
                            customerEdit.setBirthDate(Validate.checkDay(scanner.nextLine()));
                            break;
                        case 4:
                            System.out.print("Enter gender ");
                            customerEdit.setGender(scanner.nextLine());
                            break;
                        case 5:
                            System.out.print("Enter idNumber ");
                            customerEdit.setIdNumber(Validate.checkNumber(scanner.nextLine()));
                            break;
                        case 6:
                            System.out.print("Enter phone ");
                            customerEdit.setPhone(scanner.nextLine());
                            break;
                        case 7:
                            System.out.print("Enter email ");
                            customerEdit.setEmail(Validate.email());
                            break;
                        case 8:
                            System.out.print("Enter Customer Type ");
                            customerEdit.setLoaiKhach(Validate.customerType());
                            break;
                        case 9:
                            System.out.print("Enter address");
                            customerEdit.setAddress(scanner.nextLine());
                            break;
                        case 10:
                            break;
                        default:
                            System.out.print("Enter number 1 to 10, re-enter");
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

    @Override
    public List<Customer> convertRead() {
        List<String> stringList = FileCSV.readFileCSV(path);
        String[] arr;
        for (String line : stringList) {
            arr = line.split(",");
            customerList.add(new Customer(arr[0], arr[1], arr[2], arr[3], Integer.parseInt(arr[4]), arr[5], arr[6], arr[7], arr[8]));
        }
        return customerList;
    }

    public List<Customer> customerList() {
        return customerList;
    }
}
