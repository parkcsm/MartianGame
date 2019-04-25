package FifthWeek;

public class 쉴때변화 extends 쉬거나잠잘때변화 implements Runnable{
	static boolean 쉬기끊기=false;
	public void run() {
		while(true) {		
				try {
					Thread.sleep(2500);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				
				if(쉬기끊기==true) {break;} // 쓰레드강제멈춤
				if(체력저하사망.체력저하엔딩==true || 산소공급장치고장사망.산소공급장치고장엔딩==true || 구조선도착.구조선도착엔딩==true) {break;} //전체 쓰레드멈춤
				if(Math.random()<=난이도및랜덤.쉬는동안이득일확률) {
					생존자.체력++; 생존자.집중도 +=3;	
					if(생존자.체력>=100) {
						생존자.체력 = 100;
					}
					if(생존자.집중도>=100) {
						생존자.집중도=100;
					}
					System.out.println("쉬는동안 몸이 편안해지며 조금 회복됩니다. 체력+1 현재체력 : " + 생존자.체력 + " 집중도+2 현재집중도 : " + 생존자.집중도);
					
					if(생존자.체력>=100) {
						System.out.println("체력이 완전히 회복되었습니다. 기분이 좋습니다.");
					}
					if(생존자.집중도>=100) {
						System.out.println("집중도가 완전히 회복되었습니다. 정신이 맑습니다.");
					}
				}

			
			
		}
	}
}
