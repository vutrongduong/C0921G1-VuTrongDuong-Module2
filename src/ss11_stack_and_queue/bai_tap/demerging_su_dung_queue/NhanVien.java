package ss11_stack_and_queue.bai_tap.demerging_su_dung_queue;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NhanVien implements Comparable<NhanVien> {
    String name;
    String gender;
    String date;

    public NhanVien(String name, String gender, String date) {
        this.name = name;
        this.gender = gender;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDayOfBirth() {
        return date;
    }

    public void setDayOfBirth(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public int compareTo(NhanVien o) {
        Date date1 = null;
        try {
            date1 = new SimpleDateFormat("dd/MM/yyyy").parse(o.date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date date2 = null;
        try {
            date2 = new SimpleDateFormat("dd/MM/yyyy").parse(this.date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date2.compareTo(date1);
    }
}
