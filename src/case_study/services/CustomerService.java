package case_study.services;

import case_study.models.Customer;

import java.util.List;

public interface CustomerService extends Service{
    void edit();
    List<Customer> convertRead();
    List<String> convertWrite();
}
