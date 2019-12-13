package it.ats.exercise.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class atm {

	private String address;
	private String distance;
	private String type;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "address=" + address +
        "distance=" + distance +
        ", type='" + type + '\'' +
        '}';
	}

}
