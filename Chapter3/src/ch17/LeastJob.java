package ch17;

public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("��Ⱑ ���� ������ ã�� �ֽ��ϴ�.");
	}

	@Override
	public void sendCallToAgent() {

		System.out.println("��Ⱑ ���� ������ ã�Ұ�, �ش� �������� ���� ����߽��ϴ�.");
	}

}
