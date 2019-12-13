package it.ats.exercise.model;

public class geoLocation {

	
	private String lat;
	private String lng;
	
	
	
	public geoLocation(String lat, String lng) {
		super();
		this.lat = lat;
		this.lng = lng;
	}

	public String getLat() {
		return lat;
	}
	
	public void setLat(String lat) {
		this.lat = lat;
	}
	
	public String getLng() {
		return lng;
	}
	
	public void setLng(String lng) {
		this.lng = lng;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "geoLocation{" +
        "lat=" + lat +
        ", lng='" + lng + '\'' +
        '}';
	}
	
	
	
	
}
