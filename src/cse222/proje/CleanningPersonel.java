package cse222.proje;

public class CleanningPersonel extends Employee {

	/**
	 * Create a CleanningPersonel object
	 * @param name will be set
	 * @param surname will be set
	 * @param ID will be set
	 * @param password will be set
	 */
	public CleanningPersonel(String name, String surname, int ID, String password) {
		super(name, surname, ID, password);
	}

	/**
	 * Update given sector's cleanningState
	 * @param sector will be updated
	 * @return if updated successfully returns true
	 * @throws NullPointerException if one of given parameters is null
	 */
	public boolean updateSector(Sector sector)throws Exception {

		if (sector.equals(null))
			throw new NullPointerException("Sector can not be null!");

		else

			if (sector.getCleanningState() == Sector.CleanningStates.DIRTY)
				return sector.updateCleanningState(Sector.CleanningStates.CLEANNING);

			else if (sector.getCleanningState() == Sector.CleanningStates.CLEANNING)
				return sector.updateCleanningState(Sector.CleanningStates.CLEAN);

			else
				return sector.updateCleanningState(Sector.CleanningStates.DIRTY);
	}

	/**
	 * Display given sector's data
	 * @param sector will be displayed
	 * @throws NullPointerException if given parameter is null
	 */
	public void displaySector(Sector sector){
		if (sector.equals(null))
			throw new NullPointerException("Sector can not be null!");

		System.out.printf("\n Sector %s cleanning status : %s", sector.getSectorID(), sector.getCleanningState());
	}

}
