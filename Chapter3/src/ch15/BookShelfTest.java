package ch15;

public class BookShelfTest {

	public static void main(String[] args) {

		Queue bookQueue = new BookShelf();

		bookQueue.enQueue("����1");
		bookQueue.enQueue("����2");
		bookQueue.enQueue("����3");
		bookQueue.enQueue("����4");
		bookQueue.enQueue("����5");

		int size = bookQueue.getSize();
		System.out.println(size);
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
	}

}
