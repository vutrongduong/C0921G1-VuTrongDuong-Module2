package review.validate;

public class GraduationRankException extends Exception {
    public GraduationRankException() {
        super("Invalid data ,please re-enter Rank of Graduation: with one of 4 values ( Excellence, Good, Fair, Poor )");
    }
}
