package cse222.proje;
import java.util.ArrayList;

public class Pilot extends Employee{
    /**
     * Holds flights that pilot work on
     */
    private ArrayList<Flight> flights;

    /**
     * Create a Pilot object
     * @param name will be set
     * @param surname will be set
     * @param ID will be set
     * @param password will be set
     */
    public Pilot(String name, String surname, int ID, String password) {
        super(name, surname, ID, password);
        this.flights = new ArrayList<Flight>();
    }

    public Pilot() {
        super();
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }

    /**
     * If pilot has authority to change flight's that has given flightID plane status
     * @param flightID will be searched
     * @throws NullPointerException if given parameter is null
     */
    public void setReadinessOfPlane(String flightID){

    }

    /**
     * Adds given flight to pilot's flights
     * @param addFlight will be added
     * @return true if it is added successfully
     */
    public boolean addFlight(Flight addFlight){
       return flights.add(addFlight);
    }

    /**
     * Removes given flight to pilot's flights
     * @param removeFlight will be removed
     * @return true if it is removed successfully
     */
    public boolean removeFlight(Flight removeFlight){
        return flights.remove(removeFlight);
    }

    /**
     * Returns Pilot's flights as StringBuilder
     * @return Pilot's flights as StringBuilder
     */
    public StringBuilder displayShift(){
        return new StringBuilder();
    }

}
