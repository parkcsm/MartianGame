package FifthWeek;

public class ��Ұ�����ġ��ȭ extends ������Ӻ�ȭ implements Runnable {

	public void run() {

		while(true) {

	
			try {
				Thread.sleep(2000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			if(�ð�.�Ͻ�����==true) {
				break;
			}
			
			
			if(ü�����ϻ��.ü�����Ͽ���==true || ��Ұ�����ġ������.��Ұ�����ġ���忣��==true || ����������.��������������==true) {break;} //������ ����
			
			if(Math.random()<=���̵��׷���.��Ұ�����ġ����Ȯ��) {
				ȭ��Ž�����.��Ұ�����ġ���������--;
				System.out.println("ȭ���� �𷡸����� �������� ��Ұ�����ġ�� -1 �ջ�Ǿ����ϴ�." + "��Ұ�����ġ��������� : " + ȭ��Ž�����.��Ұ�����ġ���������);
			}
		

		}



	}



}
