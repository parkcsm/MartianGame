package FifthWeek;

public class ����Ҷ���ȭ  extends ���Ҷ���ȭ implements Runnable{

	@Override
	public void run() {
	
		for(int i=1;i<4;i++) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			������.ü�� -= 1; ������.������ -=1; ������.ü������ -=1;
			System.out.println("���� ���� ��ġ���� ü�� -1, ������-1, ü������-1");
		}
		
	}

}
