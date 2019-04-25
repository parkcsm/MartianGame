package FifthWeek;

public class 생명유지할때지속변화  extends 변화 implements Runnable{

	@Override
	public void run() {
		while(true) {

			if(체력저하사망.체력저하엔딩==true || 산소공급장치고장사망.산소공급장치고장엔딩==true || 구조선도착.구조선도착엔딩==true) {break;} //쓰레드 멈춤

				try {
					Thread.sleep(2500);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				
				if(시간.일시정지==true) {
					break;
				}
				
				if(체력저하사망.체력저하엔딩==true || 산소공급장치고장사망.산소공급장치고장엔딩==true || 구조선도착.구조선도착엔딩==true) {break;} //쓰레드 멈춤
				
				생존자.포만감-=2; 생존자.체내수분-=2; 생존자.집중도--;
				
				if(생존자.체력<0) {
					생존자.체력=0;
				}
				if(생존자.포만감<0) {
					생존자.포만감=0;
				}
				if(생존자.체내수분<0) {
					생존자.체내수분=0;
				}
				if(생존자.집중도<0) {
					생존자.집중도=0;
				}
				System.out.println("기본생체활동 (포만감-2, 체내수분-2, 집중도-1)" + " 현재 포만감 : " + 생존자.포만감 + " 현재 체내수분 : " + 생존자.체내수분 + " 현재 집중도 : " + 생존자.집중도);
			
				if(체력저하사망.체력저하엔딩==true || 산소공급장치고장사망.산소공급장치고장엔딩==true || 구조선도착.구조선도착엔딩==true) {break;} //쓰레드 멈춤
			
			
			
	
	
		

		}

	}

}
