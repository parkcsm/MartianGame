package FifthWeek;

public class 구조선이오기까지 extends 엔딩 implements Runnable{

	public void run() {
		while(true) {

			try {
				Thread.sleep(3000);
			} catch(InterruptedException e) {

				e.printStackTrace();
			} 
			
			if(시간.일시정지==true) {
				break;
			}
			

			if(체력저하사망.체력저하엔딩==true || 산소공급장치고장사망.산소공급장치고장엔딩==true || 구조선도착.구조선도착엔딩==true) {
				break;
			}

			if(생존자.통신기기수리활성화==true) {

				if(Math.random()<난이도및랜덤.구조선이헤맬확률) {
					생존자.구조선이오기까지++;
				}else{
					생존자.구조선이오기까지--;
				}
				
				
				
				if(통신기기변화.구조선위치확인==true) {
					System.out.println("구조선은 순항중 우주폭풍에 휩쌓일 수 있습니다. 따라서 구조선이 오는 날은 계속해서 변합니다." + "현재 구조선이오기까지 : " + 생존자.구조선이오기까지 +"일 남았습니다.");
				} 

				
				
				if(체력저하사망.체력저하엔딩==true || 산소공급장치고장사망.산소공급장치고장엔딩==true || 구조선도착.구조선도착엔딩==true) {
					break;
				}

			}
		}

	}

}
