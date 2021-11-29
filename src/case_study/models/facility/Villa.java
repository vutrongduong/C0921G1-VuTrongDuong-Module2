package case_study.models.facility;

public class Villa extends Facility {
    private String roomStandard;
    private double areaPool;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String roomStandard, double areaPool, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String codeService, double area, int expense, int numbeOfPeople, String rentStyle, String roomStandard, double areaPool, int numberOfFloors) {
        super(codeService, area, expense, numbeOfPeople, rentStyle);
        this.roomStandard = roomStandard;
        this.areaPool = areaPool;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return getCodeService() + "," + getArea() + "," + getExpense() + "," + getNumbeOfPeople() + "," + getRentStyle() + "," + roomStandard + "," + areaPool + "," + numberOfFloors;
    }
}
