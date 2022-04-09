package ch04;

public class VIPCustomer extends Customer {

	double salesRatio;
	private String agentID;

	/*
	 * public VIPCustomer() {
	 * 
	 * //super(); : 기본 constructor를 불러오는 키워드임.
	 * 
	 * bonusRatio = 0.05; salesRatio = 0.1; customerGrade = "VIP";
	 * 
	 * System.out.println("VIPCustomer() call");
	 * 
	 * }
	 */

	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);

		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}

	public String getAgentID() {
		return agentID;
	}

	public double salesRatio() {
		return salesRatio;
	}

	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint += price * bonusRatio;
		price -= (int) (price * salesRatio);
		return price;
	}

}
