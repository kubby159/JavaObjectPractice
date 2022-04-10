package ch17;

public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("대기가 적은 상담원을 찾고 있습니다.");
	}

	@Override
	public void sendCallToAgent() {

		System.out.println("대기가 적은 상담원을 찾았고, 해당 상담원에게 고객을 배분했습니다.");
	}

}
