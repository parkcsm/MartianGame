package FifthWeek;

public class ����������  extends ���� implements Runnable {
	  static boolean ��������������=false;
	  public void run() {
		while(true) {
			 try {
				 Thread.sleep(50);
			 } catch(InterruptedException e) {
				 e.printStackTrace();
			 } 
				if(ü�����ϻ��.ü�����Ͽ���==true || ��Ұ�����ġ������.��Ұ�����ġ���忣��==true || ����������.��������������==true) {break;} //��ü ���������

			if(������.�������̿������==0) {
				�������������� = true;
				System.out.println("�ڱ������� �����Ͽ� �����ڰ� �����Ǿ����ϴ�. ���� ������ ���ư� �� �ֽ��ϴ�.��");
				�ð�.�Ͻ�����=true;
			
				break;		
			
			}
			
		}
	  }

		
	}