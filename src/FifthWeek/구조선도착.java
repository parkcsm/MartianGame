package FifthWeek;

public class 구조선도착  extends 엔딩 implements Runnable {
	  static boolean 구조선도착엔딩=false;
	  public void run() {
		while(true) {
			 try {
				 Thread.sleep(50);
			 } catch(InterruptedException e) {
				 e.printStackTrace();
			 } 
				if(체력저하사망.체력저하엔딩==true || 산소공급장치고장사망.산소공급장치고장엔딩==true || 구조선도착.구조선도착엔딩==true) {break;} //전체 쓰레드멈춤

			if(생존자.구조선이오기까지==0) {
				구조선도착엔딩 = true;
				System.out.println("★구조선이 도착하여 생존자가 구조되었습니다. 이제 지구로 돌아갈 수 있습니다.★");
				시간.일시정지=true;
			
				break;		
			
			}
			
		}
	  }

		
	}