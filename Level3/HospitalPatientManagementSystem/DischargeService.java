package Level3.HospitalPatientManagementSystem;

public class DischargeService {

    public void dischargePatient(Patient p) {
        System.out.println("-------- Bill --------");
        System.out.println("Employee: " + p.getName());
        System.out.println("Final Amount: " + p.calculateBill());
        System.out.println("-------------------------");
    }
}

