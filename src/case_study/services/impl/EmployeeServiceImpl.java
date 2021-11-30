package case_study.services.impl;


import case_study.models.Employee;
import case_study.validate.Validate;
import case_study.services.EmployeeService;
import case_study.utils.FileCSV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static final String path = "D:\\codegym\\C0921G1-VuTrongDuong-Module2\\src\\case_study\\data\\employee.csv";
    public List<Employee> employeeList = new ArrayList<>();
    Validate validate = new Validate();

    Scanner scanner = new Scanner(System.in);

    {
        employeeList = convertRead();
    }

    @Override
    public void display() {
        for (Employee ele : employeeList) {
            System.out.print(ele);
        }
    }

    @Override
    public void add() {
        System.out.print("Enter code ");
        String code = scanner.nextLine();
        Employee employee = new Employee();
        employee.setCode(code);
        while (employeeList.contains(employee)) {
            System.err.print("Employee does exist , re-enter");
            code = scanner.nextLine();
            employee.setCode(code);
        }

        System.out.print("Enter name ");
        String name = scanner.nextLine();
        System.out.print("Enter birth date ");
        String birthDate = validate.checkDay(scanner.nextLine());
        System.out.print("Enter gender ");
        String gender = scanner.nextLine();
        System.out.print("Enter idNumber ");
        int idNumber = validate.checkNumber(scanner.nextLine());
        System.out.print("Enter phone ");
        String phone = scanner.nextLine();
        String email = validate.email();
        String level = validate.level();
        String position = validate.position();
        System.out.print("Enter salary ");
        int salary = validate.checkNumber(scanner.nextLine());
        new Employee(code, birthDate, name, gender, idNumber, phone, email, level, position, salary);
        employeeList.add(new Employee(code, birthDate, name, gender, idNumber, phone, email, level, position, salary));
        FileCSV.writeFileCSV(convertWrite(), path);
    }

    @Override
    public void edit() {
        display();
        System.out.print("Enter the code the employee wants edit ");
        String codeEdit = scanner.nextLine();
        Employee employee = new Employee();
        employee.setCode(codeEdit);
        while (!employeeList.contains(employee)) {
            System.err.print("Employee does not exist , re-enter");
            codeEdit = scanner.nextLine();
            employee.setCode(codeEdit);
        }

        for (Employee employeeEdit : employeeList) {
            if (employeeEdit.getCode().equals(codeEdit)) {
                int choice = 0;
                while (choice != 11) {
                    System.out.print("===================================");
                    System.out.print(employeeEdit);
                    System.out.print("1.\tEdit code employee\n" +
                            "2.\tEdit name \n" +
                            "3.\tEdit birth date \n" +
                            "4.\tEdit gender \n" +
                            "5.\tEdit idNumber \n" +
                            "6.\tEdit phone \n" +
                            "7.\tEdit email \n" +
                            "8.\tEdit level \n" +
                            "9.\tEdit position\n" +
                            "10.\tEdit salary\n" +
                            "11.\tReturn main menu\n");
                    choice = validate.checkNumber(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            System.out.print("Enter code employee");
                            String code = scanner.nextLine();
                            employeeEdit.setCode(code);
                            while (employeeList.contains(employeeEdit)) {
                                System.err.print("Customer does not exist ,re-enter");
                                code = scanner.nextLine();
                                employeeEdit.setCode(code);
                            }
                            break;
                        case 2:
                            System.out.print("Enter name");
                            employeeEdit.setName(scanner.nextLine());
                            break;
                        case 3:
                            System.out.print("Enter birthdate");
                            employeeEdit.setBirthDate(scanner.nextLine());
                            break;
                        case 4:
                            System.out.print("Enter gender ");
                            employeeEdit.setGender(scanner.nextLine());
                            break;
                        case 5:
                            System.out.print("Enter idNumber");
                            employeeEdit.setIdNumber(Integer.parseInt(scanner.nextLine()));
                            break;
                        case 6:
                            System.out.print("Enter phone");
                            employeeEdit.setPhone(scanner.nextLine());
                            break;
                        case 7:
                            System.out.print("Enter email");
                            employeeEdit.setEmail(validate.email());
                            break;
                        case 8:
                            System.out.print("Enter level");
                            employeeEdit.setLevel(validate.customerType());
                            break;
                        case 9:
                            System.out.print("Enter position");
                            employeeEdit.setPosition(scanner.nextLine());
                            break;
                        case 10:
                            System.out.print("Enter salary");
                            employeeEdit.setSalary(Integer.parseInt(scanner.nextLine()));
                            break;
                        case 11:
                            break;
                        default:
                            System.out.print("Enter number 1 to 11, re-enter");
                    }
                }
            }
        }
        FileCSV.writeFileCSV(convertWrite(), path);
    }

    @Override
    public List<String> convertWrite() {
        List<String> stringList = new ArrayList<>();
        for (Employee employee : employeeList) {
            stringList.add(employee.toString());
        }
        return stringList;
    }

    @Override
    public List<Employee> convertRead() {
        List<String> stringList = FileCSV.readFileCSV(path);
        String[] arr;
        for (String line : stringList) {
            arr = line.split(",");
            employeeList.add(new Employee(arr[0], arr[1], arr[2], arr[3], Integer.parseInt(arr[4]), arr[5], arr[6], arr[7], arr[8], Integer.parseInt(arr[9])));
        }
        return employeeList;
    }
}
