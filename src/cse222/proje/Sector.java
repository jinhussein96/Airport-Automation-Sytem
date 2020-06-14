package cse222.proje;

public class Sector {

	private int sectorID;
	private CleanningStates cleanningState;
	private SecurityStates securityState;

    public enum CleanningStates{
		DIRTY, CLEANNING, CLEAN;
	}
	
	public enum SecurityStates{
		SECURE, INSECURE;
	}

	/**
	 * Create a Sector object
	 * @param sectorID will be set
	 * @param CS will be set
	 * @param SS will be set
	 */
	public Sector(int sectorID, CleanningStates CS, SecurityStates SS){
		this.sectorID = sectorID;
		this.cleanningState = CS;
		this.securityState = SS;
	}

	public int getSectorID() {
		return sectorID;
	}

	public void setSectorID(int sectorID) {
		this.sectorID = sectorID;
	}

	public CleanningStates getCleanningState() {
		return cleanningState;
	}

	public void setCleanningState(CleanningStates cleanningState) {
		this.cleanningState = cleanningState;
	}

	public SecurityStates getSecurityState() {
		return securityState;
	}

	public void setSecurityState(SecurityStates securityState) {
		this.securityState = securityState;
	}

	/**
	 * Update cleanningState of sector
	 * @param CS will be set
	 * @return true if it is successfully updated, otherwise false
	 * @throws NullPointerException if given parameter is null
	 */
	public boolean updateCleanningState(CleanningStates CS){

		if (CS.equals(null))
			throw new NullPointerException("State can not be null!");

		else {
			if (CS == cleanningState)
				return false;

			else{
				cleanningState = CS;
				return true;
			}
		}
	}

	/**
	 * Update securityState of sector
	 * @param SS will be set
	 * @return true if it is successfully updated
	 * @throws NullPointerException if given parameter is null
	 */
	public boolean updateSecurityState(SecurityStates SS){

		if (SS.equals(null))
			throw new NullPointerException("State can not be null!");

		else {
			if (SS == securityState)
				return false;

			else{
				securityState = SS;
				return true;
			}
		}
	}
}
