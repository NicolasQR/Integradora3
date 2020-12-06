package model;

import java.util.ArrayList;

public class Club {

    //Constants
    private final static int DRESSING_ROOM_A_LONG = 7;
    private final static int DRESSING_ROOM_A_WIDTH = 6;

    private final static int DRESSING_ROOM_B_LONG = 7;
    private final static int DRESSING_ROOM_B_WIDTH = 7;

    private final static int OFFICE_SECTOR_LONG = 6;
    private final static int OFFICE_SECTOR_WIDTH = 6;

    private final static int AMOUNT = 2;

    private Team[] teams;

    private Coach[][] officeSector;

    private ArrayList<Employee> employees;

    private Player[][] dressingRoomA;
    private Player[][] dressingRoomB;

    private int nit;
    private String name;
    private String date;


	/**
    * Description This is the constructor method of the Club Class
    * @param nit is the identification of the club
    * @param date is the date of where was create the club
    */
    public Club() {

        this.nit = 234832;
        this.date = "07/02/2003";
        this.name = "NicosClub";
        teams = new Team[AMOUNT];
        Team teamA = new Team("Juventus");
        Team teamB = new Team("Barcelona");
        teams[0] = teamA;
        teams[1] = teamB;
        officeSector = new Coach[OFFICE_SECTOR_LONG][OFFICE_SECTOR_WIDTH];
        employees = new ArrayList<>();
        dressingRoomA = new Player[DRESSING_ROOM_A_LONG][DRESSING_ROOM_A_WIDTH];
        dressingRoomB = new Player[DRESSING_ROOM_B_LONG][DRESSING_ROOM_B_WIDTH];

    }


	/**
    * Description This method getsTeams
    * @return teams
    */
    public Team[] getTeams() {
        return teams;
    }


	/**
    * Description This method sets the Teams 
    * @param teams is the array of teams
    */
    public void setTeams(Team[] teams) {
        this.teams = teams;
    }


	/**
    * Description This method getsOfficeSector
    * @return officeSector is the matiz of the ofice sector
    */
    public Coach[][] getOfficeSector() {
        return officeSector;
    }


	/**
    * Description This method sets the officeSector
    * @param officeSector is the matriz of the offices
    */
    public void setOfficeSector(Coach[][] officeSector) {
        this.officeSector = officeSector;
    }
	
	
	/**
    * Description This method getsEmployees
    * @return employees
    */
    public ArrayList<Employee> getEmployees() {
        return employees;
    }


