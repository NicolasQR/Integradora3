package model;

public abstract class Coach extends Employee{
    
    private int yearsExperience;


	/**
    * Description This is the constructor method of the Club Class
    * @param yearsExperience is the year that the coach have in experience 
    * @param name is the name of coach
    * @param id is the identification of coach 
    * @param salary is the amont pf money that the coach win
    * @param status is a boolean that identificate if the coach is active or not  
    */
    public Coach(int yearsExperience, String name, String ID, int salary, boolean status) {
        super(name, ID, salary, status);
        this.yearsExperience = yearsExperience;
    }


	/**
    * Description This method getsYearsExperience
    * @return yearsExperience
    */
    public int getYearsExperience() {
        return yearsExperience;
    }


	/**
    * Description This method sets the years experience of the any type of coach
    * @param yearsExperience is the years experience of coach
    */
    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }
    
}
