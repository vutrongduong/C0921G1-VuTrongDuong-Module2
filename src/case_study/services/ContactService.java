package case_study.services;


import case_study.models.Contract;

import java.util.List;

public interface ContactService extends Service {
    void editConstracts();

    List<Contract> convertRead();
}
