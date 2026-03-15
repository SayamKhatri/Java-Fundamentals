package Level3.HospitalPatientManagementSystem;

public class Main {
    public static void main(String[] args) {
        Patient p1 = new InPateint("Rahul", "1", "fever", true, 101, 2, 10);
        Patient p2 = new OutPatient("Mohan", "2", "regualrcheckup", false, 100);

        DischargeService service = new DischargeService();
        service.dischargePatient(p1);
        service.dischargePatient(p2);
    }
}
