package review.validate;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Check {
    Scanner scanner = new Scanner(System.in);

    public String checkEmail() {
        String regex = "^\\w+@\\w+[.]\\w+$";
        while (true) {
            System.out.println("Enter Email  : ");
            String email = scanner.nextLine();
            try {
                if (email.matches(regex)) {
                    return email;
                } else {
                    throw new EmailException();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public double checkPhone() {
        String regex = "^\\d{10,}";
        while (true) {
            System.out.println("Enter phone  : ");
            String phone = scanner.nextLine();
            try {
                if (phone.matches(regex)) {
                    return Double.parseDouble(phone);
                } else {
                    throw new PhoneException();
                }
            } catch (PhoneException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public int checkExpInYear() {
        while (true) {
            try {
                System.out.println("Enter Exp In Year : ");
                int exp = Integer.parseInt(scanner.nextLine());
                if (exp >= 0 && exp <= 100) {
                    return exp;

                } else {
                    throw new ExpInYearException();
                }
            } catch (Exception e) {
                System.out.println("Invalid data , please re-enter is number from 0 to 100");
            }
        }
    }

    public double checkBirthDate() {
        String regex = "\\d{4}";
        while (true) {
            System.out.println("Enter birth date  : ");
            String birthDate = scanner.nextLine();
            try {
                if (birthDate.matches(regex)) {
                    return Double.parseDouble(birthDate);
                } else {
                    throw new BirthDateException();
                }
            } catch (BirthDateException e) {
                e.getMessage();
            }
        }
    }

    public String checkGraduationRank() {
        List<String> stringList = new ArrayList<>();
        {
            stringList.add("Excellence");
            stringList.add("Good");
            stringList.add("Fair");
            stringList.add("Poor");
        }
        while (true) {
            try {
                System.out.println("Enter Graduation rank : ");
                String graduationRank = scanner.nextLine();
                if (stringList.contains(graduationRank)) {
                    return graduationRank;
                } else {
                    throw new GraduationRankException();
                }
            } catch (GraduationRankException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
