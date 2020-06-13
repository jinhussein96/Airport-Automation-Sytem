package cse222.proje;

public interface Loginable {

	/**
	 * It's aim to check given ID and password is match the object's ID and password
	 * @param ID will be checked
	 * @param password will be checked
	 * @return true if matchs, otherwise false
	 * @throws NullPointerException if one of the given parameter is null
	 */
	public abstract boolean checkLogin(int ID, String password);
}
