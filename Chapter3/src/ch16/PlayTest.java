package ch16;

public class PlayTest {

	public static void main(String[] args) {

		Player playerLee = new Player();
		playerLee.play(1);

		playerLee.upgradeLevel(new AdvancedLevel());
		playerLee.play(2);

		playerLee.upgradeLevel(new SuperLevel());
		playerLee.play(3);
	}

}
