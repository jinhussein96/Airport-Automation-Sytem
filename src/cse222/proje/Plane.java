package cse222.proje;

import java.util.Objects;

public class Plane {
	private String planeID;
	private StateOfPlane stateOfPlane;

    public Plane() {

    }

    public enum StateOfPlane{
		ReadyToFly, Flying, Landed  ;
	}
	public Plane(String planeID) {
		this.planeID = planeID;
	}

	public void setReadinessOfPlane(StateOfPlane stateOfPlane) {
		this.stateOfPlane = stateOfPlane;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Plane)) return false;
		Plane plane = (Plane) o;
		return Objects.equals(planeID, plane.planeID);
	}

}
