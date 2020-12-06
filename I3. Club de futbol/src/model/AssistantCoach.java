package model;

public class AssistantCoach extends Coach{
  
    private boolean wasPlayer;
    private String expertise;

	/**
    * Description This is the constructor method of the AssistantCoach class
    */
    public AssistantCoach(boolean wasPlayer, int expertise, int yearsExperience, String name, String ID, int salary, boolean status) {
        super(yearsExperience, name, ID, salary, status);
        this.wasPlayer = wasPlayer;
        this.expertise = String.valueOf(Expertise.values()[expertise]);
    }

    
	/**
    * Description This method getsWasPlayer
    * @return wasPlayer
    */
    public boolean getWasPlayer() {
        return wasPlayer;
    }


	/**
    * Description This method sets if the AsistantCoach WasPlayer
    * @param WasPlayer boolean turn if the employee was a player 
    */
    public void setWasPlayer(boolean wasPlayer) {
        this.wasPlayer = wasPlayer;
    }


	/**
    * Description This method gets the expertise of the AsistantCoach
    * @return expertise 
    */
    public String getExpertise() {
        return expertise;
    }


	/**
    * Description This method sets the Expertise of AsistantCoach
    * @param expertise boolean turn if the employee was a player 
    */
    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }


	/**
    * Description This method overwrites the class Showinfo
    * @return info with all the information of the AssistantCoach;  
    */
    @Override
    public String showInfo(){ 
        String player = (wasPlayer)?"SI":"NO";
        String status = (getStatus())?"Activo":"Inactivo";
        String info = "***********Entrenador asistente***********\n";
                  info += "Nombre: " + getName() + "\n";
                  info += "ID: " + getID() + "\n";
                  info += "Salary: " + getSalary() +" USD\n";
                  info += "Estado: " + status + "\n";
                  info += "Años de experiencia: " + getYearsExperience() + "\n";
                  info += "Fue jugador: " + player + "\n";
                  info += "Experticio: " + getExpertise() + "\n\n";
        return info;
    }
}
