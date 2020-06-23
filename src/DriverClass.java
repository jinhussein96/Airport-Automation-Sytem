import cse222.proje.*;

import java.io.File;
import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {

		Airport airport = new Airport(new File("information.txt")); // create an Airport object
		int choice;
		boolean exitSystem = false;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.printf("\n !!! Welcome to Airport System !!! \n");
			System.out.printf("\n Proceed as :\n" +
					"\n 1- Airport Personnel " +
					"\n 2- Firm Personnel " +
					"\n 3- Passenger" +
					"\n 4- Exit Airport System\n");

			choice = sc.nextInt();

			switch (choice) {
				case 1:

					break;
				case 2:
					System.out.printf("\n You have chosen to proceed as Firm Personnel: \n");
					System.out.printf("\n Please select the Firm you are working on:\n  ");
					airport.displayAllFirms();

					System.out.printf("\n Please can give the name of Firm : ");
					String firmName = sc.next() ;

					Firm tempFirm = airport.findFirm(firmName);
					if (tempFirm == null)
						System.out.printf("\n The Firm name you entered is not defined in the system \n");
					else{
						System.out.printf("\n You are in the %s Firm, Proceed as :\n" +
								"\n 1- Firm Administrator " +
								"\n 2- Firm Pilot " +
								"\n 3- Firm Hostess", tempFirm.getFirmName());

						int tempChoice = sc.nextInt();

						switch (tempChoice){
							case 1:
								System.out.printf("\n You have chosen to proceed as Firm Administrator: \n");
								System.out.printf("\n Please give your Administrator ID to see your flights: ");
								int tempAdminID = sc.nextInt();
								System.out.printf("\n Please give your Administrator Password to see your flights: ");
								String tempAdminPassword = sc.next();

								Firm.Administrator tempAdmin = tempFirm.findAdmin(tempAdminID, tempAdminPassword);
								if (tempAdmin == null)
									System.out.printf("\n There is no Administrator with ID: %d Password: %s \n", tempAdminID, tempAdminPassword);
								else{
									System.out.printf("\n Select you want to do as Firm Administrator \n" +
											"\n 1- Add Administrator " +
											"\n 2- Remove Administrator " +
											"\n 3- Display Administrators" +
											"\n 4- Add Pilot" +
											"\n 5- Remove Pilot" +
											"\n 6- Display Pilots" +
											"\n 7- Add Hostess" +
											"\n 8- Remove Hostesses" +
											"\n 9- Display Hostesses" +
											"\n 10- Add Plane" +
											"\n 11- Remove Plane" +
											"\n 12- Display Planes" +
											"\n 13- Add Flight" +
											"\n 14- Remove Flight" +
											"\n 15- Display Flights" +
											"\n 16- Display old Flights" +
											"\n 17- Remove old Flights");


									int tempAdminChoice = sc.nextInt();
									int tempID;
									String tempName, tempSurname, tempPassword;
									switch (tempAdminChoice){
										case 1:
											System.out.printf("\n Please give a name to add an Administrator: ");
											tempName = sc.next();
											System.out.printf("\n Please give a surname to add an Administrator: ");
											tempSurname = sc.next();
											System.out.printf("\n Please give a new ID to add an Administrator: ");
											tempID = sc.nextInt();
											System.out.printf("\n Please give a password to add an Administrator: ");
											tempPassword = sc.next();
											tempAdmin.addAdministrator(tempFirm.new Administrator(tempName, tempSurname, tempID, tempPassword));
											break;
										case 2:
											System.out.printf("\n Please give an exist ID to remove an Administrator: ");
											tempID = sc.nextInt();
											tempAdmin.removeAdministrator(tempFirm.new Administrator(null, null, tempID, null ));
											break;
										case 3:
											System.out.printf("\n%s\n", tempAdmin.displayAdministrators());
											break;
										case 4:
											System.out.printf("\n Please give a name to add an Pilot: ");
											tempName = sc.next();
											System.out.printf("\n Please give a surname to add an Pilot: ");
											tempSurname = sc.next();
											System.out.printf("\n Please give a new ID to add an Pilot: ");
											tempID = sc.nextInt();
											System.out.printf("\n Please give a password to add an Pilot: ");
											tempPassword = sc.next();
											tempAdmin.addPilot(new Pilot(tempName, tempSurname, tempID, tempPassword));
											break;
										case 5:
											System.out.printf("\n Please give an exist ID to remove an Pilot: ");
											tempID = sc.nextInt();
											tempAdmin.removePilot(new Pilot(null, null, tempID, null ));
											break;
										case 6:
											System.out.printf("\n%s\n", tempAdmin.displayPilots());
											break;
										case 7:
											System.out.printf("\n Please give a name to add an Hostess: ");
											tempName = sc.next();
											System.out.printf("\n Please give a surname to add an Hostess: ");
											tempSurname = sc.next();
											System.out.printf("\n Please give an new ID to add an Hostess: ");
											tempID = sc.nextInt();
											System.out.printf("\n Please give a password to add an Hostess: ");
											tempPassword = sc.next();
											tempAdmin.addHostess(new Hostess(tempName, tempSurname, tempID, tempPassword));
											break;
										case 8:
											System.out.printf("\n Please give an exist ID to remove an Hostess: ");
											tempID = sc.nextInt();
											tempAdmin.removeHostess(new Hostess(null, null, tempID, null ));
											break;
										case 9:
											System.out.printf("\n%s\n", tempAdmin.displayHostesses());
											break;
										case 10:
											System.out.printf("\n Please give an ID to add an Plane: ");
											tempID = sc.nextInt();
											tempAdmin.addPlane(new Plane(tempID));
											break;
										case 11:
											System.out.printf("\n Please give an exist ID to remove an Plane: ");
											tempID = sc.nextInt();
											tempAdmin.removePlane(new Plane(tempID));
											break;
										case 12:
											System.out.printf("\n%s\n", tempAdmin.displayPlanes());
											break;
										case 13:
											System.out.printf("\n Please give a new ID to add an Flight: ");
											tempID = sc.nextInt();
											System.out.printf("\n Please give a exist Pilot ID to adjust Flight's Pilot: ");
											int tempPilotID = sc.nextInt();
											System.out.printf("\n Please give a exist Hostess ID to adjust Flight's Hostess: ");
											int tempHostessID = sc.nextInt();
											System.out.printf("\n Please give a exist Plane ID to adjust Flight's Plane: ");
											int tempPlaneID = sc.nextInt();

											System.out.printf("\n Please give Flight Date to adjust Flight's Date: \n");
											System.out.printf("\n Year: ");
											int tempYear = sc.nextInt();
											System.out.printf("\n Month: ");
											int tempMonth = sc.nextInt();
											System.out.printf("\n Day: ");
											int tempDay = sc.nextInt();
											System.out.printf("\n Time: ");
											int tempTime = sc.nextInt();

											Pilot tempPilot = tempAdmin.findPilot(tempPilotID);
											Hostess tempHostess = tempAdmin.findHostess(tempHostessID);
											Plane tempPlane = tempAdmin.findPlane(tempPlaneID);
											Date tempDate = new Date(tempYear, tempMonth, tempDay, tempTime);

											tempAdmin.addFlight(new Flight(tempID, tempPlane, tempPilot, tempHostess, tempDate ));

											break;
										case 14:
											System.out.printf("\n Please give an exist ID to remove an Flight: ");
											tempID = sc.nextInt();
											tempAdmin.removeFlight(new Flight(tempID, null, null, null, null));
											break;
										case 15:
											System.out.printf("\n%s\n", tempAdmin.displayFlights());
											break;
										case 16:
											System.out.printf("\n%s\n", tempAdmin.displayOldFlights());
											break;
										case 17:
											System.out.printf("\n Please give a Flight Date to remove previous Flights from that date: \n");
											System.out.printf("\n Year: ");
											tempYear = sc.nextInt();
											System.out.printf("\n Month: ");
											tempMonth = sc.nextInt();
											System.out.printf("\n Day: ");
											tempDay = sc.nextInt();
											System.out.printf("\n Time: ");
											tempTime = sc.nextInt();

											tempDate = new Date(tempYear, tempMonth, tempDay, tempTime);
											tempAdmin.removeOldFlights(tempDate);
											break;

										default:
											System.out.printf("\n You entered an invalid input \n");
									}

								}
								break;
							case 2:
								System.out.printf("\n You have chosen to proceed as Firm Pilot: \n");
								System.out.printf("\n Please give your Pilot ID to see your flights: ");
								int tempPilotID = sc.nextInt();
								System.out.printf("\n Please give your Pilot Password to see your flights: ");
								String tempPilotPassword = sc.next();

								Pilot tempPilot = tempFirm.findPilot(tempPilotID, tempPilotPassword);
								if (tempPilot == null)
									System.out.printf("\n There is no Pilot with ID: %d Password: %s \n", tempPilotID, tempPilotPassword);
								else{
									System.out.printf("\n Select you want to do as Firm Pilot \n" +
											"\n 1- Display my flights " +
											"\n 2- Change a plane status ");

									int tempPilotChoice = sc.nextInt();
									switch (tempPilotChoice){
										case 1:
											System.out.printf("\n%s\n", tempPilot.getFlights());
											break;
										case 2:
											System.out.printf("\n%s\n", tempPilot.getFlights());
											System.out.printf("\n Please give the Flight ID you want to change its plane status: ");
											int tempPlaneID = sc.nextInt();
											tempPilot.setReadinessOfPlane(tempPlaneID);
											break;
										default:
											System.out.printf("\n You entered an invalid input \n");
									}

								}
								break;
							case 3:
								System.out.printf("\n You have chosen to proceed as Firm Hostess: \n");
								System.out.printf("\n Please give your Hostess ID to see your flights: ");
								int tempHostessID = sc.nextInt();
								System.out.printf("\n Please give your Hostess Password to see your flights: ");
								String tempHostessPassword = sc.next();

								Hostess tempHostess = tempFirm.findHostess(tempHostessID, tempHostessPassword);
								if (tempHostess == null)
									System.out.printf("\n There is no Hostess with ID: %d Password: %s \n", tempHostessID, tempHostessPassword);
								else
									System.out.printf("\n%s\n", tempHostess.getFlights());
								break;
							default:
								System.out.printf("\n You entered an invalid input \n");
						}

					}


					break;
				case 3:
					System.out.printf("\n You have chosen to proceed as Passenger: \n");
					System.out.printf("\n Please give a flight ID to display information:  ");

					int flightID = sc.nextInt();
					System.out.printf("\n Flight data: \n %s", airport.getFlightData(flightID));
					break;
				case 4:
					exitSystem = true;
					break;
				default:
					System.out.printf("\n You entered an invalid input \n");

			}
		}while (exitSystem);

	}

}
