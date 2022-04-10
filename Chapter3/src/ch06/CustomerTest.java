package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10030, "������");
		Customer customerKim = new VIPCustomer(10040, "������");
		Customer customerJeong = new GoldCustomer(10050, "������");
		Customer customerJo = new GoldCustomer(10060, "������");

		ArrayList<Customer> customerList = new ArrayList<>();

		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerJeong);
		customerList.add(customerJo);

		customerList.forEach(customer -> {
			customer.calcPrice(1000000);
			System.out.println(customer.showCustomerInfo());
		});

	}

}
