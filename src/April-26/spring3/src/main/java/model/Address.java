package model;

/*
 * @abhi
 * 
 */
public class Address {
/*
* Creating Address class for initializing address
* 
*/

	private String street;
	private String houseNumber;
	private String zopCode;
	private String city;
	
	public Address(String street, String houseNumber, String zopCode, String city) {
		super();
		this.street = street;
		this.houseNumber = houseNumber;
		this.zopCode = zopCode;
		this.city = city;
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getZopCode() {
		return zopCode;
	}
	public void setZopCode(String zopCode) {
		this.zopCode = zopCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", houseNumber=" + houseNumber + ", zopCode=" + zopCode + ", city=" + city
				+ "]";
	}

	
	

}
