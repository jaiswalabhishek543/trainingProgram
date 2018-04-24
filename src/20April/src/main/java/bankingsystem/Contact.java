package bankingsystem;
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
	private Integer mobileNumber;
	private String email;
    Address addr;
    
    public Contact(Integer phone,Integer mobile,String email1,Address addr1)
    {
    	phoneNumber=phone;
    	mobileNumber=mobile;
    	email=email1;
    	addr=addr1;
    	
    }
    
    
    

	@Override
	public String toString() {
		return "Contact [phoneNumber=" + phoneNumber + ", mobileNumber=" + mobileNumber + ", email=" + email + ", addr="
				+ addr + "]";
	}




	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	

	public Integer getMobileNumber() {
		return mobileNumber;
	}

	

	public String getEmail() {
		return email;
	}

	
	public static boolean addContact(Object obj)
	{
		
		if (obj == null)
		{
			return false;
		} 
		else 
		{
			return true;
		}
	}
	
		

}
