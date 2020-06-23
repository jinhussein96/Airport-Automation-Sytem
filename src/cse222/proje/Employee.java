package cse222.proje;

public class Employee extends Person implements Loginable, Comparable<Employee>{
	/**
	 * Holds Employee's ID
	 */
	 int ID;
	/**
	 * Holds Employee's password
	 */
	 String password;

	/**
	 * Create an Employee object
	 * @param name will be set
	 * @param surname will be set
	 * @param ID will be set
	 * @param password will be set
	 */
	public Employee(String name, String surname, int ID, String password) {
		super(name,surname);
		this.ID = ID;
		this.password = password;
	}

	@Override
	public int compareTo(Employee employee) {
		return ID- employee.ID;
	}

	/**
	 * Returns true if given ID and password is match correctly, otherwise returns false
	 * @param ID will be checked
	 * @param password will be checked
	 * @return true if given ID and password is match correctly, otherwise returns false
	 * @throws NullPointerException if one of the given parameter is null
	 */
	public boolean checkLogin(int ID, String password) {
		return this.ID == ID && this.password.equals(password);
	}

	/**
	 * Returns true if given object's ID and password is match correctly, otherwise returns false
	 * @param o will be checked
	 * @return true if given object's ID and password is match correctly, otherwise returns false
	 */
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Employee)) return false;
		Employee employee = (Employee) o;
		return this.ID == ((Employee) o).ID &&
				password.equals(employee.password);
	}

	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", password=" + password + ", name=" + name + ", surname=" + surname + "]";
	}

}
