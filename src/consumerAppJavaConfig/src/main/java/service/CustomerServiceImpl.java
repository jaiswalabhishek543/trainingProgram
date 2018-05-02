package service;

import dao.CustomerDaoImpl;

/*
 * @abhi
 */
public class CustomerServiceImpl implements CustomerServiceInterface {

	private CustomerDaoImpl customer01;

	public void setCustomer01(final CustomerDaoImpl customer01) {
		this.customer01 = customer01;
	}

	/*
	 * @see service.CustomerServiceInterface#addCustomer(java.lang.String,
	 * java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public String addCustomer(final String cId, final String cName, final String cAddress, final String payMode) {

		return customer01.addCustomer(cId, cName, cAddress, payMode);
	}

	/*
	 * @see service.CustomerServiceInterface#removeCustomer(java.lang.String)
	 */
	@Override
	public String removeCustomer(final String cId) {

		return customer01.removeCustomer(cId);
	}

	/*
	 * @see service.CustomerServiceInterface#updateCustomer(java.lang.String)
	 */
	@Override
	public String updateCustomer(final String cId) {

		return customer01.updateCustomer(cId);
	}

}
