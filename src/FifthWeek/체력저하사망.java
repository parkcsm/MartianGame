package FifthWeek;

public class ü�����ϻ�� extends ���� implements Runnable{
	
  static boolean ü�����Ͽ���;
  public void run() {
	while(true) {
		 try {
			 Thread.sleep(50);
		 } catch(InterruptedException e) {
			 e.printStackTrace();
		 }
		if(ü�����ϻ��.ü�����Ͽ���==true || ��Ұ�����ġ������.��Ұ�����ġ���忣��==true || ����������.��������������==true) {
			break;
		}
		if(������.ü��<=0) {
			ü�����Ͽ��� = true;
			�ð�.�Ͻ�����=true;
			System.out.println("�������� ü���� 0���ϰ� �Ǿ� ����Ͽ����ϴ�.");
			break;
		}
		

	}
  }

	
}
