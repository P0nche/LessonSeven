package TaskOne;

public class Therapist extends Doctor {

    @Override
    public void treat() {
        System.out.println("Лечение от терапевта...");
    }

    public void treatmentPlan(Patient patient) {
        Doctor doctor;

        switch (patient.getTreatmentPlan()) {
            case 1 -> {
                doctor = new Surgeon();
                patient.setDoctor(doctor);
                patient.getDoctor().treat();

            }
            case 2 -> {
                doctor = new Dentist();
                patient.setDoctor(doctor);
                patient.getDoctor().treat();
            }
            default -> {
                doctor = new Therapist();
                patient.setDoctor(doctor);
                patient.getDoctor().treat();
            }
        }
    }
}
