package cse222.proje;
import com.sun.source.tree.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

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
    private ArrayList<Pilot> Pilots;
    /**
     * Holds Firm's name
     */
    private String firmName;
    /**
     * Save old flight in a stack
     */
    private Stack<Flight> oldFlights; // priority queue

    public Firm() {

    }

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
            return true;
        }

        /**
         * Returns true if successfully add new pilot, otherwise false
         * @param newPilot will be added
         * @return true if successfully add new pilot, otherwise false
         * @throws NullPointerException if given parameter is null
         */
        public boolean addPilot(Pilot newPilot){
            return Pilots.add(newPilot);
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
        public Administrator removeAdministrator(Administrator removeAdministrator){
            return new Administrator();
        }

        /**
         * Returns true if successfully remove given pilot, otherwise false
         * @param removePilot will be removed
         * @return true if successfully remove given pilot, otherwise false
         * @throws NullPointerException if given parameter is null
         */
        public Pilot removePilot(Pilot removePilot){
            return Pilots.remove(0);
        }

        /**
         *  Returns true if successfully remove given plane, otherwise false
         * @param removePlane will be removed
         * @return true if successfully remove given plane, otherwise false
         * @throws NullPointerException if given parameter is null
         */
        public Plane removePlane(Plane removePlane){
            return planes.remove(0);
        }

        /**
         *  Returns true if successfully remove given flight, otherwise false
         *  add removed flight to oldFlights
         * @param removeFlight will be removed
         * @return true if successfully remove given flight, otherwise false
         * @throws NullPointerException if given parameter is null
         */
        public Flight removeFlight(Flight removeFlight){
            Flight temp = flights.remove(0);
            temp.getPilot().removeFlight(temp);
            return temp;
        }

        /**
         *  Returns true if successfully remove given hostess, otherwise false
         * @param removeHostess will be removed
         * @return true if successfully remove given hostess, otherwise false
         * @throws NullPointerException if given parameter is null
         */
        public Hostess removeHostess(Hostess removeHostess){
            return hostesses.remove(0);
        }

        /**
         * Returns all pilots that firm has as StringBuilder
         * @return all pilots that firm has as StringBuilder
         */
        public StringBuilder displayPilots(){
            return new StringBuilder();
        }

        /**
         * Returns all planes that firm has as StringBuilder
         * @return all planes that firm has as StringBuilder
         */
        public StringBuilder displayPlanes(){
            return new StringBuilder();
        }

        /**
         * Returns all flights that firm has as StringBuilder
         * @return all flights that firm has as StringBuilder
         */
        public StringBuilder displayFlights(){
            return new StringBuilder();
        }

        /**
         * Returns all hostesses that firm has as StringBuilder
         * @return all hostesses that firm has as StringBuilder
         */
        public StringBuilder displayHostesses(){
            return new StringBuilder();
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


    }

    /**
     * Creates a Firm object and creates first Administrator of that Firm
     * @param firmName will be set
     */
    public Firm(String firmName){
        this.firmName = firmName;

    }

    /**
     * Returns Administrator which has given ID and password, if not exist returns null
     * @param ID will be checked
     * @param password will be checked
     * @return Administrator which has given ID and password, if not exist returns null
     */
    public Administrator findAdmin(int ID, String password){
        return new Administrator();
    }

    /**
     * Returns Pilot which has given ID and password, if not exist returns null
     * @param ID will be checked
     * @param password will be checked
     * @return Pilot which has given ID and password, if not exist returns null
     */
    public Pilot findPilot(int ID, String password){
        return new Pilot();
    }

    /**
     * Returns Hostess which has given ID and password, if not exist returns null
     * @param ID will be checked
     * @param password will be checked
     * @return Hostess which has given ID and password, if not exist returns null
     */
    public Hostess findHostess(int ID, String password){
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

    /**
     * Returns Flight which has given flightID, if not exist returns null
     * @param flightID will be checked
     * @return Flight which has given ID and password, if not exist returns null
     */
    public Flight findFlight(int flightID){
        return new Flight();
    }

}
