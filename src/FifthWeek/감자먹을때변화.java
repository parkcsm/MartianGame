package FifthWeek;

public class 감자먹을때변화 extends 먹거나마실때변화 implements Runnable{

	@Override
	public void run() {

		if(생존자.남은감자수<=0) {
			System.out.println("감자가 없습니다.");
		}else {

			생존자.남은감자수--;
			if(생존자.남은감자수<0) {
				생존자.남은감자수=0;
			}
			System.out.println("감자수-1"+" 현재남은감자수 : " + 생존자.남은감자수);
			for(int i=1;i<4;i++) {
				try {
					Thread.sleep(500);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				if(체력저하사망.체력저하엔딩==true || 산소공급장치고장사망.산소공급장치고장엔딩==true || 구조선도착.구조선도착엔딩==true) {break;} //전체 쓰레드멈춤

				생존자.포만감 += 5;
				if(생존자.포만감>=100) {
					생존자.포만감=100;
					System.out.println("배가 불러 더이상 감자를 먹지않아도 될 것같습니다.");
				} 
				System.out.println("감자를 먹어 배가 점점 불러옵니다 포만감+5  현재 포만감 : " + 생존자.포만감);
			}

		}
	}

}
