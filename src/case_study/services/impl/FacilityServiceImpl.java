package case_study.services.impl;

import case_study.models.Booking;
import case_study.models.facility.*;
import case_study.services.FacilityService;
import case_study.utils.FileCSV;
import case_study.validate.Validate;


import java.util.*;

public class FacilityServiceImpl implements FacilityService {
    Scanner scanner = new Scanner(System.in);
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
                    String codeHouse = Validate.code();
                    double area = Validate.area();
                    int expense = Validate.expense();
                    int numbeOfPeople = Validate.numbeOfPeople();
                    String rentStyle = Validate.rentStyle();
                    String roomStandard = Validate.roomStandard();
                    int numberOfFloors = Validate.numberOfFloors();
                    House house = new House(codeHouse, area, expense, numbeOfPeople, rentStyle, roomStandard, numberOfFloors);
                    if (!facilityMap.containsKey(house)) {
                        facilityMap.put(house, 0);
                    } else {
                        facilityMap.replace(house, facilityMap.get(house) + 1);
                    }
                    FileCSV.writeFileCSV(convertWriteFalicity(house), pathHouse);
                    break;
                case 2:
                    String codeRoom = Validate.code();
                    double areaRoom = Validate.area();
                    int expenseRoom = Validate.expense();
                    int numbeOfPeopleRoom = Validate.numbeOfPeople();
                    String rentStyleRoom = Validate.rentStyle();
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
                    String codeVilla = Validate.code();
                    double areaVilla = Validate.area();
                    int expenseVilla = Validate.expense();
                    int numbeOfPeopleVilla = Validate.numbeOfPeople();
                    String rentStyleVilla = Validate.rentStyle();
                    String roomStandardVilla = Validate.roomStandard();
                    double areaPool = Validate.areaPool();
                    int numberOfFloorsVilla = Validate.numberOfFloors();
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


    public List<String> convertWriteFalicity(Facility facility) {
        List<String> stringListHouse = new ArrayList<>();
        List<String> stringListRoom = new ArrayList<>();
        List<String> stringListVilla = new ArrayList<>();
        for (Facility key : facilityMap.keySet()) {
            if (key instanceof House) {
                stringListHouse.add(key.toString() + "," + facilityMap.get(key));
            } else if (key instanceof Room) {
                stringListRoom.add(key.toString() + "," + facilityMap.get(key));
            } else {
                stringListVilla.add(key.toString() + "," + facilityMap.get(key));
            }
        }
        if (facility instanceof House) {
            return stringListHouse;
        } else if (facility instanceof Room) {
            return stringListRoom;
        } else {
            return stringListVilla;
        }
    }

    @Override
    public LinkedHashMap<Facility, Integer> convertRead() {
        List<String> stringListHouse = FileCSV.readFileCSV(pathHouse);
        List<String> stringListRoom = FileCSV.readFileCSV(pathRoom);
        List<String> stringListVila = FileCSV.readFileCSV(pathVilla);
        String[] arr;
        for (String line : stringListHouse) {
            arr = line.split(",");
            facilityMap.put(new House(arr[0], Double.parseDouble(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5], Integer.parseInt(arr[6])), Integer.parseInt(arr[7]));
        }
        for (String line : stringListRoom) {
            arr = line.split(",");
            facilityMap.put(new Room(arr[0], Double.parseDouble(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5]), Integer.parseInt(arr[6]));
        }
        for (String line : stringListVila) {
            arr = line.split(",");
            facilityMap.put(new Villa(arr[0], Double.parseDouble(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5], Double.parseDouble(arr[6]), Integer.parseInt(arr[7])), Integer.parseInt(arr[8]));
        }
        return facilityMap;
    }

    @Override
    public void displayFacilityMaintenance() {
        BookingServicelmpl bookingServicelmpl = new BookingServicelmpl();
        Set<Booking> bookingMonth = bookingServicelmpl.getBookingMonth();//l???y ???????c booking trong th??ng
        LinkedHashMap<Facility, Integer> facilityMapMonth = new LinkedHashMap<>();
        for (Booking booking : bookingMonth) {
            for (Facility key : facilityMap.keySet()) {
                if (key.getCodeService().equals(booking.getNameService())) {
                    if (!facilityMapMonth.containsKey(key)) {
                        facilityMapMonth.put(key, 1);
                        // ki???m tra kh??ng tr??ng th?? t???o 1 key m???i
                    } else {
                        facilityMapMonth.replace(key, facilityMapMonth.get(key) + 1);
                        //ki???m tra tr??ng v???i m?? d???ch v??? th?? s??? value t??ng l??n 1
                    }
                }
            }
        }
        System.out.println("D???ch v??? ???????c s??? d???ng trong th??ng");
        for (Facility key : facilityMapMonth.keySet()) {
            System.out.println(key + " : " + facilityMapMonth.get(key) + " l???n");
        }
    }
    public Map<Facility,Integer>facilityList(){
        return facilityMap;
    }
}




