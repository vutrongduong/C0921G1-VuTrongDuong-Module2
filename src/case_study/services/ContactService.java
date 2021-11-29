package case_study.services;


import case_study.models.Contract;

import java.util.Set;

public interface ContactService extends Service {
    void editConstracts();

    Set<Contract> convertRead();
}
