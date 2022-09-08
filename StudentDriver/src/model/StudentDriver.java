package model;

/**
 * @author peterjohnson - pmjohnson5
 * CIS175-Fall 2022
 * September 4, 2022
 */

public class StudentDriver {
	
	private String name;
	private String state = "IA";
	private int age;
    private int testQuestionsMissed;
    private double calculateStudentScore;
    boolean passedTest;
    
    public StudentDriver() {
    	
    }
    
    public StudentDriver(String name) {
    	this.name = name;
    }
    
    public StudentDriver(String name, String state, int age, int testQuestionsMissed, double calculateStudentScore, boolean passedTest) {
    	this.name = name;
    	this.state = state;
    	this.age = age;
    	this.testQuestionsMissed = testQuestionsMissed;
    	this.calculateStudentScore = calculateStudentScore;
    	this.passedTest = passedTest;
    	
    }
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTestQuestionsMissed() {
		return testQuestionsMissed;
	}
	public void setTestQuestionsMissed(int testQuestionsMissed) {
		this.testQuestionsMissed = testQuestionsMissed;
	}
	public double getCalculateStudentScore() {
		return calculateStudentScore;
	}
	public void setCalculateStudentScore(double calculateStudentScore) {
		this.calculateStudentScore = calculateStudentScore;
	}
	public boolean getPassedTest() {
		return passedTest;
	}
	public void setPassedTest(boolean passedTest) {
		this.passedTest = passedTest;
	}
	

}
