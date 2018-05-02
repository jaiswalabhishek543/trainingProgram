package dao;

/*
 * @abhi
 */
public interface CustomerDao {
	// Methods to be implemented
	public String addCustomer(String cId, String cName, String cAddress, String payMode);

	public String removeCustomer(String cId);

	public String updateCustomer(String cId);

}
