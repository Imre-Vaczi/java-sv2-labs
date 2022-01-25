package sorting;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MedicalSurgeryTest {

    @Test
    void testGetPatientsInTimeOrder() {
        Patient patientA = new Patient("aa", "111-222-333", LocalDateTime.now().plusDays(3));
        Patient patientB = new Patient("aa", "111-222-333", LocalDateTime.now().plusDays(2));
        Patient patientC = new Patient("aa", "111-222-333", LocalDateTime.now().plusDays(5));
        List<Patient> patients = Arrays.asList(patientA, patientB, patientC);

        MedicalSurgery medicalSurgery = new MedicalSurgery(patients);
        List<Patient> result = medicalSurgery.getPatientsInTimeOrder();

        assertEquals(3, result.size());
        assertEquals(patientB.getName(), result.get(0).getName());
    }

}