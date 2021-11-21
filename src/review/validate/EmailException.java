package review.validate;

public class EmailException extends Exception {
    public EmailException() {
        super("Invalid data , please re-enter email with fomat <account name>@<domain>.(eg:annguyen@gmail.com");
    }
}
