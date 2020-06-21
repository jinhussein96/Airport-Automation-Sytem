package cse222.proje;
import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;

public class Hostess extends Employee{
    /**
     * Holds flights that hostess work on
     */
    private ConcurrentSkipListSet<Flight> flights;

    /**
     * Create a Hostess object
     * @param name will be set
     * @param surname will be set
     * @param ID will be set
     * @param password will be set
     */
    public Hostess(String name, String surname, int ID, String password) {
        super(name, surname, ID, password);
        this.flights = new ConcurrentSkipListSet<Flight>();
    }

    public Hostess() {

    }

    /**
     * Returns Hostess's flights as String
     * @return Hostess's flights as String
     */
    public String getFlights(){
    	String str = new String();
        Iterator<Flight> iter = flights.iterator();

        while (iter.hasNext()){
            Flight temp = iter.next();
            str += "\n Flight ID: " + temp.flightID + "\n Flight " + temp.flightDate + "\n Plane ID: " + temp.plane.planeID + "\n";
        }
        return "\n Hostes Flights \n" + str + "\n";
    }

    /**
     * Returns Information about Hostess like name, surname, ID
     * @return Information about Hostess like name, surname, ID
     */
    public String toString() {
    	
    	return "Hostes ID: " + ID + "\n Hostes name: "+name + "\n Hostes surname: "+surname + "\n";
    }
    
}
