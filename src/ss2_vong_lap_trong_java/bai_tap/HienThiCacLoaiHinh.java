package ss2_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:\n" +
                    "\n" +
                    "1.Print the rectangle\n" +
                    "\n" +
                    "2.Print the square triangle\n" +
                    "\n" +
                    "3.Print isosceles triangle\n" +
                    "\n" +
                    "4.Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 7; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("The corner is square at 4 different angles:\n" +
                            "1.top-left, \n" +
                            "2.top-right, \n" +
                            "3.botton-left, \n" +
                            "4.botton-right");
                    int choice2 = scanner.nextInt();
                    switch (choice2) {
                        case 1:
                            System.out.println("Hình tam giác vuông có cạnh góc vuông ở top-left");
                            for (int i = 5; i >= 1; i--) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 2:
                            System.out.println("Hình tam giác vuông có cạnh góc vuông ở top-right");
                            for (int i = 5; i > 0; i--) {
                                for (int j = i; j < 5; j++) {
                                    System.out.print(" ");
                                }
                                for (int z = i; z > 0; z--) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 3:
                            System.out.println("Hình tam giác vuông có cạnh góc vuông ở botton-left");
                            for (int i = 5; i >= 1; i--) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 4:
                            System.out.println("Hình tam giác vuông có cạnh góc vuông ở botton-right");
                            for (int i = 5; i > 0; i--) {
                                for (int j = 0; j < i; j++) {
                                    System.out.print(" ");
                                }
                                for (int z = 5; z >= i; z--) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                    }
                    break;
                case 3:
                    for (int i = 1; i <= 7; i++) {
                        for (int j = i; j < 7; j++) {
                            System.out.print("   ");
                        }
                        for (int j = 1; j <= (2 * i - 1); j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        } while (true);
    }
}
