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
                    "5. Exit\n");
            Scanner scanner = new Scanner(System.in);
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    experienceimpl.add();
                    break;
                case 2:
                    fresherimpl.add();
                    break;
                case 3:
                    internimpl.add();
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
