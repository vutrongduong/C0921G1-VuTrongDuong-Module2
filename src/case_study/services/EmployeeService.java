package case_study.services;

import case_study.models.Employee;

import java.util.List;

public interface EmployeeService extends Service {
    List<String> convertWrite();

    List<Employee> convertRead();

    void edit();
}
