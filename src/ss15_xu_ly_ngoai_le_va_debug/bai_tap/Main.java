package ss15_xu_ly_ngoai_le_va_debug.bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhập cạnh a ");
                int canhA = scanner.nextInt();
                System.out.println("Nhập cạnh b ");
                int canhB = scanner.nextInt();
                System.out.println("Nhập cạnh c ");
                int canhC = scanner.nextInt();
                Triangle triangle = new Triangle(canhA, canhB, canhC);
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
