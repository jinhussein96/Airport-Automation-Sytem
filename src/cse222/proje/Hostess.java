package cse222.proje;

import java.util.ArrayList;

public class Hostess extends Employee{
    /**
     * Holds flights that hostess work on
     */
    private ArrayList<Flight> flights;

    /**
     * Create a Hostess object
     * @param name will be set
     * @param surname will be set
     * @param ID will be set
     * @param password will be set
     */
    public Hostess(String name, String surname, int ID, String password) {
        super(name, surname, ID, password);
        this.flights = new ArrayList<Flight>();
    }

    public Hostess() {

    }

    /**
     * Adds given flight to hostess's flights
     * @param addFlight will be added
     * @return true if it is added successfully
     */
    public boolean addFlight(Flight addFlight){
        return flights.add(addFlight);
    }

    /**
     * Removes given flight to hostess's flights
     * @param removeFlight will be removed
     * @return true if it is removed successfully
     */
    public boolean removeFlight(Flight removeFlight){
        return flights.remove(removeFlight);
    }

    /**
     * Returns Hostess's flights as StringBuilder
     * @return Hostess's flights as StringBuilder
     */
    public StringBuilder displayShift(){
        return new StringBuilder();
    }

}
