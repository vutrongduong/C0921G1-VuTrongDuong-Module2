package ss2.bai_tap;

import javax.jws.soap.SOAPBinding;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {

        for (int i =1;i<=3;i++){
            for (int j =1;j<=7;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=7;i++){
            for(int j=i;j<7;j++){
                System.out.print("   ");
            }
            for (int j=1;j<=(2*i-1);j++){
                System.out.print(" * ");
            }
            System.out.println();

        }

    }
}
