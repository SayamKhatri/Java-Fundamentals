package Level3.HospitalPatientManagementSystem;

public class InPateint extends Patient{
    private int roomNumber;
    private int daysStayed;
    private double dailyRate;

    public InPateint(String name, String id, String diagnosis, boolean isInsured, 
                    int roomNumber, int daysStayed, double dailyRate) {
        super(name, id, diagnosis, isInsured);
        this.roomNumber = roomNumber;
        this.daysStayed = daysStayed;
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateBill() {
        double bill = daysStayed * dailyRate;
        if (this.isInsured())
            bill -= bill * 0.40;

        return bill;
    }
    
}
