package oops.compositionEncap;

public class Address {
	private String hno;
	private String streetName;
	private String city;
	private String state;
	private String country;
	private String pin;

	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public void print() {
		System.out.println(city);
		System.out.println(country);
		System.out.println(hno);
		System.out.println(pin);
		System.out.println(state);
		System.out.println(streetName);
	}
}
