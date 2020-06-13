package cse222.proje;

public abstract class Person {
	/**
	 * Holds Person's name
	 */
	protected String name;
	/**
	 * Holds Person's surname
	 */
	protected String surname;

	/**
	 * Create a Person object
	 * @param name will be set
	 * @param surname will be set
	 */
	public Person(String name, String surname){
		this.name = name;
		this.surname = surname;
	}

    public Person() {

    }

    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}

}
