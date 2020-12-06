package model;

public class LineUps {
    
    private final static int FIELD_TRINING_LONG = 10;
    private final static int FIELD_TRINING_WIDTH = 7;
    
    private String date;
    private String tactic;
    private int[][] fieldFormation;


	/**
    * Description This is the constructor method of the Club Class
    * @param date is the date that the match
    * @param tactic is the tactic of the team 
    */
    public LineUps(String date, int tactic) {
        this.date = date;
        this.tactic = String.valueOf(Tactic.values()[tactic]);
        fieldFormation = new int[FIELD_TRINING_LONG][FIELD_TRINING_WIDTH];
    }


	/**
    * Description This method getsYearsExperience
    * @return date is the date of the match 
    */
    public String getDate() {
        return date;
    }


	/**
    * Description This method setd the date of the match 
    * @param date is the date of the match 
    */
    public void setDate(String date) {
        this.date = date;
    }


	/**
    * Description This method gets the tactic of team
    * @return tactiic is the tactic of the team  
    */
    public String getTactic() {
        return tactic;
    }


	/**
    * Description This method sets the tactic of team
    * @param tactic  is the tactic of the team
    */
    public void setTactic(String tactic) {
        this.tactic = tactic;
    }


	/**
    * Description This method gets the Field training 
    * @return fieldTraining is the matriz of the team
    */
    public int[][] getFieldFormation() {
        return fieldFormation;
    }


	/**
    * Description This method sets the FieldTraining 
    * @param fieldTraining is the matriz of the team
    */
    public void setFieldFormation(int[][] fieldFormation) {
        this.fieldFormation = fieldFormation;
    }
	
	
    /**
    * Description This method covert the formation to the matriz of ints
	* @param fieldFormation is the formation with the formation of the team 1-1-1
    */
    public void convertFormation(String fieldFormation){
        String[] positions = fieldFormation.split("-");
        int[] formation = new int[this.fieldFormation.length];
        int[] pair =  {2,4,1,5,0,6};
        int[] odd = {3,2,4,1,5,0,6};
        
        for(int i = 0; i < positions.length; i++){
            formation[i] = Integer.parseInt(positions[i]);
        }
        
        for(int i = 0; i < this.fieldFormation.length; i++){
            for(int j = 0; j < formation[i]; j++){
                if(formation[i]%2 == 0){
                    this.fieldFormation[i][pair[j]] = 1;
                } else{
                    this.fieldFormation[i][odd[j]] = 1;
                }
            }
        }
        
    }
    
	
	/**
    * Description This method show the characteristics of the matriz and show the matriz
	* @return info with the information of the matriz
    */
    public String showInfo(){
        String info = "";
            info += "     Fecha: " + date + "\n";
            info += "     Tactica: " + tactic + "\n";
            info += "     Formacion\n";
            for(int i = fieldFormation.length -1; i >= 0; i--){
                info += "     ";
                for(int j = 0; j < fieldFormation[0].length; j++){
                    info += fieldFormation[i][j];
                }
                info += "\n";
            }
            
            info += "\n\n";
            
        return info;
    }
    
}
