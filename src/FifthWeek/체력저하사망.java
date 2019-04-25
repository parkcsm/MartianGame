package FifthWeek;

public class 체력저하사망 extends 엔딩 implements Runnable{
	
  static boolean 체력저하엔딩;
  public void run() {
	while(true) {
		 try {
			 Thread.sleep(50);
		 } catch(InterruptedException e) {
			 e.printStackTrace();
		 }
		if(체력저하사망.체력저하엔딩==true || 산소공급장치고장사망.산소공급장치고장엔딩==true || 구조선도착.구조선도착엔딩==true) {
			break;
		}
		if(생존자.체력<=0) {
			체력저하엔딩 = true;
			시간.일시정지=true;
			System.out.println("생존자의 체력이 0이하가 되어 사망하였습니다.");
			break;
		}
		

	}
  }

	
}
