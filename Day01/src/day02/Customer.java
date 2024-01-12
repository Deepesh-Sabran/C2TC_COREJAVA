package day02;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerCity;
	
	// getters & setters used to update private data members
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
		
	// default constructor
	public Customer() {
		System.out.println("This is default constructor");
	}
	
	// changed into toString
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerCity="
				+ customerCity + "]";
	}
	
	// parameterized constructor
	public Customer(int customerId, String customerName, String customerCity) {
		System.out.println("This is a parameterized constructor");
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerCity = customerCity;
	}
}

