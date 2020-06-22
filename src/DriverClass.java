import cse222.proje.*;

public class DriverClass {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Hostess h = new Hostess("km", "kl", 125, "sdfsdfsd");
		Pilot p = new Pilot("psdf", "klsdf", 596, "sd1f8s1");
		
		Flight f = new Flight(4451, new Plane("TK-15651"), p, h, new Date(15, 3, 2021, 15.40) );
		
		System.out.printf("%s", f.toString());
		System.out.printf(" %s", h.getFlights());
		

	}

}
