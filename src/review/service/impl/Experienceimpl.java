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
        experienceList.add(new Experience(1, "Aelbrecht", "Stefan", 1990, "Spain", 1234567890, "stefan@gmail.com", 2, 8, "Mentorship"));
        experienceList.add(new Experience(2, "Aguirre", "Eva", 1990, "Sao paulo", 1234567890, "eva@asante.com", 0, 10, "Coaching"));
        experienceList.add(new Experience(3, "Ahlgren", "Maria", 1989, "Spain", 1234567890, "maria@asante.com", 1, 11, "Prioritization"));
        experienceList.add(new Experience(4, "Antošová", "Adeleva", 1989, "Rio de janero", 1234567890, "adelave@janeo.com", 0, 15, "Politeness"));
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
            double birthDate = check.checkBirthDate();
            System.out.println("Enter Address : ");
            String address = scanner.nextLine();
            double phone = check.checkPhone();
            String email = check.checkEmail();
            System.out.println("Enter candidates type :");
            int candidatesType = Integer.parseInt(scanner.nextLine());
            int expInYear = check.checkExpInYear();
            System.out.println("Enter pro skill : ");
            String proSkill = scanner.nextLine();
            experienceList.add(new Experience(id, firstName, lastName, birthDate, address, phone, email, candidatesType, expInYear, proSkill));
            System.out.println(" Do you want to continue (Y/N)?");
            String choice = scanner.nextLine();
            if (choice.equals("N")) {
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
        for (Experience ele : experienceList) {
            System.out.println(ele.getFirstName() + " " + ele.getLastName());
        }
    }
}
