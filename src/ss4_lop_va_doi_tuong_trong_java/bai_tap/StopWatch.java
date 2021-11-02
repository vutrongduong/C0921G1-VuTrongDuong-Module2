package ss4_lop_va_doi_tuong_trong_java.bai_tap;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

public class StopWatch {
    public long startTime;
    public long endTime;

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public void start() {

        this.startTime = System.currentTimeMillis();
    }

    public void stop() {

        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println(stopWatch.getStartTime());
        stopWatch.stop();
        System.out.println(stopWatch.getEndTime());
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());

    }
}
