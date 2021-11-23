package review.write_file;

import review.model.Candidates;
import review.service.impl.Experienceimpl;
import review.service.impl.Fresherimpl;
import review.service.impl.Internimpl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class WriteFileCsv {

    public static void writeCsv(List<Candidates> experienceimplList, File file) throws IOException {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Candidates ele : experienceimplList) {
                bufferedWriter.append(ele.toString());
                bufferedWriter.newLine();
            }
        } catch (Exception e) {

        } finally {
            bufferedWriter.flush();
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter URL");
        File file = new File(scanner.nextLine());
        System.out.println("Enter candidates wants write file\n" +
                "1 .Experience\n" +
                "2. Fresher\n" +
                "3.Intern");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                Experienceimpl experienceimpl = new Experienceimpl();
                writeCsv(experienceimpl.getExperienceList(), file);
                break;
            case 2:
                Fresherimpl fresherimpl = new Fresherimpl();
                writeCsv(fresherimpl.getFresherList(), file);
                break;
            case 3:
                Internimpl internimpl = new Internimpl();
                writeCsv(internimpl.getInternList(), file);
                break;
        }
    }
}
