package FifthWeek;

public class �����Ƕ���ȭ  extends �԰ų����Ƕ���ȭ implements Runnable {


	public void run() {
		if(������.����������<=0) {
			System.out.println("���̾����ϴ�.");
		} else {
		������.����������--;
		if(������.����������<0) {
			������.����������=0;
		}
		System.out.println("���糲����(L)-1L" + " ���糲����(L) : " + ������.����������);
		
		for(int i=1;i<4;i++) {
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			������.ü������ += 5;
			if(������.ü������>=100) {
				������.ü������=100;
				System.out.println("���� ����� ���� ���̻� ���� ������ �ʾƵ� �� �Ͱ����ϴ�.");
			}
			System.out.println("���� ���� ������ �����ؼҵ˴ϴ�. ü������+5  ����ü������ :" + ������.ü������);
		}
		
	}
	}

}
