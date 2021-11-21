package review.validate;

import java.util.ArrayList;
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

//    public static void main(String[] args) {
//        Check check = new Check();
////        System.out.println(check.checkExpInYear());
//        System.out.println(check.checkGraduationRank());
//    }

    public String checkPhone() {
        String regex = "^\\d{10}";
        while (true) {
            System.out.println("Enter phone  : ");
            String phone = scanner.nextLine();
            try {
                if (phone.matches(regex)) {
                    return phone;
                } else {
                    throw new PhoneException();
                }
            } catch (PhoneException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String checkExpInYear() {
        while (true) {
            String regex = "\\d{1,2}";
            System.out.println("Enter Exp In Year : ");
            String expInYear = scanner.nextLine();
            try {
                if (expInYear.matches(regex)) {
                    return expInYear;
                } else {
                    throw new ExpInYearException();
                }
            } catch (ExpInYearException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String checkBirthDate() {
        String regex = "\\d{4}";
        while (true) {
            System.out.println("Enter birth date  : ");
            String birthDate = scanner.nextLine();
            try {
                if (birthDate.matches(regex)) {
                    return birthDate;
                } else {
                    throw new BirthDateException();
                }
            } catch (BirthDateException e) {
                System.out.println(e.getMessage());
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
