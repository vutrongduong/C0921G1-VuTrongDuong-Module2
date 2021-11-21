package review.service.impl;

import review.model.Experience;
import review.service.ExperienceService;
import review.validate.Check;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Experienceimpl implements ExperienceService {
    List<Experience> experienceList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Check check = new Check();

    {
        experienceList.add(new Experience(1, "Aelbrecht", "Stefan", "1990", "Spain", "9403941111", "stefan@gmail.com", 0, "8", "Mentorship"));
        experienceList.add(new Experience(2, "Aguirre", "Eva", "1990", "Sao paulo", "9403941111", "eva@asante.com", 0, "10", "Coaching"));
        experienceList.add(new Experience(3, "Ahlgren", "Maria", "1989", "Spain", "9403941111", "maria@asante.com", 1, "11", "Prioritization"));
        experienceList.add(new Experience(4, "Antošová", "Adeleva", "1989", "Rio de janero", "9403941111", "adelave@janeo.com", 0, "15", "Politeness"));
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
            System.out.println("Enter Address : ");
            String address = scanner.nextLine();
            String phone = check.checkPhone();
            String email = check.checkEmail();
            System.out.println("Enter candidates type :");
            int candidatesType = Integer.parseInt(scanner.nextLine());
            String expInYear = check.checkExpInYear();
            System.out.println("Enter pro skill : ");
            String proSkill = scanner.nextLine();
            System.out.println(" Do you want to continue (Y/N)?");
            String choice = scanner.nextLine();
            if (choice.equals("Y")) {
                experienceList.add(new Experience(id, firstName, lastName, birthDate, address, phone, email, candidatesType, expInYear, proSkill));
            } else {
                for (Experience ele : experienceList) {
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
        for (Experience ele : experienceList) {
            if (ele.getLastName().toLowerCase().contains(name)) {
                System.out.println(ele.toString());
            } else if (ele.getFirstName().toLowerCase().contains(name)) {
                System.out.println(ele.toString());
            }
        }
    }

    @Override
    public void disPLay() {
        for (Experience ele : experienceList) {
            System.out.println(ele.getLastName() + " " + ele.getLastName());
        }
    }


    public static void main(String[] args) {
        Experienceimpl experienceimpl = new Experienceimpl();
        experienceimpl.seach("eva", 0);
    }
}
