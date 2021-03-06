package review.service.impl;

import review.model.Candidates;
import review.model.Intern;
import review.service.InternService;
import review.validate.Check;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Internimpl implements InternService {
    List<Candidates> internList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Check check = new Check();

    {
        internList.add(new Intern(1, "Maria", "Madeleine", 1989, "Sao paulo", 1234567890, "eva@asante.com", 0, "Accountant", 1, "Amity University Delhi"));
        internList.add(new Intern(2, "Csokán", "Babett", 1990, "England", 1234567890, "babett@asante.com", 1, "Marketing", 2, "Amravati University"));
        internList.add(new Intern(3, "Joana", "Filipa", 1991, "Rio de janero", 1234567890, "filipa@asante.com", 2, "Ecommerce", 2, "Amrita Institute Of Technology Science"));
        internList.add(new Intern(4, "Patricia", "Carine", 1992, "Spain", 1234567890, "carine@asante.com", 1, "Office administration", 1, "Amrita Vishwa Vidyapeetham University"));
    }

    @Override
    public void add() {
        do {
            System.out.println("Enter id : ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter first name : ");
            String firstName = scanner.nextLine();
            System.out.println("Enter lat name : ");
            String lastName = scanner.nextLine();
            int birthDate = check.checkBirthDate();
            System.out.println("Enter Address : ");
            String address = scanner.nextLine();
            System.out.println("Enter Phone : ");
            double phone = check.checkPhone();
            String email = check.checkEmail();
            System.out.println("Enter candidates type :");
            int candidatesType = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter majors : ");
            String majors = scanner.nextLine();
            System.out.println("Enter semester : ");
            int semester = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter University name : ");
            String universityName = scanner.nextLine();
            internList.add(new Intern(id, firstName, lastName, birthDate, address, phone, email, candidatesType, majors, semester, universityName));
            System.out.println(" Do you want to continue (Y/N)?");
            String choice = scanner.nextLine();
            if (choice.equals("N")) {
                for (Candidates ele : internList) {
                    System.out.println(ele);
                }
                break;
            }
        } while (true);
    }

    @Override
    public void update() {
        for (Candidates intern : internList) {
            System.out.println("Id:" + (intern.getId() + " - " + intern));
        }
        System.out.println("Enter id : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter first name : ");
        String firstName = scanner.nextLine();
        System.out.println("Enter lat name : ");
        String lastName = scanner.nextLine();
        int birthDate = check.checkBirthDate();
        System.out.println("Enter Address : ");
        String address = scanner.nextLine();
        System.out.println("Enter Phone : ");
        double phone = check.checkPhone();
        String email = check.checkEmail();
        System.out.println("Enter candidates type :");
        int candidatesType = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter majors : ");
        String majors = scanner.nextLine();
        System.out.println("Enter semester : ");
        int semester = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter University name : ");
        String universityName = scanner.nextLine();
        Intern intern = new Intern(id, firstName, lastName, birthDate, address, phone, email, candidatesType, majors, semester, universityName);
        int index = internList.indexOf(intern);
        if (index == -1) {
            internList.add(intern);
        } else {
            internList.set(index, intern);
        }
    }

    @Override
    public void delete() {
        for (int i = 0; i < internList.size(); i++) {
            System.out.println((i + 1) + ". " + internList.get(i));
        }
        System.out.println("Select the candidate you want to delete");
        int choice = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < internList.size(); i++) {
            if ((i + 1) == choice) {
                internList.remove(i);
            }
        }
        for (int i = 0; i < internList.size(); i++) {
            System.out.println((i + 1) + ". " + internList.get(i));
        }
    }

    @Override
    public void seach(String name, int candidatesType) {
        for (Candidates ele : internList) {
            if ((ele.getCandidatesType() == candidatesType)) {
                if (ele.getLastName().toLowerCase().contains(name)) {
                    System.out.println(ele.toString());
                } else if (ele.getFirstName().toLowerCase().contains(name)) {
                    System.out.println(ele.toString());
                }
            }
        }
    }

    @Override
    public void disPLay() {
        for (Candidates ele : internList) {
            System.out.println(ele.getFirstName() + " " + ele.getLastName());
        }
    }
    public List<Candidates>getInternList(){
        return internList;
    }
}
