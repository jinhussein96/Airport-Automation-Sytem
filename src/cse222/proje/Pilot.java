package cse222.proje;
import java.util.ArrayList;
import java.util.Scanner;

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
     * @throws IllegalArgumentException if enter wrong input type for enum
     */
    public void setReadinessOfPlane(int flightID){
        for(int i = 0; i < flights.size(); ++i){
            if(flights.get(i).getFlightID() == flightID){
                Scanner scanStatus = new Scanner(System.in);
                Plane.StateOfPlane status = Plane.StateOfPlane.valueOf(scanStatus.next());
                if(status.equals(Plane.StateOfPlane.ReadyToFly) ||
                        status.equals(Plane.StateOfPlane.Flying) ||
                            status.equals(Plane.StateOfPlane.Landed))
                    flights.get(i).getPlane().setReadinessOfPlane(status);
                else
                    throw new IllegalArgumentException();
            }
        }

        throw new NullPointerException();
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
    * Returns Pilot's flights as String
    * @return Pilot's flights as String
    */
    public String getFlights(){
    	String str = new String();
        Iterator<Flight> iter = flights.iterator();

        while (iter.hasNext()){
            Flight temp = iter.next();
            str += "\n Flight ID: " + temp.flightID + "\n Flight " + temp.flightDate + "\n Plane ID: " + temp.plane.planeID + "\n";
        }
        return "\n Pilot Flights \n" + str + "\n";
    }
    
    /**
     * Returns Information about Pilot like name, surname, ID
     * @return Information about Pilot like name, surname, ID
     */
    public String toString() {
    	
    	return "Pilot ID: " + ID + "\n Pilot name: "+name + "\n Pilot surname: "+surname;
    }  

}
