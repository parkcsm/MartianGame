package FifthWeek;

public class �������̿������ extends ���� implements Runnable{

	public void run() {
		while(true) {

			try {
				Thread.sleep(3000);
			} catch(InterruptedException e) {

				e.printStackTrace();
			} 
			
			if(�ð�.�Ͻ�����==true) {
				break;
			}
			

			if(ü�����ϻ��.ü�����Ͽ���==true || ��Ұ�����ġ������.��Ұ�����ġ���忣��==true || ����������.��������������==true) {
				break;
			}

			if(������.��ű�����Ȱ��ȭ==true) {

				if(Math.random()<���̵��׷���.�����������Ȯ��) {
					������.�������̿������++;
				}else{
					������.�������̿������--;
				}
				
				
				
				if(��ű�⺯ȭ.��������ġȮ��==true) {
					System.out.println("�������� ������ ������ǳ�� �۽��� �� �ֽ��ϴ�. ���� �������� ���� ���� ����ؼ� ���մϴ�." + "���� �������̿������ : " + ������.�������̿������ +"�� ���ҽ��ϴ�.");
				} 

				
				
				if(ü�����ϻ��.ü�����Ͽ���==true || ��Ұ�����ġ������.��Ұ�����ġ���忣��==true || ����������.��������������==true) {
					break;
				}

			}
		}

	}

}
