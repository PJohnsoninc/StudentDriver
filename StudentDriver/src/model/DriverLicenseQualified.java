package model;

/**
 * @author peterjohnson - pmjohnson5
 * CIS175-Fall 2022
 * September 4, 2022
 */

public class DriverLicenseQualified {
		
	public boolean isAgeQualified(StudentDriver studentdriver) {
		boolean isAgeQualified = false;
		final int LEGAL_AGE = 16;
		if (studentdriver.getAge() >= LEGAL_AGE) {
			isAgeQualified = true;
		}
		return isAgeQualified;
	}
	
	public int calculateStudentScore(StudentDriver studentdriver) {
	    
		final int TEST_QUESTIONS = 100;
	    int calculateStudentScore = TEST_QUESTIONS - studentdriver.getTestQuestionsMissed();
		return calculateStudentScore;
	}
	
	public boolean passedTest(StudentDriver studentdriver) {
		boolean passedTest = false;
	    final int PASS_AMT = 78;
		if (studentdriver.getCalculateStudentScore() >= PASS_AMT) {
			passedTest = true;	
		} else {
			passedTest = false;
		}
		return passedTest;
	}
	
	public String getState(StudentDriver studentdriver) {
	 
		return "IA";
	}
		
}

