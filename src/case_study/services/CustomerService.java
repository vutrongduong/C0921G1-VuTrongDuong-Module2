package case_study.services;

public interface CustomerService extends Service{
    void edit();

    @Override
    void display();

    @Override
    void add();
}
