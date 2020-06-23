package cse222.proje;

import java.util.ArrayList;

public class Firm {
    /**
     * Holds Firm's administrators
     */
    private ArrayList<Administrator> administrators;
    /**
     * Holds Firm's flights
     */
    private ArrayList<Flight> flights;
    /**
     * Holds Firm's planes
     */
    private ArrayList<Plane> planes;
    /**
     * Holds Firm's hostesses
     */
    private ArrayList<Hostess> hostesses;
    /**
     * Holds Firm's Pilots
     */
    private ArrayList<Pilot> pilots;
    /**
     * Holds Firm's name
     */
    private String firmName;
    /**
     * Save old flight in a stack
     */
    //private Stack<Flight> oldFlights; // min heap

    public class Administrator extends Employee{
        /**
         * Creates an Administrator of Firm object
         * @param name will be set
         * @param surname will be set
         * @param ID will be set
         * @param password will be set
         */
        public Administrator(String name, String surname, int ID, String password) {
            super(name, surname, ID, password);
        }

        public Administrator() {
            super();
        }

        /**
         * Returns true if successfully add new Administrator, otherwise false
         * @param admin will be added
         * @return true if successfully add new Administrator, otherwise false
         * @throws NullPointerException if given parameter is null
         */
        public boolean addAdministrator(Administrator admin){
            return administrators.add(admin);
        }

        /**
         * Returns true if successfully add new pilot, otherwise false
         * @param newPilot will be added
         * @return true if successfully add new pilot, otherwise false
         * @throws NullPointerException if given parameter is null
         */
        public boolean addPilot(Pilot newPilot){
            return pilots.add(newPilot);
        }

        /**
         * Returns true if successfully add new plane, otherwise false
         * @param newPlane will be added
         * @return true if successfully add new plane, otherwise false
         * @throws NullPointerException if given parameter is null
         */
        public boolean addPlane(Plane newPlane){
            return planes.add(newPlane);
        }

        /**
         * Returns true if successfully add new flight, otherwise false
         * @param newFlight will be added
         * @return true if successfully add new flight, otherwise false
         * @throws NullPointerException if given parameter is null
         */
        public boolean addFlight(Flight newFlight){
            return flights.add(newFlight);
        }

        /**
         * Returns true if successfully add new hostess, otherwise false
         * @param newHostess will be added
         * @return true if successfully add new hostess, otherwise false
         * @throws NullPointerException if given parameter is null
         */
        public boolean addHostess(Hostess newHostess){
            return hostesses.add(newHostess);
        }

        /**
         *  Returns true if successfully remove given Administrator, otherwise false, can remove until 1 Administrator last
         * @param removeAdministrator will be removed
         * @return true if successfully remove given Administrator, otherwise false
         * @throws NullPointerException if given parameter is null
         */
        public boolean removeAdministrator(Administrator removeAdministrator){
        	if(administrators.size() == 1) {
        		System.out.printf("You can not remove last admin!");
        		return false;
        	}
            return administrators.remove(removeAdministrator);
        }

        /**
         * Returns true if successfully remove given pilot, otherwise false
         * @param removePilot will be removed
         * @return true if successfully remove given pilot, otherwise false
         * @throws NullPointerException if given parameter is null
         */
        public boolean removePilot(Pilot removePilot){
            return pilots.remove(removePilot);
        }

        /**
         *  Returns true if successfully remove given plane, otherwise false
         * @param removePlane will be removed
         * @return true if successfully remove given plane, otherwise false
         * @throws NullPointerException if given parameter is null
         */
        public boolean removePlane(Plane removePlane){
            return planes.remove(removePlane);
        }

        /**
         *  Returns true if successfully remove given flight, otherwise false
         *  add removed flight to oldFlights
         * @param removeFlight will be removed
         * @return true if successfully remove given flight, otherwise false
         * @throws NullPointerException if given parameter is null
         */
        public boolean removeFlight(Flight removeFlight){ /////////////////////////////////////////////////
        	// add oldflight
            return flights.remove(removeFlight);
        }

        /**
         *  Returns true if successfully remove given hostess, otherwise false
         * @param removeHostess will be removed
         * @return true if successfully remove given hostess, otherwise false
         * @throws NullPointerException if given parameter is null
         */
        public boolean removeHostess(Hostess removeHostess){
            return hostesses.remove(removeHostess);
        }
	    
	/**
         * Returns all Administrator that firm has as StringBuilder
         * @return all Administrator that firm has as StringBuilder
         */
        public StringBuilder displayAdministrators(){
            StringBuilder str = new StringBuilder();
        	for(Administrator it : administrator) str.append(it.toString());        	
            return str;
        }    

        /**
         * Returns all pilots that firm has as StringBuilder
         * @return all pilots that firm has as StringBuilder
         */
        public StringBuilder displayPilots(){
        	StringBuilder str = new StringBuilder();
        	for(Pilot it : pilots) str.append(it.toString());        	
            return str;
        }

