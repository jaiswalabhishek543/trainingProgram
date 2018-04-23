package bankingsystem;
/*
 * @abhi
 * 
 */
public class Address{
/*
 * Creating Address class for initializing address
 * 
 */
	private String street;
	private String houseNumber;
	private String zopCode;
	private String city;
	
	public Address(String str1,String str2,String str3,String str4)
	{   
		street=str1;
		houseNumber=str2;
		zopCode=str3;
		city=str4;
	}
	
	

	@Override
	public String toString() {
		return "Address [street=" + street + ", houseNumber=" + houseNumber + ", zopCode=" + zopCode + ", city=" + city
				+ "]";
	}



	public String getStreet() {
		return street;
	}

	

	public String getHouseNumber() {
		return houseNumber;
	}

	

	public String getZopCode() {
		return zopCode;
	}

	

	public String getCity() {
		return city;
	}

	
	
	
	
	
	
	
	
	
	
}
