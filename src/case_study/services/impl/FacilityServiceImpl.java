package case_study.services.impl;

import case_study.models.Booking;
import case_study.models.facility.*;
import case_study.services.FacilityService;
import case_study.utils.FileCSV;


import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    Scanner scanner = new Scanner(System.in);
    Validate validate = new Validate();
    static LinkedHashMap<Facility, Integer> facilityMap = new LinkedHashMap<>();
    static final String pathHouse = "D:\\codegym\\C0921G1-VuTrongDuong-Module2\\src\\case_study\\data\\house.csv";
    static final String pathRoom = "D:\\codegym\\C0921G1-VuTrongDuong-Module2\\src\\case_study\\data\\room.csv";
    static final String pathVilla = "D:\\codegym\\C0921G1-VuTrongDuong-Module2\\src\\case_study\\data\\villa.csv";


    {
        facilityMap = convertRead();
    }

    @Override
    public void display() {
        for (Facility key : facilityMap.keySet()) {
            System.out.println(key);
        }
    }

    @Override
    public void add() {
        int choice;
        do {
            System.out.println("1.\tAdd New House\n" +
                    "2.\tAdd New Room\n" +
                    "3.\tAdd New Villa\n" +
                    "4.\tBack to menu\n");

            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    String codeHouse = validate.code();
                    double area = validate.area();
                    int expense = validate.expense();
                    int numbeOfPeople = validate.numbeOfPeople();
                    String rentStyle = validate.rentStyle();
                    String roomStandard = validate.roomStandard();
                    int numberOfFloors = validate.numberOfFloors();
                    House house = new House(codeHouse, area, expense, numbeOfPeople, rentStyle, roomStandard, numberOfFloors);
                    if (!facilityMap.containsKey(house)) {
                        facilityMap.put(house, 0);
                    } else {
                        facilityMap.replace(house, facilityMap.get(house) + 1);
                    }
                    FileCSV.writeFileCSV(convertWriteFalicity(house), pathHouse);
                    break;
                case 2:
                    String codeRoom = validate.code();
                    double areaRoom = validate.area();
                    int expenseRoom = validate.expense();
                    int numbeOfPeopleRoom = validate.numbeOfPeople();
                    String rentStyleRoom = validate.rentStyle();
                    System.out.println("Enter Accompanying Service ");
                    String accompanyingService = scanner.nextLine();
                    Room room = new Room(codeRoom, areaRoom, expenseRoom, numbeOfPeopleRoom, rentStyleRoom, accompanyingService);
                    if (!facilityMap.containsKey(room)) {
                        facilityMap.put(room, 0);
                    } else {
                        facilityMap.replace(room, facilityMap.get(room) + 1);
                    }
                    FileCSV.writeFileCSV(convertWriteFalicity(room), pathRoom);
                    break;
                case 3:
                    String codeVilla = validate.code();
                    double areaVilla = validate.area();
                    int expenseVilla = validate.expense();
                    int numbeOfPeopleVilla = validate.numbeOfPeople();
                    String rentStyleVilla = validate.rentStyle();
                    String roomStandardVilla = validate.roomStandard();
                    double areaPool = validate.areaPool();
                    int numberOfFloorsVilla = validate.numberOfFloors();
                    Villa villa = new Villa(codeVilla, areaVilla, expenseVilla, numbeOfPeopleVilla, rentStyleVilla, roomStandardVilla, areaPool, numberOfFloorsVilla);
                    if (!facilityMap.containsKey(villa)) {
                        facilityMap.put(villa, 0);
                    } else {
                        facilityMap.replace(villa, facilityMap.get(villa) + 1);
                    }
                    FileCSV.writeFileCSV(convertWriteFalicity(villa), pathVilla);
                    break;
            }

        } while (choice != 4);
    }

    @Override
    public List<String> convertWrite() {
        return null;
    }

    public List<String> convertWriteFalicity(Facility facility) {
        List<String> stringListHouse = new ArrayList<>();
        List<String> stringListRoom = new ArrayList<>();
        List<String> stringListVilla = new ArrayList<>();
        for (Facility key : facilityMap.keySet()) {
            if (key instanceof House) {
                stringListHouse.add(key.toString());
            } else if (key instanceof Room) {
                stringListRoom.add(key.toString());
            } else{
                stringListVilla.add(key.toString());
            }
        }
        if (facility instanceof House){
            return stringListHouse;
        }else if(facility instanceof Room){
            return stringListRoom;
        }else if(facility instanceof Villa){
            return stringListVilla;
        }
        return stringListHouse;
    }


    public LinkedHashMap<Facility, Integer> convertRead() {
        List<String> stringListHouse = FileCSV.readFileCSV(pathHouse);
        List<String> stringListRoom = FileCSV.readFileCSV(pathRoom);
        List<String> stringListVila = FileCSV.readFileCSV(pathVilla);
        String[] arr;
        for (String line : stringListHouse) {
            arr = line.split(",");
            facilityMap.put(new House(arr[0], Double.parseDouble(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5], Integer.parseInt(arr[6])), 0);
        }
        for (String line : stringListRoom) {
            arr = line.split(",");
            facilityMap.put(new Room(arr[0], Double.parseDouble(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5]), 0);
        }
        for (String line : stringListVila) {
            arr = line.split(",");
            facilityMap.put(new Villa(arr[0], Double.parseDouble(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5], Double.parseDouble(arr[6]), Integer.parseInt(arr[7])), 0);
        }
        return facilityMap;
    }

    @Override
    public void displayFacilityMaintenance() {
        BookingServicelmpl bookingServicelmpl = new BookingServicelmpl();
        Set<Booking> bookingMonth = bookingServicelmpl.getBookingMonth();
        LinkedHashMap<Facility, Integer> facilityMapMonth = new LinkedHashMap<>();
        for (Facility key : facilityMap.keySet()) {
            for (Booking booking : bookingMonth) {
                if (booking.getNameService().equals(key.getCodeService())) {
                    if (!facilityMapMonth.containsKey(key)) {
                        facilityMapMonth.put(key, 1);
                    } else {
                        facilityMapMonth.replace(key, facilityMapMonth.get(key) + 1);
                    }
                }
            }
        }
        System.out.println("Dịch vụ được sử dụng trong tháng");
        for (Facility key : facilityMapMonth.keySet()) {
            System.out.println(key + " : " + facilityMapMonth.get(key) + " lần");
        }
    }

    public static void main(String[] args) {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        facilityService.convertRead();
    }
}




