package ch09;

public abstract class NoteBook extends Computer {

	// 여러 추상 메서드 중에서 일부만 구현 시 해당 클래스는 abstract가 되어야한다.
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("NoteBook display");
	}

}
