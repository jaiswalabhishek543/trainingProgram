package service;

import dao.SupplierDaoImpl;

/*
 * @abhi
 */
public class SupplierServiceImpl implements SupplierServiceInterface {

	private SupplierDaoImpl supply01;

	public void setSupply01(final SupplierDaoImpl supply01) {
		this.supply01 = supply01;
	}

	/*
	 * @see service.SupplierServiceInterface#addSupplier(java.lang.String,
	 * java.lang.String, java.lang.String, int, java.lang.String, int)
	 */
	@Override
	public String addSupplier(final String sId, final String sName, final String sAddress, final int qunat,
			final String orderId, final int amount1) {

		return supply01.addSupplier(sId, sName, sAddress, qunat, orderId, amount1);
	}

	/*
	 * @see service.SupplierServiceInterface#removeSupplier(java.lang.String)
	 */
	@Override
	public String removeSupplier(final String sId) {

		return supply01.removeSupplier(sId);
	}

	/*
	 * @see service.SupplierServiceInterface#updateSupplier(java.lang.String)
	 */
	@Override
	public String updateSupplier(final String sId) {

		return supply01.updateSupplier(sId);
	}

}
