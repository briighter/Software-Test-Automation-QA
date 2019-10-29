package medicalApplication.model.test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.model.Allergy;
import medical.com.medicalApplication.model.MedicalRecord;
import medical.com.medicalApplication.model.Patient;
import medical.com.medicalApplication.model.PatientHistory;
import medical.com.medicalApplication.services.MedicalRecordService;

public class TestAllergyFindFeature {
	private MedicalRecordService reference;
	private List<Patient> patients;
	private List<MedicalRecord> medicalRecords;
	private Patient patient;
	private MedicalRecord medicalRecord;
	private PatientHistory patientHistory;
	private Allergy dust;
	
	// Run this code before executing test
	@Before
	public void setUp() throws Exception {
		this.patient = new Patient("Jason Lima", "0000000001");				// Create instance of patient
		this.medicalRecord = new MedicalRecord(patient);					// Create instance of a medical record for the patient
		this.dust = new Allergy("Dust");									// Create instance of on allergy
		this.patientHistory.addAllergy(dust);								// Add allergy to patients history
		this.patients = new ArrayList<Patient>();
		this.medicalRecords = new ArrayList<MedicalRecord>();
		
	}
	
	@Test
	public void testGetPatientsWithAllergies() {
		String allergyName = dust.getName();
		List<Patient> expectedValue = Collections.singletonList(patient);
		List<Patient> actualValue = reference.getPatientsWithAllergies(allergyName);	
		assertTrue(!actualValue.isEmpty());
	}
}
