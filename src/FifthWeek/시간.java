package FifthWeek;

public class �ð� implements Runnable{

	static boolean �Ͻ�����=false;
	String ��������= "am";
	int ��=0;
	int ��=0;
	static String ����ð�;
	public �ð�() {
		this.�� = ��;
		this.�� = ��;
		this.�������� = "am";
		this.�� = �Ͻ�����������.�簳�ҽ�;
		this.�� = �Ͻ�����������.�簳�Һ�;
		this.�������� = �Ͻ�����������.�簳�ҿ�������;
	}


	public void run(){
		while(true) {

			if(��������=="am") {
				for(int i = ��;i<12;i++, ��++) {
		     	��=0;
					for(int j =��;j<60;j++, ��++) {
						
						if(0<=�� && ��<=9) {
							����ð� = ��+":"+0+ �� + ��������;
						} else {
							����ð� = ��+":"+ ��+ ��������;
						}
						try {
							Thread.sleep(10);
						} catch(InterruptedException e) {
							e.printStackTrace();
						} 
						if(�Ͻ�����==true) {
							�Ͻ�����������.�簳�ҽ�=i; �Ͻ�����������.�簳�Һ�=j; �Ͻ�����������.�簳�ҿ������� ="am";
							break;
						}
						if(ü�����ϻ��.ü�����Ͽ���==true || ��Ұ�����ġ������.��Ұ�����ġ���忣��==true || ����������.��������������==true) {
							break;
						}
					}
					try {
						Thread.sleep(100);
					} catch(InterruptedException e) {
						e.printStackTrace();
					} 
					
					if(�Ͻ�����==true) {
						break;
					}
					
					if(ü�����ϻ��.ü�����Ͽ���==true || ��Ұ�����ġ������.��Ұ�����ġ���忣��==true || ����������.��������������==true) {
						break;
					}
					
				} 
			} 
			
			if(�Ͻ�����==true) {
				break;
			}
			
			if(ü�����ϻ��.ü�����Ͽ���==true || ��Ұ�����ġ������.��Ұ�����ġ���忣��==true || ����������.��������������==true) {
				break;
			}
			
			�������� ="pm";
			if(��������=="pm") {
				for(int i = ��;i<24;i++, ��++) {
					��=0;
					for(int j =��;j<60;j++, ��++) {
						if(0<=�� && ��<=9) {
							����ð� = ��+":"+0+ �� + ��������;
						} else {
							����ð� = ��+":"+ ��+ ��������;
						}
						try {
							Thread.sleep(10);
						} catch(InterruptedException e) {
							e.printStackTrace();
						} 
						if(�Ͻ�����==true) {
							�Ͻ�����������.�簳�ҽ�=i; �Ͻ�����������.�簳�Һ�=j; �Ͻ�����������.�簳�ҿ������� ="pm";
							break;
						}
						if(ü�����ϻ��.ü�����Ͽ���==true || ��Ұ�����ġ������.��Ұ�����ġ���忣��==true || ����������.��������������==true) {
							break;
						}
					}
					try {
						Thread.sleep(100);
					} catch(InterruptedException e) {
						e.printStackTrace();
					} 
					
					if(�Ͻ�����==true) {
						break;
					}
					
					if(ü�����ϻ��.ü�����Ͽ���==true || ��Ұ�����ġ������.��Ұ�����ġ���忣��==true || ����������.��������������==true) {
						break;
					}

				}
			
			}
			
			if(�Ͻ�����==true) {
				break;
			}
			if(ü�����ϻ��.ü�����Ͽ���==true || ��Ұ�����ġ������.��Ұ�����ġ���忣��==true || ����������.��������������==true) {
				break;
			}
			
			�� = 0; ��=0; �������� ="am";
			������.�����ϼ�++;
		}
	} 
}
