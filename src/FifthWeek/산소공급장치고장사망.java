package FifthWeek;

public class ��Ұ�����ġ������  extends ���� implements Runnable{
	
	  static boolean ��Ұ�����ġ���忣��=false;
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
			if(ȭ��Ž�����.��Ұ�����ġ���������<=0) {
				ȭ��Ž�����.��Ұ�����ġ���������=0;
				��Ұ�����ġ���忣�� = true;
				System.out.println("��Ұ�����ġ�� ���������峪�� �����ڰ� ����Ͽ����ϴ�.");
				�ð�.�Ͻ�����=true;
				break;
			}
			
		}
	  }

		
	}