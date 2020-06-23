package cse222.proje;

public class SecurityPersonel extends Employee implements Comparable<Employee>{

    public SecurityPersonel(String name, String surname, int ID, String password) {
        super(name, surname, ID, password);
    }

    /**
     * Update given sector's securityState
     * @param sector will be updated
     * @return if updated successfully returns true
     * @throws NullPointerException if one of given parameters is null
     */
    public boolean updateSector(Sector sector)throws Exception{

        if (sector.equals(null))
            throw new NullPointerException("Sector can not be null!");

        else {

            if (sector.getSecurityState() == Sector.SecurityStates.SECURE)
                return sector.updateSecurityState(Sector.SecurityStates.INSECURE);

            else
                return sector.updateSecurityState(Sector.SecurityStates.SECURE);
        }
    }

    /**
     * Display given sector's data
     * @param sector will be displayed
     * @throws NullPointerException if given parameter is null
     */
    public void displaySector(Sector sector){
        System.out.printf("\n Sector %s security status : %s", sector.getSectorID(), sector.getSecurityState());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "SecurityPersonel{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
