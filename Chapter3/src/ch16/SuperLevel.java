package ch16;

public class SuperLevel extends PlayerLevel {

	@Override
	void run() {
		System.out.println("엄청 빠르게 달립니다.");
	}

	@Override
	void jump() {
		System.out.println("아주 높이jump합니다.");
	}

	@Override
	void turn() {
		System.out.println("turn 합니다.");
	}

	@Override
	void showLevelMessage() {
		System.out.println("****고급자레벨입니다.******");
	}

}
