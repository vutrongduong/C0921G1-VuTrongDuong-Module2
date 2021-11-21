package review.service.impl;


import review.model.Experience;
import review.model.Fresher;
import review.service.FresherService;
import review.validate.Check;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fresherimpl extends Fresher implements FresherService {
    List<Fresher> fresherList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Check check = new Check();

    {
        fresherList.add(new Fresher(1, "Barbosa De", "Souza", "1989", "Sao paulo", "1234567890", "souza@asante.com", 1, "May 28, 2021", "Excellence", "University of Chicago"));
        fresherList.add(new Fresher(2, "Cabrera", "Cornide", "1990", "England", "1234567890", "cornide@asante.com", 0, "June 2, 2021", "Poor", "Washington and Lee University"));
        fresherList.add(new Fresher(3, "Calderon", "Cuevas", "1987", "Spain", "1234567890", "cuevas@asante.com", 1, "May 19, 2021", "Good", "Babson College"));
        fresherList.add(new Fresher(4, "Casulari", "Motta", "1986", "Spain", "1234567890", "motta@asante.com", 2, "May 27, 2021", "Good", "Duke University"));
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
            String birthDate = check.checkBirthDate();
            String address = scanner.nextLine();
            System.out.println("Enter Phone : ");
            String phone = check.checkPhone();
            String email = check.checkEmail();
            System.out.println("Enter candidates type :");
            int candidatesType = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter Graduation date : ");
            String graduationDate = scanner.nextLine();
            String graduationRank = check.checkGraduationRank();
            System.out.println("Enter Education : ");
            String education = scanner.nextLine();
            fresherList.add(new Fresher(id, firstName, lastName, birthDate, address, phone, email, candidatesType, graduationDate, graduationRank, education));
            String choice = scanner.nextLine();
            if (choice.equals("Y")) {
                fresherList.add(new Fresher(id, firstName, lastName, birthDate, address, phone, email, candidatesType, graduationDate, graduationRank, education));
            } else {
                for (Fresher ele : fresherList) {
                    System.out.println(ele);
                }
                break;
            }
        } while (true);
    }


    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void seach(String name, int candidatesType) {
        for (Fresher ele : fresherList) {
            if ((ele.getCandidatesType() == candidatesType)) {
                if (ele.getLastName().toLowerCase().equals(name) || ele.getFirstName().toLowerCase().equals(name)) {
                    System.out.println(ele.toString());
                }
            }
        }

    }

    @Override
    public void disPLay() {
        for (Fresher ele:fresherList) {
            System.out.println(ele.getLastName()+" "+ele.getLastName());
        }
    }
}
