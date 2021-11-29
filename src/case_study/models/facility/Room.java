package case_study.models.facility;


public class Room extends Facility {
    private String accompanyingService;

    public Room() {
    }

    public Room(String accompanyingService) {
        this.accompanyingService = accompanyingService;
    }

    public Room(String codeService, double area, int expense, int numbeOfPeople, String rentStyle, String accompanyingService) {
        super(codeService, area, expense, numbeOfPeople, rentStyle);
        this.accompanyingService = accompanyingService;
    }

    public String getDichVuDiKem() {
        return accompanyingService;
    }

    public void setDichVuDiKem(String accompanyingService) {
        this.accompanyingService = accompanyingService;
    }

    @Override
    public String toString() {
        return getCodeService() + "," + getArea() + "," + getExpense() + "," + getNumbeOfPeople() + "," + getRentStyle() + "," + accompanyingService;
    }

}
