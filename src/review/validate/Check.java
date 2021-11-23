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
            if (email.matches(regex)) {
                return email;
            } else {
                System.out.println("Invalid data , please re-enter email with fomat <account name>@<domain>.(eg:annguyen@gmail.com");
            }
        }
    }

    public double checkPhone() {
        String regex = "^\\d{10,}";
        while (true) {
            System.out.println("Enter phone  : ");
            String phone = scanner.nextLine();
            if (phone.matches(regex)) {
                return Double.parseDouble(phone);
            } else {
                System.out.println("Invalid data , please re-enter is number with minimum 10 characters");
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

    public int checkBirthDate() {
        String regex = "\\d{4}";
        while (true) {
            System.out.println("Enter birth date  : ");
            String birthDate = scanner.nextLine();
            if (birthDate.matches(regex)) {
                return Integer.parseInt(birthDate);
            } else {
                System.out.println("Invalid data , please re-enter is number with length is 4 character");
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
            System.out.println("Enter Graduation rank : ");
            String graduationRank = scanner.nextLine();
            if (stringList.contains(graduationRank)) {
                return graduationRank;
            } else {
                System.out.println("Invalid data ,please re-enter Rank of Graduation: with one of 4 values ( Excellence, Good, Fair, Poor )");
            }
        }
    }

    public static void main(String[] args) {
        Check check =new Check();
        check.checkExpInYear();
    }
}
    