        /**
         * Returns all planes that firm has as StringBuilder
         * @return all planes that firm has as StringBuilder
         */
        public StringBuilder displayPlanes(){
        	StringBuilder str = new StringBuilder();
        	for(Plane it : planes) str.append(it.toString());        	
            return str;
        }

        /**
         * Returns all flights that firm has as StringBuilder
         * @return all flights that firm has as StringBuilder
         */
        public StringBuilder displayFlights(){
        	StringBuilder str = new StringBuilder();
        	for(Flight it : flights) str.append(it.toString());        	
            return str;
        }

        /**
         * Returns all hostesses that firm has as StringBuilder
         * @return all hostesses that firm has as StringBuilder
         */
        public StringBuilder displayHostesses(){
        	StringBuilder str = new StringBuilder();
        	for(Hostess it : hostesses) str.append(it.toString());        	
            return str;
        }

        /**
         * Returns true if successfully add given flight to oldFlights, otherwise false
         * @param oldFlight will be added
         * @return true if successfully add new flight, otherwise false
         * @throws NullPointerException if given parameter is null
         */
        public boolean addOldFlight(Flight oldFlight){
            return true;
        } 
	    
	/**
         * Returns all old flights that firm has as StringBuilder
         * @return all old flights that firm has as StringBuilder
         */
        public StringBuilder displayOldFlights(){
            StringBuilder str = new StringBuilder();
        	for(Flight it : oldFlights) str.append(it.toString());        	
            return str;
        }    
	    
	 /**
         * Returns Pilot which has given ID and password, if not exist returns null
         * @param ID will be checked
         * @return Pilot which has given ID and password, if not exist returns null
         */
        public Pilot findPilot(int ID){
            return new Pilot();
        }

        /**
         * Returns Hostess which has given ID and password, if not exist returns null
         * @param ID will be checked
         * @return Hostess which has given ID and password, if not exist returns null
         */
        public Hostess findHostess(int ID){
            return new Hostess();
        }

        /**
         * Returns Plane which has given ID and password, if not exist returns null
         * @param planeID will be checked
         * @return Plane which has given ID and password, if not exist returns null
         */
        public Plane findPlane(int planeID){
            return new Plane();
        }


        public boolean removeOldFlights(Date date){

            return true;
        }
   
	    
    }

    /**
     * Creates a Firm object and creates first Administrator of that Firm
     * @param firmName will be set
     */
    public Firm(String firmName){
        this.firmName = firmName;
        this.administrators = new ArrayList<Administrator>();
        this.flights = new ArrayList<Flight>();
        this.hostesses = new ArrayList<Hostess>();
        this.pilots = new ArrayList<Pilot>();
        this.planes = new ArrayList<Plane>();
    }
    
    public String getFirmName() {
		return firmName;
	}
    
    /**
     * Returns Administrator which has given ID and password, if not exist returns null
     * @param ID will be checked
     * @param password will be checked
     * @return Administrator which has given ID and password, if not exist returns null
     */
    public Administrator findAdmin(int ID, String password){
        for(Administrator it : administrators) {
        	if (it.getID() == ID && it.getPassword().equals(password)) return it;
        }
          
        System.out.printf("No admin has found!");
    	return null;
    }

    /**
     * Returns Pilot which has given ID and password, if not exist returns null
     * @param ID will be checked
     * @param password will be checked
     * @return Pilot which has given ID and password, if not exist returns null
     */
    public Pilot findPilot(int ID, String password){
    	for(Pilot it : pilots) {
        	if (it.getID() == ID && it.getPassword().equals(password)) return it;
        }
        
        System.out.printf("No pilot has found!");
    	return null;
    }

    /**
     * Returns Hostess which has given ID and password, if not exist returns null
     * @param ID will be checked
     * @param password will be checked
     * @return Hostess which has given ID and password, if not exist returns null
     */
    public Hostess findHostess(int ID, String password){
    	for(Hostess it : hostesses) {
        	if (it.getID() == ID && it.getPassword().equals(password)) return it;
        }
        
        System.out.printf("No hostess has found!");
    	return null;
    }

    /**
     * Returns Plane which has given ID and password, if not exist returns null
     * @param planeID will be checked
     * @return Plane which has given ID and password, if not exist returns null
     */
    public Plane findPlane(int planeID){
    	for(Plane it : planes) {
        	if (it.getPlaneID() == planeID) return it;
        }
    	
        System.out.printf("No plane has found!");
    	return null;
    }

    /**
     * Returns Flight which has given flightID, if not exist returns null
     * @param flightID will be checked
     * @return Flight which has given ID and password, if not exist returns null
     */
    public Flight findFlight(int flightID){
    	for(Flight it : flights) {
        	if (it.getFlightID() == flightID) return it;
        }
        
        System.out.printf("No flight has found!");
    	return null;
    }

    public String toString() {
    	return firmName;
    }
}
