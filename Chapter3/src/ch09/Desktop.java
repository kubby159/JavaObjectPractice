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

	// 상위 클래스의 메서드를 재정의도 가능하다.
	@Override
	public void turnOff() {
		System.out.println("Desktop 이 켜졌습니다. ");
	}

}
