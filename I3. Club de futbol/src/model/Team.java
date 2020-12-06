package model;

import java.util.ArrayList;

public class Team {
    
    private final static int ASSITANT_NUMBERS = 3;
    private final static int PLAYER_NUMBERS = 25;
    
    private String name;
    private Player[] players;
    private AssistantCoach[] assistantCoachs;
    private MainCoach mainCoach;
    private ArrayList<LineUps> lineUps;
    
	
	/**
    * Description This is the constructor method of the Club Class
    * @param  name is the identification of the club
    */
    public Team(String name) {
        this.name = name;
        players = new Player[PLAYER_NUMBERS];
        assistantCoachs = new AssistantCoach[ASSITANT_NUMBERS];
        lineUps = new ArrayList<>();
    }
    
	
	/**
    * Description This method gets Name
    * @return name is the name of team
    */
    public String getName() {
        return name;
    }


	/**
    * Description This method sets name
    * @param name name of the team
    */
    public void setName(String name) {
        this.name = name;
    }


	/**
    * Description This method get object with the player or players
    * @return players is the object with the player
    */
    public Player[] getPlayers() {
        return players;
    }


	/**
    * Description This method sets the object with the player
    * @param players is the object with the player
    */
    public void setPlayers(Player[] players) {
        this.players = players;
    }


	/**
    * Description This method get object with assistant coach
    * @return assistantCoachs is the objects class assistant
    */
    public AssistantCoach[] getAssistantCoachs() {
        return assistantCoachs;
    }


	/**
    * Description This method sets the object with assistant coach
    * @param assistantCoachs is the objects class assistant
    */
    public void setAssistantCoachs(AssistantCoach[] assistantCoachs) {
        this.assistantCoachs = assistantCoachs;
    }


	/**
    * Description This method get the objet  main coah
    * @return mainCoach is the object  main coach
    */
    public MainCoach getMainCoach() {
        return mainCoach;
    }


	/**
    * Description This method sets the object main coach 
    * @param mainCoach is the object main coach
    */
    public void setMainCoach(MainCoach mainCoach) {
        this.mainCoach = mainCoach;
    }
    
	
	/**
    * Description This is the method that add line up
    */
    public void addLineUp(String date, int tactic, String formation){
        LineUps lineFormation = new LineUps(date, tactic);
        lineFormation.convertFormation(formation);
        lineUps.add(lineFormation);
    }
    
	
	/**
    * Description This method show information of the team
    * @return info returns all the information the team
    */
    public String showInfo(){
        String info = "";
        int main = (mainCoach != null)?1:0;
        int assistant = 0;
        int players = 0;
        
            for(int i = 0; i < assistantCoachs.length; i++){
                if(assistantCoachs[i] == null){
                    assistant = i;
                    i = assistantCoachs.length;
                }
            }
        
            for(int i = 0; i < this.players.length; i++){
                if(this.players[i] == null){
                    players = i;
                    i = this.players.length;
                }
            }
            
            info =  "~~~~~~~~~~~~~~Equipo~~~~~~~~~~~~~~\n";
            info += "Nombre: " + getName() + "\n";
            info += "Jugadores: " + players + "/25\n";
            for(int i = 0; i < this.players.length; i++){
                if(this.players[i] != null){
                    info += "     Jugador " + (i+1) + ": " + this.players[i].getName() + "\n";
                }
            }
            
            info += "Entrenador principal: " + main + "/1\n";
            if(mainCoach != null){
                    info += "      Entrenador: " + mainCoach.getName() + "\n";
            }
            
            info += "Entrenadores secundarios: " + assistant + "/2\n";
            for(int i = 0; i < assistantCoachs.length; i++){
                if(assistantCoachs[i] != null){
                    info += "     Asistente " + (i+1) + ": " + assistantCoachs[i].getName() + "\n";
                }
            }
            
            info += "Alineaciones: " + lineUps.size() + "\n";
            
            for(int i = 0; i < lineUps.size(); i++){
                info += lineUps.get(i).showInfo();
            }

            info += "\n\n";
            
        return info;
    }
}
