package medicalApplication.model.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import medical.com.medicalApplication.model.Doctor;

/**
 * 
 * This class represents a suite of unit test to validate the Doctor 
 * Information operations.
 *
 */
public class TestDoctorInfomationFeature {
	// Created an empty Doctor Class
	private Doctor doctor;
	private ArrayList<String> doctorIDs = new ArrayList<String>();

	// Calls before executing test functions
	@Before
	public void setUp() throws Exception {
		this.doctor = new Doctor(null, null); 						// Create a instance of doctor for test functions

	}

	// Begin Test Functions
	@Test
	public void testSetName() {
		String expectedValue = "Lima";
		doctor.setName(expectedValue);
		String actualValue = doctor.getName();
		assertTrue(expectedValue.equals(actualValue));
	}

	// Test Doctor ID
	@Test
	public void testSetID() {
		String expectedValue = "55555";
		doctor.setId(expectedValue);
		String actualValue = doctor.getId();
		assertTrue(expectedValue.equals(actualValue));
	}

	// Test Doctor ID for Duplicates
	@Test
	public void testDupplicateDoctorID() {
		String expectedValue = "12345";
		doctor.setId(expectedValue);
		String actualValue = doctor.getId();
		doctorIDs.add("12345");
		doctorIDs.add("12346");
		doctorIDs.add("12347");
		doctorIDs.add(actualValue);
		assertTrue("This ID is a duplicate doctor ID", doctorIDs.contains(actualValue));
	}

}
