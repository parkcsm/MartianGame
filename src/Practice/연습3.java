package Practice;

public class ����3 implements Runnable {


	String name;
	
	public ����3(String name) {
		System.out.println (name +"�����尡 �����Ǿ����ϴ�.");
		this.name = name;
	}
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+ "(" + name + ")" );
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {e.printStackTrace();
				
			}
		}
		
	}

}
