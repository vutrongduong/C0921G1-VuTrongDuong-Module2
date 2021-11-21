package review.validate;

public class BirthDateException extends Exception{
    public BirthDateException() {
        super("Invalid data , please re-enter is number with length is 4 character ");
    }
}
