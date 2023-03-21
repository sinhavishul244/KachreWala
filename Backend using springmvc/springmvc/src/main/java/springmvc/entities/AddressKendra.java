package springmvc.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AddressKendra {
	
	@Column(name="street_name")
	private String streetName;
	
	private String city;
	
	private String state;

	private String pincode;

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
	
	

}
