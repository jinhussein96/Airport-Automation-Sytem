package cse222.proje;

public class Flight implements Comparable<Flight>{
    /**
     * Holds flightID
     */
    int flightID;
    /**
     * Holds plane of the flight
     */
    Plane plane;
    /**
     * Holds pilot of the flight
     */
    Pilot pilot;
    /**
     * Holds hostess of the flight
     */
    Hostess hostess;
    /**
     * Holds date information of flight
     */
    Date flightDate;

    /**
     * Creates a Flight object
     * @param flightID will be set
     * @param plane will be set
     * @param pilot will be set
     * @param hostess will be set
     * @param flightDate will be set
     */
    public Flight(int flightID, Plane plane, Pilot pilot, Hostess hostess, Date flightDate) {
        this.flightID = flightID;
        this.plane = plane;
        this.pilot = pilot;
        this.hostess = hostess;
        this.flightDate = flightDate;
        
        if(pilot != null)
        	this.pilot.addFlight(this);
        if(hostess != null)
        	this.hostess.addFlight(this);
    }

    public Flight() {

    }

    public int getFlightID() {
        return flightID;
    }

    public void setFlightID(int flightID) {
        this.flightID = flightID;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public Hostess getHostess() {
        return hostess;
    }

    public void setHostess(Hostess hostess) {
        this.hostess = hostess;
    }
    
    public Date getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}

    @Override
    public int compareTo(Flight o) {
        return this.flightDate.compareTo(o.flightDate);
    }

    /**
     * Returns true if given flight is same, otherwise returns false
     * @param o will be checked
     * @return Returns true if given flight is same, otherwise returns false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return flightID == flight.flightID;
    }

    /**
     * Returns Flight Information like flight ID, flight date, plane, pilot, hostess
     * @return Flight Information like flight ID, flight date, plane, pilot, hostess
     */
    public String toString() {
    	
    	return "\n Flight ID: " + flightID + "\n Flight " + flightDate + "\n Plane ID: " + plane.planeID
    			+ "\n\n " + pilot + "\n\n " + hostess + "\n";
    }

}
