package model;

/*
 * @abhi
 */
public class Supplier {

	private String supplierId;
	private String supplierName;
	private String supplierAddress;
	private int quantityOrder;
	private String orderId;
	private Integer amount;

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(final Integer amount) {
		this.amount = amount;
	}

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(final String supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(final String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierAddress() {
		return supplierAddress;
	}

	public void setSupplierAddress(final String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}

	public int getQuantityOrder() {
		return quantityOrder;
	}

	public void setQuantityOrder(final int quantityOrder) {
		this.quantityOrder = quantityOrder;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(final String orderId) {
		this.orderId = orderId;
	}

	/*
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", supplierName=" + supplierName + ", supplierAddress="
				+ supplierAddress + ", quantityOrder=" + quantityOrder + ", orderId=" + orderId + ", amount=" + amount
				+ "]";
	}

}
