package review.validate;

public class ExpInYearException extends Exception {
    public ExpInYearException() {
        super("Invalid data , please re-enter is number from 0 to 100");
    }
}
