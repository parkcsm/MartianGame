package FifthWeek;

public class 산소공급장치고장사망  extends 엔딩 implements Runnable{
	
	  static boolean 산소공급장치고장엔딩=false;
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
			if(화성탐사기지.산소공급장치현재수리도<=0) {
				화성탐사기지.산소공급장치현재수리도=0;
				산소공급장치고장엔딩 = true;
				System.out.println("산소공급장치가 완전히고장나서 생존자가 사망하였습니다.");
				시간.일시정지=true;
				break;
			}
			
		}
	  }

		
	}