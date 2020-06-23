package cse222.proje;

import java.util.Objects;

public class Plane implements Comparable {

    public enum StateOfPlane{
        ReadyToFly, Flying, Landed  ;
    }
    /**
     * a field to hold the plane id*/
    private int  planeID;
    /**
     * a field to hold the state of the plane*/
    private StateOfPlane stateOfPlane;
    /**an empty constructor**/
    public Plane() {
    }


    public Plane(int planeID) {
        this.planeID = planeID;
        stateOfPlane = StateOfPlane.ReadyToFly;
    }

    public void setReadinessOfPlane(StateOfPlane stateOfPlane) {
        if(stateOfPlane != null)
        this.stateOfPlane = stateOfPlane;
        else
            throw new NullPointerException();
    }
    /**returns the plane id
     * @return returns the plane id**/
    public int get_id(){
        return  planeID;
    }
    /**
     * returns the state of the plane
     * @return returns the state of the plane
     * */
    public StateOfPlane get_stateOfPlane(){
        return stateOfPlane;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plane)) return false;
        Plane plane = (Plane) o;
        return Objects.equals(planeID, plane.planeID);
    }
    /**tostring method which returns a string contains the planes id and its state
     * @return Returns a string representation of the object.*/
    @Override
    public String toString() {
        return "PLaneId = " + planeID + "  stateOfPlane = " + stateOfPlane +"\n";
    }
    /**Compares this object with the specified object for order.
     * ıt returns 0 ıf the objects are equal , 1 if this planes id is larger and -1 if the specified objects id is larger
     * @param o the object to be compared with
     * @return  ıt returns 0 ıf the objects are equal , 1 if this planes id is larger and -1 if the specified objects id is larger
     * */
    @Override
    public int compareTo(Object o) throws NullPointerException{
        if (o == null)
            throw new NullPointerException();
        if (this == o) return 0;
        if (!(o instanceof Plane)) return -2;
        Plane plane = (Plane) o;
        if((planeID >  plane.planeID))
            return 1;
        return -1;
    }
}
