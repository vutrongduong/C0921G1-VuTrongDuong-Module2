package review.service.impl;

import review.model.Candidates;
import review.model.Experience;
import review.service.ExperienceService;
import review.validate.Check;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Experienceimpl implements ExperienceService {
    List<Candidates> experienceList = new ArrayList<>();

//    public Experienceimpl() {
//        experienceList = new ArrayList<>();
//    }
//
//    public Experienceimpl(List<Experience> experienceList) {
//        this.experienceList = experienceList;
//    }
//
//    public List<Experience> getExperienceList() {
//        return experienceList;
//    }
//
//    public void setExperienceList(List<Experience> experienceList) {
//        this.experienceList = experienceList;
//    }

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
            int birthDate = check.checkBirthDate();
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
                for (Candidates ele : experienceList) {
                    System.out.println(ele);
                }
                break;
            }
        } while (true);
    }

    @Override
    public void update() {
        for (Candidates experience : experienceList) {
            System.out.println("Id:" + (experience.getId() + " - " + experience));
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
        double phone = check.checkPhone();
        String email = check.checkEmail();
        System.out.println("Enter candidates type :");
        int candidatesType = Integer.parseInt(scanner.nextLine());
        int expInYear = check.checkExpInYear();
        System.out.println("Enter pro skill : ");
        String proSkill = scanner.nextLine();
        Experience experience = new Experience(id, firstName, lastName, birthDate, address, phone, email, candidatesType, expInYear, proSkill);
        int index = experienceList.indexOf(experience);
        if (index == -1) {
            experienceList.add(experience);
        } else {
            experienceList.set(index, experience);
        }
    }

    @Override
    public void delete() {
        for (int i = 0; i < experienceList.size(); i++) {
            System.out.println((i + 1) + ". " + experienceList.get(i));
        }
        System.out.println("Select the candidate you want to delete");
        int choice = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < experienceList.size(); i++) {
            if ((i + 1) == choice) {
                experienceList.remove(i);
            }
        }
        for (int i = 0; i < experienceList.size(); i++) {
            System.out.println((i + 1) + ". " + experienceList.get(i));
        }
    }

    @Override
    public void seach(String name, int candidatesType) {
        for (Candidates ele : experienceList) {
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
        for (Candidates ele : experienceList) {
            System.out.println(ele.getFirstName() + " " + ele.getLastName());
        }
    }

    public List<Candidates> getExperienceList() {
        return experienceList;
    }
}
