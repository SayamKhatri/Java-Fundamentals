package Level3.HospitalPatientManagementSystem;

public abstract class Patient {
    private String name;
    private String id;
    private String diagnosis;
    private boolean isInsured;

    protected boolean isInsured() {
        return isInsured;
    }

    public Patient(String name, String id, String diagnosis, boolean isInsured) {
        this.name = name;
        this.id = id;
        this.diagnosis = diagnosis;
        this.isInsured = isInsured;
    }

    public String getName() {
        return name;
    }

    public abstract double calculateBill();

}
