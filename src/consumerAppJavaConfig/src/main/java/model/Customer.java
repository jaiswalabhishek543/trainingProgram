package model;

/*
 * @abhi
 */
public class Customer {

	private String customerId;
	private String customerName;
	private String customerAddress;
	private String paymentMode;

	/*
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", paymentMode=" + paymentMode + "]";
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(final String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(final String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(final String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(final String paymentMode) {
		this.paymentMode = paymentMode;
	}

}
