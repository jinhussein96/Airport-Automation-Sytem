package cse222.proje;

import java.util.ArrayList;
import java.util.LinkedList;

public class Airport {
	

	private LinkedList<Administrator> administrators; // BST
	private LinkedList<Firm> firms; // BST
	private LinkedList<CleanningPersonel> cleanningPersonels; // BST
	private LinkedList<SecurityPersonel> securityPersonels; // BST
	private LinkedList<Sector> cleanSectors; // Queue
	private LinkedList<Sector> dirtySectors;// Queue
	private String airportName;

	public Airport() {

	}

	/**
	 * Creates an Airport object and creates first Administrator of Airport
	 * @param airpotName will be set
	 */
	public Airport(String airpotName){
		this.airportName = airpotName;
		Administrator firstAdmin = new Administrator("murat","yildiz",1801042004, "cse222");
		administrators = new LinkedList<Administrator>();
		administrators.add(firstAdmin);
	}
	
	public class Administrator extends Employee{

		/**
		 * Creates an Administrator of Firm object
		 * @param name will be set
		 * @param surname will be set
		 * @param ID will be set
		 * @param password will be set
		 */
		public Administrator(String name, String surname, int ID, String password) {
			super(name, surname, ID, password);
		}

		public Administrator() {
			super();
		}

		/**
		 * Returns true if successfully add new Administrator, otherwise false
		 * @param admin will be added
		 * @return true if successfully add new Administrator, otherwise false
		 * @throws NullPointerException if given parameter is null
		 */
		public boolean addAdministrator(Administrator admin){
			return true;
		}

		/**
		 * Returns true if successfully add new SecurityPersonel, otherwise false
		 * @param sp will be added
		 * @return true if successfully add new SecurityPersonel, otherwise false
		 * @throws NullPointerException if given parameter is null
		 */
		public boolean addSecurityPersonel(SecurityPersonel sp){
			return true;
		}

		/**
		 * Returns true if successfully add new CleanningPersonel, otherwise false
		 * @param cp will be added
		 * @return true if successfully add new CleanningPersonel, otherwise false
		 * @throws NullPointerException if given parameter is null
		 */
		public boolean addCleanningPersonel(CleanningPersonel cp){
			return true;
		}

		/**
		 * Returns true if successfully add new Sector, otherwise false
		 * @param sector will be added
		 * @return true if successfully add new Sector, otherwise false
		 * @throws NullPointerException if given parameter is null
		 */
		public boolean addSector(Sector sector){
			return true;
		}

		/**
		 * Returns true if successfully add new Firm, otherwise false
		 * @param firm will be added
		 * @return true if successfully add new Firm, otherwise false
		 * @throws NullPointerException if given parameter is null
		 */
		public boolean addFirm(Firm firm){
			return true;
		}

		/**
		 *  Returns true if successfully remove given Administrator, otherwise false, can remove until 1 Administrator last
		 * @param removeAdministrator will be removed
		 * @return true if successfully remove given Administrator, otherwise false
		 * @throws NullPointerException if given parameter is null
		 */
		public Administrator removeSecurityPersonel(Administrator removeAdministrator){
			return new Administrator();
		}

		/**
		 *  Returns true if successfully remove given SecurityPersonel, otherwise false
		 * @param removeSecurityPersonel will be removed
		 * @return true if successfully remove given SecurityPersonel, otherwise false
		 * @throws NullPointerException if given parameter is null
		 */
		public SecurityPersonel removeSecurityPersonel(SecurityPersonel removeSecurityPersonel){
			return new SecurityPersonel();
		}

		/**
		 *  Returns true if successfully remove given CleanningPersonel, otherwise false
		 * @param removeCleanningPersonel will be removed
		 * @return true if successfully remove given CleanningPersonel, otherwise false
		 * @throws NullPointerException if given parameter is null
		 */
		public CleanningPersonel removeCleanningPersonel(CleanningPersonel removeCleanningPersonel){
			return new CleanningPersonel();
		}

		/**
		 *  Returns true if successfully remove given Sector, otherwise false
		 * @param removeSector will be removed
		 * @return true if successfully remove given Sector, otherwise false
		 * @throws NullPointerException if given parameter is null
		 */
		public Sector removeSector(Sector removeSector){
			return new Sector();
		}

		/**
		 *  Returns true if successfully remove given Firm, otherwise false
		 * @param removeFirm will be removed
		 * @return true if successfully remove given Firm, otherwise false
		 * @throws NullPointerException if given parameter is null
		 */
		public Firm removeFirm(Firm removeFirm){
			return new Firm();
		}
		public StringBuilder displayAllFirms(){
			return new StringBuilder();
		}


		public StringBuilder displayDirtySectors(){
			return new StringBuilder();
		}

		public StringBuilder displayCleanSectors(){
			return new StringBuilder();
		}

		public StringBuilder displaySecurityPersonnel(){
			return new StringBuilder();
		}

		public StringBuilder displayCleaningPersonnel(){
			return new StringBuilder();
		}

	}

	/**
	 * Returns Administrator which has given ID and password, if not exist returns null
	 * @param ID will be checked
	 * @param password will be checked
	 * @return Administrator which has given ID and password, if not exist returns null
	 */
	public Administrator findAdministrator(int ID, String password){
		return new Administrator();
	}

	/**
	 * Returns SecurityPersonel which has given ID and password, if not exist returns null
	 * @param ID will be checked
	 * @param password will be checked
	 * @return SecurityPersonel which has given ID and password, if not exist returns null
	 */
	public SecurityPersonel findSecurityPersonel(int ID, String password){
		return new SecurityPersonel();
	}

	/**
	 * Returns CleanningPersonel which has given ID and password, if not exist returns null
	 * @param ID will be checked
	 * @param password will be checked
	 * @return CleanningPersonel which has given ID and password, if not exist returns null
	 */
	public CleanningPersonel findCleanningPersonel(int ID, String password){
		return new CleanningPersonel();
	}

	/**
	 * Returns Sector which has given ID , if not exist returns null
	 * @param ID will be checked
	 * @return Sector which has given ID , if not exist returns null
	 */
	public Sector findSector(int ID){
		return new Sector();
	}

	/**
	 * Returns Firm which has given ID and password, if not exist returns null
	 * @param ID will be checked
	 * @param password will be checked
	 * @return Firm which has given ID and password, if not exist returns null
	 */
	public Firm findFirm(int ID, String password){
		return new Firm();
	}

	/**
	 * Returns flight data which flight has given flight ID
	 * @param flighID will be searched
	 * @return flight data which flight has given flight ID, otherwise null
	 */
	public String getFlightData(int flighID){
		return "";
	}

	public StringBuilder displayAllFirms(){
		return new StringBuilder();
	}


	public StringBuilder displayDirtySectors(){
		return new StringBuilder();
	}

	public StringBuilder displayCleanSectors(){
		return new StringBuilder();
	}

	public boolean updateSectorSecurity(Sector update){

		return true;
	}

	public boolean updateSectorCleaning(Sector update){

		return true;
	}
}
