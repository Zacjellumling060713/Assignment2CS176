package edu.monmouth.campusvehicle;

public class CampusVehicle {
	private String id;
	private String location;
	private boolean available;
	private final String DEFAULT_ID="UNKNOWN", DEFAULT_LOCATION="UNKNOWN";
	private final boolean DEFAULT_AVAILABLE=true;
	private final int UPPER_ID_LIMIT = 12;
	private final int LOWER_ID_LIMIT = 4;
	
	public CampusVehicle() {
		setId(DEFAULT_ID);
		setLocation(DEFAULT_LOCATION);
		setAvailable(DEFAULT_AVAILABLE);
	}
	public CampusVehicle(String id, String location, boolean available) {
		setId(id);
		setLocation(location);
		setAvailable(available);
	}
	public String getId() {
		return id;
	}
	// Updated setId method based on what is said in point 2
	public void setId(String id) {
		if ((id != null) && (id.equals("") == false) && (id.length()>= LOWER_ID_LIMIT)
				&& (id.length() <= UPPER_ID_LIMIT) && (id.substring(0,2).equals("MU"))) {
		this.id = id;
		}
		else {
			this.id = "UNKNOWN"; // Point number 3
		}
	}
	public String getLocation() {
		return location;
	}
	// Updated setLocation based on what is said in point 4 and point 7
	public void setLocation(String location) {
		if ((location != null) && (location != "") && ((location.toLowerCase().equals( "library"))
				|| (location.toLowerCase().equals( "university bluffs")) ||
				(location.toLowerCase().equals( "parking lot")) || (location.toLowerCase().equals("spruce hall"))
				|| (location.toLowerCase().equals( "laurel hall")))){
			this.location = location.toLowerCase();
				}
		else {
			this.location = "UNKNOWN"; // point 5
		}
		
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	// Updated method based on point 6
	public void checkOut() {
		if (this.available == true){
		available = false;
		}
		
	}
	public void returnVehicle() {
		available = true;
	}

}
