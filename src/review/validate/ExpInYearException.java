package review.validate;

import java.util.InputMismatchException;

public class ExpInYearException extends InputMismatchException {
    public ExpInYearException() {
        super("Invalid data , please re-enter is number from 0 to 100");
    }
}
