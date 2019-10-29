	package medicalApplication.model.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.model.Allergy;
import medical.com.medicalApplication.model.MedicalRecord;
import medical.com.medicalApplication.model.Medication;
import medical.com.medicalApplication.model.Patient;
import medical.com.medicalApplication.model.Treatment;
import medical.com.medicalApplication.model.PatientHistory;

/**
 * 
 * This class represents a suite of unit test to validate the Medical Records
 * operations.
 *
 */
public class TestMedicalRecordsFeature {
	// Created an empty Patient Class
	private Patient patient;
	private MedicalRecord patientMedicalRecord;
	private PatientHistory history;
	private Treatment treatment;
	private Medication medication;
	private Allergy allergy;
	private List<Treatment> treatments;
	private List<Medication> medications;
	private List<Allergy> allergies;

	// Calls before executing test functions
	@Before
	public void setUp() throws Exception {
		this.patient = new Patient("Jason Lima", "0000000001"); // Create a instance of doctor for test functions
		this.patientMedicalRecord = new MedicalRecord(patient);
		this.history = new PatientHistory();
		this.treatment = new Treatment("2019-10-01", "Headache", "Patient experiencing throbing pain in head.");
		this.treatments = new ArrayList<Treatment>();
		this.medication = new Medication("Advil", "10-01-2019", "10-07-2019", "50mg");
		this.medications = new ArrayList<Medication>();
		this.allergy = new Allergy("Dust");
		this.allergies = new ArrayList<Allergy>();
	}

	// Begin Test Functions
	// Test patient name
	@Test
	public void testSetPatientName() {
		String expectedValue = "Jason Lima";
		// patient.setName(expectedValue);
		String actualValue = patient.getName();
		assertTrue(expectedValue.equals(actualValue));
	}

	// Test patient Id
	@Test
	public void testSetPatientId() {
		String expectedValue = "0000000001";
		// patient.setId(expectedValue);
		String actualValue = patient.getId();
		assertTrue(expectedValue.equals(actualValue));
	}

	// Test adding patient to medical records
	@Test
	public void testGetPatientFromMedialRecords() {
		String expectedValue = "Patient Name: " + "Jason Lima" + " ID: " + "0000000001";
		// patient.setName("Jason Lima");
		// patient.setId("0000000001");
		String actualValue = patientMedicalRecord.getPatient().toString();
		assertTrue(expectedValue.equals(actualValue));
	}

	// Test adding treatment to patient medical records
	@Test
	public void testPatientTreatmentMedicalHistory() {
		String expectedValue = "Treatment: " + " Date: " + "2019-10-01" + " Diagnose: " + "Headache";
		// this.history = new PatientHistory();
		// treatments.add(treatment);
		String actualValue = treatment.toString();
		assertTrue(expectedValue.equals(actualValue));
	}

	// Test adding medication to patient medical records
	@Test
	public void testPatientMedicationMedicalHistory() {
		String expectedValue = "Medication:" + "Advil" + " Start Date: " + "10-01-2019" + " End Date: " + "10-07-2019"
				+ " Dose: " + "50mg";
		String actualValue = medication.toString();
		assertTrue(expectedValue.equals(actualValue));
	}

	// Test adding allergy to patient medical records
	@Test
	public void testPatientAllergyMedicalHistory() {
		String expectedValue = "Allergy " + "Dust";
		String actualValue = allergy.toString();
		assertTrue(expectedValue.equals(actualValue));
	}

}
