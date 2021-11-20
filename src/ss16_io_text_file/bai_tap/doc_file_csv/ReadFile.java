package ss16_io_text_file.bai_tap.doc_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static final String PATH_SOURCE_FILE = "D:\\codegym\\C0921G1-VuTrongDuong-Module2\\src\\ss16_io_text_file\\bai_tap\\doc_file_csv\\file.csv";

    public static List<Country> readLine() {
        List<Country> countryList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        File file = new File(PATH_SOURCE_FILE);
        try {
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                Country country = new Country(Integer.parseInt(temp[0]), temp[1], temp[2]);
                countryList.add(country);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return countryList;
    }

    public static void main(String[] args) {
        readLine();
        for (Country country : readLine()) {
            System.out.println(country);
        }
    }
}
