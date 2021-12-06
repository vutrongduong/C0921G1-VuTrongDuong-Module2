package demo.service;

import demo.validate.NotFoundBankAccountException;

public interface Service {
    void add();
    void delete() throws NotFoundBankAccountException;
    void display();
    void search();

}
