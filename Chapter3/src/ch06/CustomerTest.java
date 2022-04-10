package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10030, "이재희");
		Customer customerKim = new VIPCustomer(10040, "김재희");
		Customer customerJeong = new GoldCustomer(10050, "정재희");
		Customer customerJo = new GoldCustomer(10060, "조재희");

		ArrayList<Customer> customerList = new ArrayList<>();

		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerJeong);
		customerList.add(customerJo);

//		customerList.forEach(customer -> {
//			customer.calcPrice(1000000);
//			System.out.println(customer.showCustomerInfo());
//		});

		// customerJeong의 클래스가 원래 GoldCustomer 클래스였는 지 확인.
		if (customerJeong instanceof GoldCustomer) {
			GoldCustomer vc = (GoldCustomer) customerJeong;
			System.out.println(vc.showCustomerInfo());
		}
	}

}
