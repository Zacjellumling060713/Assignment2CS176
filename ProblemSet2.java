package edu.monmouth.problemSet2;

//Importing the CampusVehicle class
import edu.monmouth.campusvehicle.CampusVehicle;

public class ProblemSet2 {

	public static void main(String[] args) {

		//Creating a new object using the default constructor, point 8b
		CampusVehicle vehicle1 = new CampusVehicle();
		
		// Retrieving and printing all the attributes, point 8c
		System.out.println("Vehicle 1:");
		System.out.println("ID: " + vehicle1.getId());
		System.out.println("Location: " + vehicle1.getLocation());
		System.out.println("Vehicle is available: " + vehicle1.isAvailable());
		System.out.println();
		
		// Setting the object's attributes to valid values, 8d
		vehicle1.setId("MU10101");
		vehicle1.setLocation("LIBRARY");
		vehicle1.setAvailable(false);
		
		// Retrieving and printing all the attributes, point 8e
		System.out.println("Updated Vehicle 1:");
		System.out.println("ID: " + vehicle1.getId());
		System.out.println("Location: " + vehicle1.getLocation());
		System.out.println("Vehicle is available: " + vehicle1.isAvailable());
		System.out.println();
		
		// Using the checkout() method and the returnVehicle() method and printing the result, point 8f
		vehicle1.returnVehicle();
		System.out.println("Vehicle 1 after return");
		System.out.println("Available: "+ vehicle1.isAvailable());
		System.out.println();
		vehicle1.checkOut();
		System.out.println("Vehicle 1 after checkout");
		System.out.println("Available: " + vehicle1.isAvailable());
		System.out.println();
		
		// Creating vehicle 2 using the constructor, point 8g
		CampusVehicle vehicle2 = new CampusVehicle("MU9999", "Laurel Hall", false);
		
		// Retrieving and printing out its values, point 8h
		System.out.println("Vehicle 2:");
		System.out.println("ID: " + vehicle2.getId());
		System.out.println("Location: " + vehicle2.getLocation());
		System.out.println("Vehicle is available: " + vehicle2.isAvailable());
		System.out.println();
		
		// Using the mutator methods to change vehicle2's values, point 8i
		vehicle2.setId("MU1090");
		vehicle2.setLocation("library");
		vehicle2.setAvailable(true);
		
		// Retrieving and printing its updated values, point 8j
		System.out.println("Updated Vehicle 2:");
		System.out.println("ID: " + vehicle2.getId());
		System.out.println("Location: " + vehicle2.getLocation());
		System.out.println("Vehicle is available: " + vehicle2.isAvailable());
		System.out.println();
		
		// Using the checkout() method and the returnVehicle() method and printing the result, point 8k
		vehicle2.checkOut();
		System.out.println("Vehicle 2 after checkout");
		System.out.println("Available: " + vehicle2.isAvailable());
		System.out.println();
		vehicle2.returnVehicle();
		System.out.println("Vehicle 2 after return");
		System.out.println("Available: "+ vehicle2.isAvailable());
		System.out.println();
		
		// Creating vehicles with invalid values and testing some of the methods, point 8l
		// Vehicle 3 has an invalid location and id
		CampusVehicle vehicle3 = new CampusVehicle("FL1999", "Bookstore", false);
		System.out.println("Vehicle 3:");
		System.out.println("ID: " + vehicle3.getId());
		System.out.println("Location: " + vehicle3.getLocation());
		System.out.println("Vehicle is available: " + vehicle3.isAvailable());
		System.out.println();
		vehicle3.checkOut();
		System.out.println("Vehicle 3 after checkout");
		System.out.println("Available: " + vehicle3.isAvailable());
		System.out.println();
		vehicle3.returnVehicle();
		System.out.println("Vehicle 3 after return");
		System.out.println("Available: "+ vehicle3.isAvailable());
		System.out.println();
		
		// Vehicle 4 has a too long id and an invalid location
		CampusVehicle vehicle4 = new CampusVehicle("AZ9999999999999", "Pentagon", true);
		System.out.println("Vehicle 4:");
		System.out.println("ID: " + vehicle4.getId());
		System.out.println("Location: " + vehicle4.getLocation());
		System.out.println("Vehicle is available: " + vehicle4.isAvailable());
		System.out.println();
		vehicle4.checkOut();
		System.out.println("Vehicle 4 after checkout");
		System.out.println("Available: " + vehicle4.isAvailable());
		System.out.println();
		vehicle4.returnVehicle();
		System.out.println("Vehicle 4 after return");
		System.out.println("Available: "+ vehicle4.isAvailable());
		System.out.println();
		
		// Vehicle 5 has null for id and an emptystring for location
		CampusVehicle vehicle5 = new CampusVehicle(null, "", true);
		System.out.println("Vehicle 5:");
		System.out.println("ID: " + vehicle5.getId());
		System.out.println("Location: " + vehicle5.getLocation());
		System.out.println("Vehicle is available: " + vehicle5.isAvailable());
		System.out.println();
		vehicle5.checkOut();
		System.out.println("Vehicle 5 after checkout");
		System.out.println("Available: " + vehicle5.isAvailable());
		System.out.println();
		vehicle5.returnVehicle();
		System.out.println("Vehicle 5 after return");
		System.out.println("Available: "+ vehicle5.isAvailable());
		System.out.println();


	}

}
