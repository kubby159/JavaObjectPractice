package ch15;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();

		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();

		// 업캐스팅(묵시적)
		Buy buyer = customer;
		buyer.buy();
		buyer.order();

		Sell seller = customer;
		seller.sell();
		seller.order();

	}

}
