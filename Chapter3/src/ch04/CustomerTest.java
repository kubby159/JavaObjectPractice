package ch04;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10010, "�̼���");

		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(500000);

		System.out.println(customerLee.showCustomerInfo() + price);

		VIPCustomer customerKim = new VIPCustomer(10020, "������");
		price = customerKim.calcPrice(1000000);
		System.out.println(customerKim.showCustomerInfo() + price);

		Customer vc = new VIPCustomer(12345, "noname");
		price = vc.calcPrice(1000);
		System.out.println(price);
	}

}
