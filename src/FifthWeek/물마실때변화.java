package FifthWeek;

public class 물마실때변화  extends 먹거나마실때변화 implements Runnable {


	public void run() {
		if(생존자.남은물리터<=0) {
			System.out.println("물이없습니다.");
		} else {
		생존자.남은물리터--;
		if(생존자.남은물리터<0) {
			생존자.남은물리터=0;
		}
		System.out.println("현재남은물(L)-1L" + " 현재남은물(L) : " + 생존자.남은물리터);
		
		for(int i=1;i<4;i++) {
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			생존자.체내수분 += 5;
			if(생존자.체내수분>=100) {
				생존자.체내수분=100;
				System.out.println("물을 충분히 마셔 더이상 물을 마시지 않아도 될 것같습니다.");
			}
			System.out.println("물을 마셔 갈증이 점점해소됩니다. 체내수분+5  현재체내수분 :" + 생존자.체내수분);
		}
		
	}
	}

}
