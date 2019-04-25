package Practice;

public class 연습3 implements Runnable {


	String name;
	
	public 연습3(String name) {
		System.out.println (name +"스레드가 생성되었습니다.");
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
