package model;

public abstract class Employee {
    
    private String name;
    private String ID;
    private int salary;
    private boolean status;


	/**
	* Description This is the constructor method of the Employee class
	*/	
    public Employee(String name, String ID, int salary, boolean status) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
        this.status = status;
    }


	/**
	* Description This method gets Name
	* @return name
	*/
    public String getName() {
        return name;
    }


	/**
	* Description This method sets name
	* @param name name of the employee
	*/
    public void setName(String name) {
        this.name = name;
    }


	/**
	* Description This method gets ID
	* @return ID
	*/
    public String getID() {
        return ID;
    }
	
	
	/**
	* Description This method sets ID
	* @param ID ID of the employee
	*/
    public void setID(String ID) {
        this.ID = ID;
    }


	/**
	* Description This method gets Salary
	* @return salary
	*/
    public int getSalary() {
        return salary;
    }


	/**
	* Description This method sets salary
	* @param salary salary of the employee
	*/
    public void setSalary(int salary) {
        this.salary = salary;
    }


	/**
	* Description This method gets Status
	* @return status
	*/
    public boolean getStatus() {
        return status;
    }


	/**
	* Description This method sets status
	* @param status status of the employee
	*/
    public void setStatus(boolean status) {
        this.status = status;
    }
	
    public abstract String showInfo();
	
	
}






















