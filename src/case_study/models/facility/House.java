package case_study.models.facility;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloors;

    public House() {
    }

    public House(String roomStandard, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String codeService, double area, int expense, int numbeOfPeople, String rentStyle, String roomStandard, int numberOfFloors) {
        super(codeService, area, expense, numbeOfPeople, rentStyle);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return getCodeService() + "," + getArea() + "," + getExpense() + "," + getNumbeOfPeople() + "," + getRentStyle() + "," + roomStandard + "," + numberOfFloors;
    }
}

