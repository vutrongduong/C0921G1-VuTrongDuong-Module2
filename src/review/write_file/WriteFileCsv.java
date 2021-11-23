package review.write_file;

import review.model.Experience;
import review.model.Fresher;
import review.model.Intern;
import review.service.impl.Experienceimpl;
import review.service.impl.Fresherimpl;
import review.service.impl.Internimpl;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileCsv {
    public static final String FILE_PATH_EXPERIENCE = "D:\\codegym\\C0921G1-VuTrongDuong-Module2\\src\\review\\write_file\\experience.csv";
    public static final String FILE_PATH_FRESHER = "D:\\codegym\\C0921G1-VuTrongDuong-Module2\\src\\review\\write_file\\fresher.csv";
    public static final String FILE_PATH_INTERN = "D:\\codegym\\C0921G1-VuTrongDuong-Module2\\src\\review\\write_file\\intern.csv";

    public static void writeCsvExperience(List<Experience> experienceimplList) throws IOException {
        File file = new File(FILE_PATH_EXPERIENCE);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Experience ele : experienceimplList) {
                bufferedWriter.append(ele.toString());
                bufferedWriter.newLine();
            }
        } catch (Exception e) {

        } finally {
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }

    public static void writeCsvFresher(List<Fresher> fresherList) throws IOException {
        File file = new File(FILE_PATH_FRESHER);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Fresher ele : fresherList) {
                bufferedWriter.append(ele.toString());
                bufferedWriter.newLine();
            }
        } catch (Exception e) {

        } finally {
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }

    public static void writeCsvIntern(List<Intern> interns) throws IOException {
        File file = new File(FILE_PATH_INTERN);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Intern ele : interns) {
                bufferedWriter.write(ele.toString());
                bufferedWriter.newLine();
            }
        } catch (Exception e) {

        } finally {
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }

    public static void main(String[] args) throws IOException {
        Experienceimpl experienceimpl = new Experienceimpl();
        Fresherimpl fresherimpl = new Fresherimpl();
        Internimpl internimpl = new Internimpl();
        writeCsvExperience(experienceimpl.getExperienceList());
        writeCsvFresher(fresherimpl.getFresherList());
        writeCsvIntern(internimpl.getInternList());
    }
}
