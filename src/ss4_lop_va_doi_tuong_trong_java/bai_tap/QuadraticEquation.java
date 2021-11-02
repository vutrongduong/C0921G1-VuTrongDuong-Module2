package ss4_lop_va_doi_tuong_trong_java.bai_tap;

import sun.security.krb5.SCDynamicStoreConfig;

import java.util.Scanner;

public class QuadraticEquation {
    public double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        double delta = (this.b * this.b) - (4 * this.a * this.c);
        return delta;
    }

    public double getRoot1() {
        return (-this.b + Math.pow(getDiscriminant(), 0.5)) / 2 * this.a;
    }

    public double getRoot2() {
        return (-this.b - Math.pow(getDiscriminant(), 0.5)) / 2 * this.a;
    }

    public void giai() {
        if (getDiscriminant() > 0) {
            System.out.println("Phương trình có 2 nghiệm là: x1= " + getRoot1() + " và x2= " + getRoot2());
        } else if (getDiscriminant() == 0) {
            System.out.println("Phương trình có 1 nghiệm kép là: x= " + (-this.b / 2 * this.a));
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c: ");
        double c = scanner.nextDouble();
        QuadraticEquation phuongTrinh = new QuadraticEquation(a, b, c);
        phuongTrinh.giai();
    }
}
