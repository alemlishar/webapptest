package it.ats.exercise.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class address {
	
	private String street;
	private String housenumber;
	private String postalcode;
	private String city;
	private String geoLocation;
	
	
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getHousenumber() {
		return housenumber;
	}
	
	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}
	
	public String getPostalcode() {
		return postalcode;
	}
	
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getGeoLocation() {
		return geoLocation;
	}
	
	public void setGeoLocation(String geoLocation) {
		this.geoLocation = geoLocation;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub	
		return "address{" +
                "street='" + street + '\'' +
                "housenumbere='" + housenumber + '\'' +
                "postalcode='" + postalcode + '\'' +
                "city='" + city + '\'' +
                ", geoLocation=" + geoLocation +
                '}';
	} 
}
