package ch17;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("우선순위가 높은 고객입니다.");
	}

	@Override
	public void sendCallToAgent() {

		System.out.println("숙련도 높은 상담원에게 해당 고객을 배분했습니다.");
	}

}
