package ss16_io_text_file.bai_tap.copy_file;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static String readFile(FileReader fileReader) {
        int i = 0;
        String result = "";
        try {
            while ((i = fileReader.read()) != -1) {
                result += (char) i;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public static void writeFile(FileWriter fileWriter, String reult) {
        try {
            fileWriter.write(reult);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập tệp tin  nguồn ");
            File fileSource = new File(scanner.nextLine());
            System.out.println("Nhập tệp tin đích ");
            File fileTarget = new File(scanner.nextLine());
            String result = "";
            if (fileSource.exists() && !fileTarget.exists()) {
                try {
                    FileReader fileReader = new FileReader(fileSource);
                    FileWriter fileWriter = new FileWriter(fileTarget);
                    result = readFile(fileReader);
                    writeFile(fileWriter, result);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            } else {
                System.out.println("Tệp nguồn không tồn tại hoặc tập tin đích đã tồn tại, nhập lại ");
            }
        }
    }
}
