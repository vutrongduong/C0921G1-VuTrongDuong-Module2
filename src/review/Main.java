package review;

import review.controller.Controller;
import review.validate.EmailException;
import review.validate.PhoneException;

public class Main {
    public static void main(String[] args) throws PhoneException, EmailException {
        Controller controller =new Controller();
        controller.menu();
    }
}
