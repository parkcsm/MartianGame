package FifthWeek;

public class 산소공급장치변화 extends 기계지속변화 implements Runnable {

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
			
			
			if(체력저하사망.체력저하엔딩==true || 산소공급장치고장사망.산소공급장치고장엔딩==true || 구조선도착.구조선도착엔딩==true) {break;} //쓰레드 멈춤
			
			if(Math.random()<=난이도및랜덤.산소공급장치고장확률) {
				화성탐사기지.산소공급장치현재수리도--;
				System.out.println("화성의 모래먼지의 영향으로 산소공급장치가 -1 손상되었습니다." + "산소공급장치현재수리도 : " + 화성탐사기지.산소공급장치현재수리도);
			}
		

		}



	}



}
