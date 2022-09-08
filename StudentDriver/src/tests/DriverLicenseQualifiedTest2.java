package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import model.DriverLicenseQualified;
import model.StudentDriver;

/**
 * @author peterjohnson - pmjohnson5
 * CIS175-Fall 2022
 * September 4, 2022
 */

public class DriverLicenseQualifiedTest2 {
	DriverLicenseQualified dLQ2 = new DriverLicenseQualified();
	StudentDriver studentdriver2 = new StudentDriver("David");

	
	@Before
	public void setUp() throws Exception {
		
	}
	
	
	@Test
	public void testIsAgeQualified() {
		studentdriver2.setAge(16);
		assertTrue(dLQ2.isAgeQualified(studentdriver2));
		
	}
	
	@Test
	public void testIsNotAgeQualified() {
		studentdriver2.setAge(15);
		assertFalse(dLQ2.isAgeQualified(studentdriver2));
		
	}
	
}
