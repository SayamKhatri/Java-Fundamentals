package Level3.HospitalPatientManagementSystem;

public class OutPatient extends Patient{
    private double consultationFee;

    public OutPatient(String name, String id, String diagnosis, boolean isInsured, double consultationFee) {
        super(name, id, diagnosis, isInsured);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        double bill = consultationFee;
        if (this.isInsured())
            bill -= bill * 0.40;

        return bill;
    }
    
}
