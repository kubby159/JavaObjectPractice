package ch03;

public class CustomerTest {

	public static void main(String[] args) {
//
//		Customer customerLee = new Customer();
//		customerLee.setCustomerName("�̼���");
//		customerLee.setCustomerID(100010);
//		customerLee.bonusPoint = 1000;
//
//		System.out.println(customerLee.showCustomerInfo());

		VIPCustomer customerKim = new VIPCustomer(10010, "�̼���");

		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());

		Customer vc = new VIPCustomer(12345, "noname");
		// Customer �� �͸� ����� �� �ִ�.

	}

}
