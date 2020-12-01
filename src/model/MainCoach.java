package model;

public class MainCoach extends Coach implements SoccerWorld{
    
    private int teamsInCharge;
    private int numberChampionships;
    private float value;
    private float level;
    
    

    public int getTeamsInCharge() {
        return teamsInCharge;
    }

    public void setTeamsInCharge(int teamsInCharge) {
        this.teamsInCharge = teamsInCharge;
    }

    public int getNumberChampionships() {
        return numberChampionships;
    }

    public void setNumberChampionships(int numberChampionships) {
        this.numberChampionships = numberChampionships;
    }

    @Override
    public void calculateMarketPrice() {
        value = (getSalary() * 10) + (getYearsExperience() * 100) + (numberChampionships * 50);
    }

    @Override
    public void calculateStarts() {
        
        level = 5 + (numberChampionships/10);
        
    }
	
	public String showInfo(){
		String msg = "***********Entrenador principal***********\n";
		      msg += "*Nombre: " + getName() + "\n";
			  msg += "*Equipos a cargo en su carrera: " + getTeamsInCharge() + "\n";
			  msg += "*Campeonatos ganados en su carrera: " + getNumberChampionships() + "\n";
			  msg += 
	}
    
}











