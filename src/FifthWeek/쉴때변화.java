package FifthWeek;

public class ������ȭ extends ���ų����߶���ȭ implements Runnable{
	static boolean �������=false;
	public void run() {
		while(true) {		
				try {
					Thread.sleep(2500);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				
				if(�������==true) {break;} // �����尭������
				if(ü�����ϻ��.ü�����Ͽ���==true || ��Ұ�����ġ������.��Ұ�����ġ���忣��==true || ����������.��������������==true) {break;} //��ü ���������
				if(Math.random()<=���̵��׷���.���µ����̵���Ȯ��) {
					������.ü��++; ������.���ߵ� +=3;	
					if(������.ü��>=100) {
						������.ü�� = 100;
					}
					if(������.���ߵ�>=100) {
						������.���ߵ�=100;
					}
					System.out.println("���µ��� ���� ��������� ���� ȸ���˴ϴ�. ü��+1 ����ü�� : " + ������.ü�� + " ���ߵ�+2 �������ߵ� : " + ������.���ߵ�);
					
					if(������.ü��>=100) {
						System.out.println("ü���� ������ ȸ���Ǿ����ϴ�. ����� �����ϴ�.");
					}
					if(������.���ߵ�>=100) {
						System.out.println("���ߵ��� ������ ȸ���Ǿ����ϴ�. ������ �����ϴ�.");
					}
				}

			
			
		}
	}
}
