package FifthWeek;

public class ���ڸ�������ȭ extends �԰ų����Ƕ���ȭ implements Runnable{

	@Override
	public void run() {

		if(������.�������ڼ�<=0) {
			System.out.println("���ڰ� �����ϴ�.");
		}else {

			������.�������ڼ�--;
			if(������.�������ڼ�<0) {
				������.�������ڼ�=0;
			}
			System.out.println("���ڼ�-1"+" ���糲�����ڼ� : " + ������.�������ڼ�);
			for(int i=1;i<4;i++) {
				try {
					Thread.sleep(500);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				if(ü�����ϻ��.ü�����Ͽ���==true || ��Ұ�����ġ������.��Ұ�����ġ���忣��==true || ����������.��������������==true) {break;} //��ü ���������

				������.������ += 5;
				if(������.������>=100) {
					������.������=100;
					System.out.println("�谡 �ҷ� ���̻� ���ڸ� �����ʾƵ� �� �Ͱ����ϴ�.");
				} 
				System.out.println("���ڸ� �Ծ� �谡 ���� �ҷ��ɴϴ� ������+5  ���� ������ : " + ������.������);
			}

		}
	}

}