	/**
    * Description This method sets the employees 
    * @param employees is the array of the employees
    */
    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }


	/**
    * Description This method getDressingRoomA
    * @return dressinRoomA is the matriz that save the position of the players in the roomA
    */
    public Player[][] getDressinRoomA() {
        return dressingRoomA;
    }


	/**
    * Description This method sets DressingroomA
    * @param dressinRoomA is the matriz that save the position of the players in the roomA
    */
    public void setDressinRoomA(Player[][] dressinRoomA) {
        this.dressingRoomA = dressinRoomA;
    }


	/**
    * Description This method getDressingRoomB
    * @return dressinRoomB is the matriz that save the position of the players in the roomB
    */
    public Player[][] getDressinRoomB() {
        return dressingRoomB;
    }


	/**
    * Description This method sets DressingroomB
    * @param dressinRoomA is the matriz that save the position of the players in the roomB
    */
    public void setDressinRoomB(Player[][] dressinRoomB) {
        this.dressingRoomB = dressinRoomB;
    }


	/**
    * Description This method getNit of the club
    * @return nit is the identification of club
    */
    public int getNit() {
        return nit;
    }


	/**
    * Description This method setsNit of club
    * @param nit is the Nit of club that the user give to the aplication 
    */
    public void setNit(int nit) {
        this.nit = nit;
    }


	/**
    * Description This method getDate of the creation of club
    * @return date of the create of club
    */
    public String getDate() {
        return date;
    }


	/**
    * Description This method setsDate of the creation of club
    * @param date is the date creation of club
    */
    public void setDate(String date) {
        this.date = date;
    }


	/**
    * Description This method getName of the creation of club
    * @return name of the create of club
    */
    public String getName() {
        return name;
    }


	/**
    * Description This method setsName of the creation of club
    * @param name is the name of club
    */
    public void setName(String name) {
        this.name = name;
    }


	/**
    * Description This method ShowemployeeInfoo
    * @param shirtNumber is the number of shirt of the player 
    * @param goalsNumbers is the goals that the player  mark 
    * @param averageMark is the average mark that help us to know how good is a player  
    * @param position is the position in the court  
    * @param name is the name of employee
    * @param ID is teh identification of employee
    * @param salary is the salaty of the employee
    * @param status is the status of the employee true or false depends if the employee is active in th eclub
    * @return info that contain if the employee was or not was contract
    */
    public String contractEmployee(int shirtNumber, int goalsNumbers, double averageMark, int position, String name, String ID, int salary, boolean status) {

        String info = "";

        Player player = new Player(shirtNumber, goalsNumbers, averageMark, position, name, ID, salary, status);
        player.calculateMarketPrice();
        player.calculateStarts();
        employees.add(player);

        info = "El jugador ha sido contratado correctamente";

        return info;
    }


	/**
    * Description This method ShowemployeeInfoo
    * @param teamsInCharge is the number of teams that the coach have in charge  
    * @param numberChampionships is the number of champions that the coach win 
    * @param yearsExperience is the years of experience that the coach have  
    * @param name is the name of employee
    * @param ID is teh identification of employee
    * @param salary is the salaty of the employee
    * @param status is the status of the employee true or false depends if the employee is active in th eclub
    * @return info that contain if the employee was or not was contract
    */
    public String contractEmployee(int teamsInCharge, int numberChampionships, int yearsExperience, String name, String ID, int salary, boolean status) {

        String info = "";

        MainCoach coach = new MainCoach(teamsInCharge, numberChampionships, yearsExperience, name, ID, salary, status);
        coach.calculateMarketPrice();
        coach.calculateStarts();
        employees.add(coach);

        info = "El entrenador ha sido contratado correctamente.";

        return info;
    }


	/**
    * Description This method ShowemployeeInfoo
    * @param wasPlayer is the boolean that confirms if the coach was or not a player 
    * @param expertise is the expertise that the coach is especialized
    * @param yearsExperience is the years of experience that the coach have  
    * @param name is the name of employee
    * @param ID is teh identification of employee
    * @param salary is the salaty of the employee
    * @param status is the status of the employee true or false depends if the employee is active in th eclub
    * @return info that contain if the employee was or not was contract
    */
    public String contractEmployee(boolean wasPlayer, int expertise, int yearsExperience, String name, String ID, int salary, boolean status) {

        String info = "";

        AssistantCoach coach = new AssistantCoach(wasPlayer, expertise, yearsExperience, name, ID, salary, status);
        employees.add(coach);

        info = "El entrenador ha sido contratado.";

        return info;

    }


	/**
    * Description This method dismissEmployee
    * @return dismiss is the text that inform to user if the employee was or not was dismiss
    */
    public String dismissEmployee(String name) {

        String dismiss = "";

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getName().equals(name)) {
                employees.remove(i);
                i = employees.size();
                dismiss = "El empleado fue despedido";
            } else {
                dismiss = "El empleado no esta registrado.";
            }
        }

        return dismiss;
    }


	/**
    * Description This method ShowemployeeInfoo
    * @return info that contain all employees information 
    */
    public String showEmployeeInfo() {

        String info = "";

        for (int i = 0; i < employees.size(); i++) {

            if (employees.get(i) instanceof Player) {
                info += employees.get(i).showInfo();
            }
        }

        for (int i = 0; i < employees.size(); i++) {

            if (employees.get(i) instanceof MainCoach) {
                info += employees.get(i).showInfo();
            }
        }

        for (int i = 0; i < employees.size(); i++) {

            if (employees.get(i) instanceof AssistantCoach) {
                info += employees.get(i).showInfo();
            }
        }

        return info;
    }


	/**
    * Description This method ShowemployeeInfoo
    * @param name String that contain the name of player 
    * @param team int that give us the team that the player go
    * @return info that contain all employees information 
    */
    public String addEmployeeToTeam(String name, int team) {

        String add = "";

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) instanceof Player) {
                if (employees.get(i).getName().equals(name)) {

                    for (int j = 0; j < teams[team].getPlayers().length; j++) {
                        if (teams[team].getPlayers()[j] == null) {
                            teams[team].getPlayers()[j] = (Player) employees.get(i);
                            add = "El jugador se añadio correctamente.";
                            j = teams[team].getPlayers().length;
                            i = employees.size();
                        } else {
                            add = "No se pudo agregar el jugador, no hay cupos en el equipo.";
                        }
                    }

                } else {
                    add = "El trabajador no se encuentra registrado.";
                }

            } else if (employees.get(i) instanceof MainCoach) {
                if (employees.get(i).getName().equals(name)) {

                    if (teams[team].getMainCoach() == null) {
                        teams[team].setMainCoach((MainCoach) employees.get(i));
                        add = "El entrenador se añadio correctamente.";
                        i = employees.size();
                    } else {

                        add = "El equipo ya tiene entrenador principal.";
                    }
                } else {
                    add = "El trabajador no se encuentra registrado.";
                }

            } else if (employees.get(i) instanceof AssistantCoach) {
                if (employees.get(i).getName().equals(name)) {

                    for (int j = 0; j < teams[team].getAssistantCoachs().length; j++) {
                        if (teams[team].getAssistantCoachs()[j] == null) {
                            teams[team].getAssistantCoachs()[j] = (AssistantCoach) employees.get(i);
                            add = "El entrenador asistente se añadio correctamente.";
                            j = teams[team].getAssistantCoachs().length;
                            i = employees.size();
                        } else {
                            add = "El equipo ya tiene entrenadores asistentes.";
                        }
                    }

                } else {
                    add = "El trabajador no se encuentra registrado.";
                }
            }
        }

        return add;
    }


	/**
    * Description This method addLineUp to team
    * @param team int with th eidentificator to know if is team A or team B AND 0 if is team A OR 1 if team B
    * @param date String with the date of the math 
	* @param tactic int is the number of give us what tactic have the team to the match
	* @param formation String with the aliniation of the team
    * @return info that contain all employees information 
    */
    public String addLineUp(int team, String date, int tactic, String formation) {
        String add = "";

        teams[team].addLineUp(date, tactic, formation);
        add = "Se añadio la formacion.";

        return add;
    }


	/**
    * Description This method showteamInfo
    * @return info returns all the information the team 
    */
    public String showTeamInfo() {
        String info = "";

        for (int i = 0; i < teams.length; i++) {
            info += teams[i].showInfo();
        }

        return info;
    }


	/**
    * Description This method update the info of the employee
    * @param employee int with the type of employee
    * @param shirtNumber int with the shirt niumber of the player
	* @param goalsNumbers int with the goals mark by the player
	* @param averageMark double with the average of the player in game
	* @param position int that give us the position th eplayer in the game
	* @param salary int is the salary that the player gets
	* @param status boolean with the confirmation if the player is active or inactive for the club
    * @return info that contain all employees information 
    */
    public void upDateEmployeeInfo(int employee, int shirtNumber, int goalsNumbers, double averageMark, int position, int salary, boolean status) {
        Player player = (Player) employees.get(employee);
        player.setShirtNumber(shirtNumber);
        player.setGoalsNumbers(goalsNumbers);
        player.setAverageMark(salary);
        player.setPosition(date);
        player.setSalary(salary);
        player.setStatus(status);
        employees.remove(employee);
        employees.add(employee, player);
    }


	/**
    * Description This method update the info of the employee
    * @param employee int with the type of employee
    * @param teamsInCharge int with the number of teams that the coach have in charge
	* @param numberChampionship int with the quantity of champions have the coach
	* @param yearsExperience  int quantity with the years experience of the coach
	* @param salary int is the salary that the coach gets
	* @param status boolean with the confirmation if the coach is active or inactive for the club
    * @return info that contain all employees information 
    */
    public void upDateEmployeeInfo(int employee, int teamsInCharge, int numberChampionships, int yearsExperience, int salary, boolean status) {
        MainCoach main = (MainCoach) employees.get(employee);
        main.setTeamsInCharge(teamsInCharge);
        main.setNumberChampionships(numberChampionships);
        main.setYearsExperience(yearsExperience);
        main.setSalary(salary);
        main.setSalary(salary);
        employees.remove(employee);
        employees.add(employee, main);
    }


	/**
    * Description This method update the info of the employee
    * @param employee int with the type of employee
    * @param wasPlayer boolean if the employee was or not player
	* @param expertise string with the expertise that the coach have in game
	* @param yearsExperience  int quantity with the years experience of the coach
	* @param salary int is the salary that the coach gets
	* @param status boolean with the confirmation if the coach is active or inactive for the club
    * @return info that contain all employees information 
    */
    public void upDateEmployeeInfo(int employee, boolean wasPlayer, String expertise, int yearsExperience, int salary, boolean status) {
        AssistantCoach assistant = (AssistantCoach) employees.get(employee);
        assistant.setWasPlayer(wasPlayer);
        assistant.setExpertise(expertise);
        assistant.setYearsExperience(yearsExperience);
        assistant.setSalary(salary);
        assistant.setSalary(salary);
        employees.remove(employee);
        employees.add(employee, assistant);
    }


	/**
    * Description This method add a player to dressing roomA
	*@param player is the identificator the player to add to the dressing roomA
    * @return add returns message if was added or not
    */
    public String addToDressingRoomA(int player) {

        int cont = 0;
        String add = "";
        for (int i = 0; i < dressingRoomA.length; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < dressingRoomA[0].length; j += 2) {
                    if (dressingRoomA[i][j] == null) {
                        dressingRoomA[i][j] = teams[0].getPlayers()[player];
                        add = "Se añadio correctamente.";
                        i = dressingRoomA.length;
                        j = dressingRoomA[0].length;
                    }
                }
            } else {
                for (int j = 1; j < dressingRoomA[0].length; j += 2) {
                    if (dressingRoomA[i][j] == null) {
                        dressingRoomA[i][j] = teams[0].getPlayers()[player];
                        add = "Se añadio correctamente.";
                        i = dressingRoomA.length;
                        j = dressingRoomA[0].length;

                    } else {
                        cont++;
                        if (cont == 3) {
                            i++;
                        }

                    }
                }
            }
        }
        return add;
    }


	/**
    * Description This method add a player to dressing roomB
	*@param player is the identificator the player to add to the dressing roomB
    * @return add returns message if was added or not
    */
    public String addToDressingRoomB(int player) {
        String add = "";
        int cont = 0;
        int cont2 = 0;
        for (int i = 0; i < dressingRoomB.length; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < dressingRoomB[0].length; j += 2) {
                    if (dressingRoomB[i][j] == null) {
                        dressingRoomB[i][j] = teams[1].getPlayers()[player];
                        add = "Se agrego correctamente.";
                        i = dressingRoomB.length;
                        j = dressingRoomB[0].length;
                    } else {
                        cont2++;
                        if (cont2 == 3) {
                            i++;
                        }
                    }
                }
            } else {
                for (int j = 1; j < dressingRoomB[0].length; j += 2) {
                    if (dressingRoomB[i][j] == null) {
                        dressingRoomB[i][j] = teams[1].getPlayers()[player];
                        add = "Se agrego correctamente.";
                        i = dressingRoomB.length;
                        j = dressingRoomB[0].length;
                    } else {
                        cont++;
                        if (cont == 3) {
                            i++;
                        }

                    }
                }
            }
        }
        return add;
    }


	/**
    * Description This method add a coach to office room
	* @param coach is the name the coach to add to the Office sector
    * @return add returns message if was added or not
    */
    public String addToOfficeSector(String coach) {
        String add = "";
        int cont = 0;
        int cont2 = 0;
        int ind = 0;

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getName().equals(coach)) {
                ind = i;
            }
        }

        for (int i = 0; i < officeSector.length; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < officeSector[0].length; j += 2) {
                    if (officeSector[i][j] == null) {
                        officeSector[i][j] = (Coach) employees.get(ind);
                        add = "Se añadio correctamente.";
                        i = officeSector.length;
                        j = officeSector[0].length;
                    } else {
                        cont2++;
                        if (cont2 == 3) {
                            i++;
                        }
                    }
                }
            } else {
                for (int j = 1; j < officeSector[0].length; j += 2) {
                    if (officeSector[i][j] == null) {
                        officeSector[i][j] = (Coach) employees.get(ind);
                        add = "Se añadio correctamente.";
                        i = officeSector.length;
                        j = officeSector[0].length;
                    } else {
                        cont++;
                        if (cont == 3) {
                            i++;
                        }

                    }
                }
            }
        }
        return add;
    }


	/**
    * Description This method show info of the dressing rooms
    * @return info returns the matriz imprint with the info that the dressing rooms
    */
    public String showDresingRoomInfo() {

        String info = "";
        info += "~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
        info += "~Vestidor del equipo Newpi~\n";
        info += "~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
        for (int i = 0; i < dressingRoomA.length; i++) {
            info += "     ";
            for (int j = 0; j < dressingRoomA[0].length; j++) {
                if (dressingRoomA[i][j] != null) {
                    info += 1;
                } else {
                    info += 0;
                }
            }
            info += "\n";
        }
        info += "\n";
        info += "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
        info += "~Vestidor del equipo NewTeam~\n";
        info += "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";

        for (int i = 0; i < dressingRoomB.length; i++) {
            info += "     ";
            for (int j = 0; j < dressingRoomB[0].length; j++) {
                if (dressingRoomB[i][j] != null) {
                    info += 1;
                } else {
                    info += 0;
                }
            }
            info += "\n";
        }

        return info;
    }


	/**
    * Description This method show info of the office sector
    * @return info returns the matriz imprint with the info that the show office sector 
    */
    public String showOfficeSector() {

        String info = "";
        info += "~~~~~~~~~~~~~~~~~~~~\n";
        info += "~Sector de oficinas~\n";
        info += "~~~~~~~~~~~~~~~~~~~~\n";
        for (int i = 0; i < officeSector.length; i++) {
            info += "      ";
            for (int j = 0; j < officeSector[0].length; j++) {
                if (officeSector[i][j] != null) {
                    info += 1;
                } else {
                    info += 0;
                }
            }
            info += "\n";
        }

        return info;
    }


	/**
    * Description This method show info of the club
    * @return info returns all the information of the club
    */
    public String showClubInfo() {
        String info = "";

        info += showEmployeeInfo();
        info += showTeamInfo();
        info += showDresingRoomInfo();
        info += showOfficeSector();

        return info;
    }
    
	
	/**
    * Description This method show info of the club
	* @param name is the name of player 
    * @return find returns the information of the position of playe in dressing room if is in A or B
    */
    public String findPlayer(String name){
        String find = "";
        int ind = -1;
        int jnd = -1;
        boolean findTrue = false;
        
        find = "El jugador " + name + " esta ubicado en el vestidor A en el espacio encerrado.\n";
        for(int i = 0; i < dressingRoomA.length; i++){
            for(int j = 0; j < dressingRoomA[0].length; j++){
                if(dressingRoomA[i][j] != null){
                    if(dressingRoomA[i][j].getName().equals(name)){
                        ind = i;
                        jnd = j;
                        findTrue = true;
                    }
                }
            }
        }

        for (int i = 0; i < dressingRoomA.length; i++) {
            for (int j = 0; j < dressingRoomA[0].length; j++) {
                if (dressingRoomA[i][j] != null) {

                    find += (findTrue && i == ind && j == jnd)?"[1]":1;
                } else {
                    find += 0;
                }
            }
            find += "\n";
        }
        
        if(ind != 0 && jnd != 0){
            find = "El jugador " + name + " esta ubicado en el vestidor B en el espacio cerrado.\n";
            for(int i = 0; i < dressingRoomB.length; i++){
                for(int j = 0; j < dressingRoomB[0].length; j++){
                    if(dressingRoomB[i][j] != null){
                        if(dressingRoomB[i][j].getName().equals(name)){
                            ind = i;
                            jnd = j;
                            findTrue = true;
                        }
                    }
                }
            }

            for (int i = 0; i < dressingRoomB.length; i++) {
                for (int j = 0; j < dressingRoomB[0].length; j++) {
                    if (dressingRoomB[i][j] != null) {                      
                        find += (findTrue && i == ind && j == jnd)?"[1]":1;
                    } else {
                        find += 0;
                    }
                }
                find += "\n";
            }
        }
        return find;
    }
    
	
	/**
    * Description This method show info of the club
	* @param name is the name of chach
    * @return find returns the information of the position of coach in the dressing room 
    */
    public String findCoach(String name){
        String find = "";
        int ind = -1;
        int jnd = -1;
        boolean findTrue = false;
        
        find = "El entrenador " + name + " esta ubicado en el vestidor A en el espacio encerrado.\n";
        for(int i = 0; i < officeSector.length; i++){
            for(int j = 0; j < officeSector[0].length; j++){
                if(officeSector[i][j] != null){
                    if(officeSector[i][j].getName().equals(name)){
                        ind = i;
                        jnd = j;
                        findTrue = true;
                    }
                }
            }
        }

        for (int i = 0; i < officeSector.length; i++) {
            for (int j = 0; j < officeSector[0].length; j++) {
                if (officeSector[i][j] != null) {

                    find += (findTrue && i == ind && j == jnd)?"[1]":1;
                } else {
                    find += 0;
                }
            }
            find += "\n";
        }
        
        return find;
    }
    
}
