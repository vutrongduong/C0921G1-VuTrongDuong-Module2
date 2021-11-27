package ss17_binary_file_va_serialization.bai_tap.copy_file_nhi_phan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFile {
    static final String FILE_TARGET = "D:\\codegym\\C0921G1-VuTrongDuong-Module2\\src\\ss17_binary_file_va_serialization\\bai_tap\\copy_file_nhi_phan\\target.txt";

    public static List<Object> readFile(File file) {
        List<Object> objectList = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            if (fileInputStream.available() != 0) {
                objectInputStream = new ObjectInputStream(fileInputStream);
                System.out.println(objectInputStream);
//                objectList = (List<Object>) objectInputStream.readObject();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
        } finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return objectList;
    }

    public static void writeFile(List<Object> objectList) {
        File file = new File(FILE_TARGET);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(objectList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập source file cần copy ");
        File sourceFile = new File(scanner.nextLine());
        if (sourceFile.exists()) {
            writeFile(readFile(sourceFile));
            for (Object ele : readFile(sourceFile)) {
                System.out.println(ele);
            }
            System.out.println("Copy thành công");
        } else {
            System.out.println("Source file không tồn tại");
        }
    }
}
