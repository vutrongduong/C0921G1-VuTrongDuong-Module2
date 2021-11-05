package ss6_ke_thua.bai_tap.thiet_ke_va_phat_trien_triangle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập độ dài cạnh a: ");
        double a= Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập độ dài cạnh b: ");
        double b= Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập độ dài cạnh c: ");
        double c= Double.parseDouble(scanner.nextLine());
        Triangle triangle =new Triangle(a,b,c);
        System.out.println("Nhập màu sắc của tam giác: ");
        String color = scanner.nextLine();
        triangle.setColor(color);
        System.out.println(triangle.toString());
    }
}
