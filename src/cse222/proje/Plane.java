package cse222.proje;

import java.util.Objects;

public class Plane {
	private int planeID;
	private StateOfPlane stateOfPlane;

    public Plane() {

    }

    public enum StateOfPlane{
		ReadyToFly, Flying, Landed  ;
	}
	public Plane(int planeID) {
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

	public int getPlaneID() {
		return planeID;
	}
}
