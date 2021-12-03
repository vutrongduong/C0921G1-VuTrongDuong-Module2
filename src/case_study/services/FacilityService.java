package case_study.services;

import case_study.models.facility.Facility;

import java.util.LinkedHashMap;
import java.util.List;

public interface FacilityService extends Service {
    void displayFacilityMaintenance();

    List<String> convertWriteFalicity(Facility facility);

    LinkedHashMap<Facility, Integer> convertRead();
}
