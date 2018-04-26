package model;

/*
 * @abhi
 * 
 */
public class Contact {
	/*
	 *Initializing contact details
	 * 
	 */
	
	
	private Integer phoneNumber;
	private int mobileNumber;
	private String email;
	Address addr;
	
	
	
	
	public Contact(Integer phoneNumber, int mobileNumber, String email, Address addr) {
		super();
		this.phoneNumber = phoneNumber;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.addr = addr;
	}
	
	public Integer getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "Contact [phoneNumber=" + phoneNumber + ", mobileNumber=" + mobileNumber + ", email=" + email + ", addr="
				+ addr + "]";
	}
	
	



}
