package review.controller;


import review.service.impl.Experienceimpl;
import review.service.impl.Fresherimpl;
import review.service.impl.Internimpl;

import java.util.Scanner;

public class Controller {
    Experienceimpl experienceimpl = new Experienceimpl();
    Fresherimpl fresherimpl = new Fresherimpl();
    Internimpl internimpl = new Internimpl();

    public void menu() {
        do {
            System.out.println("CANDIDATE MANAGEMENT SYSTEM\n" +
                    "1. Experience\n" +
                    "2. Fresher\n" +
                    "3. Internship\n" +
                    "4. Searching\n" +
                    "5. Exit\n" +
                    "(Please choose 1 to Create Experience Candidate, 2 to Create Fresher Candidate, 3 to Internship Candidate, 4 to Searching and 5 to Exit program)");
            Scanner scanner = new Scanner(System.in);
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    int choice1;
                    do {
                        System.out.println("1. Add Experience\n" +
                                "2.Update Experience\n" +
                                "3.Delete Experience\n" +
                                "4.Return menu\n");
                        choice1 = Integer.parseInt(scanner.nextLine());
                        switch (choice1) {
                            case 1:
                                experienceimpl.add();
                                break;
                            case 2:
                                experienceimpl.update();
                                break;
                            case 3:
                                experienceimpl.delete();
                                break;
                            default:
                                break;
                        }
                    } while (choice1 != 4);
                    break;
                case 2:
                    int choice2;
                    do {
                        System.out.println("1. Add Experience\n" +
                                "2.Update Experience\n" +
                                "3.Delete Experience\n" +
                                "4.Return menu\n");
                        choice2 = Integer.parseInt(scanner.nextLine());
                        switch (choice2) {
                            case 1:
                                fresherimpl.add();
                                break;
                            case 2:
                                fresherimpl.update();
                                break;
                            case 3:
                                fresherimpl.delete();
                                break;
                            default:
                                break;
                        }
                    } while (choice2 != 4);
                    break;
                case 3:
                    int choice3;
                    do {
                        System.out.println("1. Add Experience\n" +
                                "2.Update Experience\n" +
                                "3.Delete Experience\n" +
                                "4.Return menu\n");
                        choice3 = Integer.parseInt(scanner.nextLine());
                        switch (choice3) {
                            case 1:
                                internimpl.add();
                                break;
                            case 2:
                                internimpl.update();
                                break;
                            case 3:
                                internimpl.delete();
                                break;
                            default:
                                break;
                        }
                    } while (choice3 != 4);
                    break;
                case 4:
                    System.out.println("===========EXPERIENCE CANDIDATE============");
                    experienceimpl.disPLay();
                    System.out.println("==========FRESHER CANDIDATE==============");
                    fresherimpl.disPLay();
                    System.out.println("===========INTERN CANDIDATE==============");
                    internimpl.disPLay();
                    System.out.println("Input Candidate name (First name or Last name): ");
                    String name = scanner.nextLine();
                    System.out.println("Input type of candidate: ");
                    int candidateType = Integer.parseInt(scanner.nextLine());
                    experienceimpl.seach(name, candidateType);
                    fresherimpl.seach(name, candidateType);
                    internimpl.seach(name, candidateType);
                    break;
                case 5:
                    System.exit(0);
            }
        } while (true);
    }
}
