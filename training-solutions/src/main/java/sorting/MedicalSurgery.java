package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MedicalSurgery {

    private List<Patient> patients;

    public MedicalSurgery(List<Patient> patients) {
        this.patients = patients;
    }

/*    public List<Patient> getPatientsInTimeOrder() {
        List<Patient> sortedPatients = new ArrayList<>(patients);
        Collections.sort(patients, new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                return o1.getAppointment().compareTo(o2.getAppointment());
            }
        });
        return sortedPatients;
    }*/

    public List<Patient> getPatientsInTimeOrder() {
        List<Patient> sortedPatients = new ArrayList<>(patients);
        Collections.sort(patients, new PatientComparator());
        return sortedPatients;
    }

    public List<Patient> getPatients() {
        return patients;
    }
}
