package cse222.proje;

import java.util.Objects;

public class Flight {
    /**
     * Holds flightID
     */
    private int flightID;
    /**
     * Holds plane of the flight
     */
    private Plane plane;
    /**
     * Holds pilot of the flight
     */
    private Pilot pilot;
    /**
     * Holds hostess of the flight
     */
    private Hostess hostess;
    /**
     * Holds date information of flight
     */
    private Date flightDate;

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

        this.pilot.addFlight(this);
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
	

	/**
     * Returns a flights data as a StringBuilder
     * @return a flights data as a StringBuilder
     */
    public StringBuilder displayFlight(){
        return new StringBuilder();
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
    	
    	return "\n Flight ID: " + flightID + "\n Flight Date: " + flightDate + "\n Plane: " + plane
    			+ "\n  Pilot: " + pilot + "\n Hostess: " + hostess + "\n";
    }

}
