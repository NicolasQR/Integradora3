package model;

public class Player extends Employee implements SoccerWorld{
    
    private int shirtNumber;
    private int goalsNumbers;
    private double averageMark;
    private String position;
    private double value;
    private double level;
    
	
	/**
    * Description This is the constructor method of the Club Class
    * @param shirtNumber is the number of shirt of the player
    * @param goalsNumbers is the number of goals that the player mark
    * @param averageMark is the hability of the player show in double
    * @param position is the position of the player in the game
    * @param name is the name of player
    * @param ID is the identification of the player
    * @param salary is the quantity of money that the playe win
    * @param status  is the boolean that know us if the player is active or not in the club
    */
    public Player(int shirtNumber, int goalsNumbers, double averageMark, int position, String name, String ID, int salary, boolean status) {
        super(name, ID, salary, status);
        this.shirtNumber = shirtNumber;
        this.goalsNumbers = goalsNumbers;
        this.averageMark = averageMark;
        this.position = String.valueOf(Position.values()[position]);
    }
    
	
	/**
    * Description This method getshirtNumber
    * @return shirtNumber is the number of the shirt player
    */
    public int getShirtNumber() {
        return shirtNumber;
    }


	/**
    * Description This method sets the officeSector
    * @param shirtNumber is the number of the shirt player
    */
    public void setShirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
    }


	/**
    * Description This method getGoalsNumber of the player
    * @return goalsNumbers is the number of the player´s goals
    */
    public int getGoalsNumbers() {
        return goalsNumbers;
    }


	/**
    * Description This method sets the player goals
    * @param goalsNumbers is the number of the player´s goals
    */
    public void setGoalsNumbers(int goalsNumbers) {
        this.goalsNumbers = goalsNumbers;
    }


	/**
    * Description This method get average mark of the player
    * @return averageMark is the average of the player´s skills
    */
    public double getAverageMark() {
        return averageMark;
    }


	/**
    * Description This method sets the player average of the skills
    * @param averageMark is the average of the player´s skills
    */
    public void setAverageMark(float averageMark) {
        this.averageMark = averageMark;
    }


	/**
    * Description This method get position of the player in game
    * @return position is the position of the player´s game
    */
    public String getPosition() {
        return position;
    }


	/**
    * Description This method sets the player position of the game
    * @param position is the position of the player´s game
    */
    public void setPosition(String position) {
        this.position = position;
    }


	/**
    * Description This method get value of the player in game
    * @return value is the value of the player in market
    */
    public double getValue() {
        return value;
    }


	/**
    * Description This method sets the plavalue of the game
    * @param value is the value of the player in market
    */
    public void setValue(float value) {
        this.value = value;
    }


	/**
    * Description This method get level of the player in game
    * @return level is the level of the player in game
    */
    public double getLevel() {
        return level;
    }


	/**
    * Description This method sets the level of the player in game
    * @param level is the level of the player in gam
    */
    public void setLevel(float level) {
        this.level = level;
    }
    
	
	/**
    * Description This method calculate the price of player in the market
    */
    @Override
    public void calculateMarketPrice() {
        switch (position) {
            case "Portero":
                
                value = (getSalary()*12) + (averageMark*150);
                
                break;
                
            case "Defensor":
                
                value = (getSalary()*13) + (averageMark*125) + (goalsNumbers*100);
                
                break;
                
            case "Volante":
                
                value = (getSalary()*14) + (averageMark*135) + (goalsNumbers*125);
                
                break;
                
            case "Delantero":
                
                value = (getSalary()*15) + (averageMark*145) + (goalsNumbers*150);
                
                break;
        }
    }

	
	/**
    * Description This method calculate the stats of the player
    */
    @Override
    public void calculateStarts() {
        
        switch (position) {
            case "Portero":
                
                level = (averageMark * 0.9);
                
                break;
                
            case "Defensor":
                
                level = (averageMark * 0.9) + (goalsNumbers/100);
                
                break;
                
            case "Volante":
                
                level = (averageMark * 0.9) + (goalsNumbers/90);
                
                break;
                
            case "Delantero":
                
                level = (averageMark * 0.9) + (goalsNumbers/80);
                
                break;
        }   
    }
    
	
	/**
    * Description This method show information of the player
    * @return info returns all the information the player
    */
    @Override
    public String showInfo(){
        String estado = (getStatus())?"Activo":"Inactivo";
        String info = "~~~~~~~~~~~~~~~~~Jugador~~~~~~~~~~~~~~~~~~\n";
                  info += "Nombre: " + getName() + "\n";
                  info += "ID: " + getID() + "\n";
                  info += "Salary: " + getSalary() + " USD\n";
                  info += "Estado: " + estado + "\n";
                  info += "Numero de camisa: " + getShirtNumber() + "\n";
                  info += "Numero de goles: " + getGoalsNumbers() + "\n";
                  info += "Calificacion promedio: " + getAverageMark() + "\n";
                  info += "Posicion: " + getPosition() + "\n";
                  info += "Precio en el mercado: " + getValue() + "\n";
                  info += "Nivel: " + getLevel() + "\n\n";
                  
        return info;
    }


	/**
    * Description This method // REVISARRR
    */
    Object getPlayers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
