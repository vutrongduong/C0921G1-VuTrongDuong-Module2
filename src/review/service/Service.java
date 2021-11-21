package review.service;

import review.validate.EmailException;
import review.validate.PhoneException;

public interface Service {
    void add() throws PhoneException, EmailException;
    void update();
    void delete();
    void seach(String name ,int candidatesType);
    void disPLay();
}
