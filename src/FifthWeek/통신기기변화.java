package FifthWeek;

public class 통신기기변화 extends 기계지속변화 implements Runnable {

   static boolean 구조선위치확인; //구조선이오기까지 클래스에서 가림막역할
	public void run() {
		
		while(true) {
			
		
			try {
				Thread.sleep(2000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			if(시간.일시정지==true) {
				break;
			}
			
			 if(체력저하사망.체력저하엔딩==true || 산소공급장치고장사망.산소공급장치고장엔딩==true || 구조선도착.구조선도착엔딩==true) {break;} //쓰레드멈춤

			if(Math.random()<=난이도및랜덤.통신기기고장확률) {
				화성탐사기지.통신기기현재수리도--;
				System.out.println("화성의 모래먼지의 영향으로 통신기기가 -1 손상되었습니다. 구조선이 도착까지 얼마나 남았는지 알 수 없습니다." + "통신기기공급장치현재수리도 : " + 화성탐사기지.통신기기현재수리도);

			}

			if(화성탐사기지.통신기기현재수리도==100 && 생존자.통신기기수리활성화 ==true ) {
				구조선위치확인 = true;
			}
			
			if(화성탐사기지.통신기기현재수리도<100 && 생존자.통신기기수리활성화 ==true ) {
				구조선위치확인 = false;
			}
			
			
			
		}

	}

}
