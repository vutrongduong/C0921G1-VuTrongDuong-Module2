package review.validate;

public class PhoneException  extends Exception{
    public PhoneException() {
        super("Invalid data , please re-enter is number with minimum 10 characters");
    }
}
