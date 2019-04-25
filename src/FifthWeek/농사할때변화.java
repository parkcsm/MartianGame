package FifthWeek;

public class 농사할때변화  extends 일할때변화 implements Runnable{

	@Override
	public void run() {
	
		for(int i=1;i<4;i++) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			생존자.체력 -= 1; 생존자.포만감 -=1; 생존자.체내수분 -=1;
			System.out.println("농사로 인해 수치감소 체력 -1, 포만감-1, 체내수분-1");
		}
		
	}

}
