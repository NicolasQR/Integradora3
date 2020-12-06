package model;

public class MainCoach extends Coach implements SoccerWorld{
    
    private int teamsInCharge;
    private int numberChampionships;
    private float value;
    private float level;


	/**
    * Description This is the constructor method of the mainCoach Class
    * @param teamsInCharge is the number of shirt of the player
    * @param numberChampionships is the number of goals that the player mark
    * @param yearsExperience is the hability of the player show in double
    * @param name is the name of player
    * @param ID is the identification of the player
    * @param salary is the quantity of money that the playe win
    * @param status  is the boolean that know us if the player is active or not in the club
    */
    public MainCoach(int teamsInCharge, int numberChampionships, int yearsExperience, String name, String ID, int salary, boolean status) {
        super(yearsExperience, name, ID, salary, status);
        this.teamsInCharge = teamsInCharge;
        this.numberChampionships = numberChampionships;
    }
    
    
	/**
    * Description This method get teams in charge of the main coach
    * @return  teamsInCharge is the number of the main coach´s teams in charge
    */
    public int getTeamsInCharge() {
        return teamsInCharge;
    }


	/** Description This method sets the teams in charge of the main coach
    * @param teamsInCharge is the number of the main coach´s teams in charge
    */
    public void setTeamsInCharge(int teamsInCharge) {
        this.teamsInCharge = teamsInCharge;
    }


	/**
    * Description This method get number of championshitps thatthe main coach was win
    * @return  numberChampionships is the number of the main coach´s championships that he win 
    */
    public int getNumberChampionships() {
        return numberChampionships;
    }


	/** 
	* Description This method sets number of championshitps thatthe main coach was win
    * @param numberChampionships is the number of the main coach´s championships that he win 
    */
    public void setNumberChampionships(int numberChampionships) {
        this.numberChampionships = numberChampionships;
    }


	/**
    * Description This method get value of the main coach in the market
    * @return  value is the value of the main coach in the market
    */
    public float getValue() {
        return value;
    }


	/**
    * Description This method sets value of the main coach in the market
    * @param value is the value of the main coach in the market
    */
    public void setValue(float value) {
        this.value = value;
    }


	/**
    * Description This method get the level the skills of the coach
    * @return  level is level the skills of the coach
    */
    public float getLevel() {
        return level;
    }


	/**
    * Description This method sets is level the skills of the coach
    * @param level is level the skills of the coach
    */
    public void setLevel(float level) {
        this.level = level;
    }
    
	
	/**
    * Description This method calculate the price of the maincoach in the market
    */
    @Override
    public void calculateMarketPrice() {
        value = (getSalary() * 10) + (getYearsExperience() * 100) + (numberChampionships * 50);
    }


	/**
    * Description This method calculate the level of the coach
    */
    @Override
    public void calculateStarts() {
        
        level = 5 + (numberChampionships/10);
        
    }
	
	
	/**
    * Description This method show information of the main coach
    * @return info returns all the information of he main Coach 
    */
    @Override
	public String showInfo(){
            String estatus = (getStatus())?"Activo":"Inactivo";
            String info = "~~~~~~~~~~~~~~~Entrenador principal~~~~~~~~~~~~~~~~~\n";
                  info += "Nombre: " + getName() + "\n";
                  info += "ID: " + getID() + "\n";
                  info += "Salary: " + getSalary() + " USD\n";
                  info += "Estado: " + estatus + "\n";
                  info += "Años de experiencia: " + getYearsExperience() + "\n";
                  info += "Equipos a cargo en su carrera: " + getTeamsInCharge() + "\n";
                  info += "Campeonatos ganados en su carrera: " + getNumberChampionships() + "\n";
                  info += "Nivel: " + getLevel() + "\n\n";

            return info;
	}
    
}











