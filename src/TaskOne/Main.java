package TaskOne;

public class Main {
    public static void main(String[] args) {
        Therapist therapist = new Therapist();

        Patient patient1 = new Patient();
        Patient patient2 = new Patient();

        patient1.setTreatmentPlan(1);
        patient2.setTreatmentPlan(2);

        therapist.treatmentPlan(patient1);
        therapist.treatmentPlan(patient2);
    }
}
