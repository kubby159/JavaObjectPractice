package ch09;

public class Desktop extends Computer {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Desktop display");
	}

	@Override
	public void typing() {
		// TODO Auto-generated method stub
		System.out.println("Desktop typing");

	}

	// ���� Ŭ������ �޼��带 �����ǵ� �����ϴ�.
	@Override
	public void turnOff() {
		System.out.println("Desktop �� �������ϴ�. ");
	}

}
