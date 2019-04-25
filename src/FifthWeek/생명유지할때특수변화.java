package FifthWeek;

public class 생명유지할때특수변화 extends 생명유지할때지속변화 implements Runnable {
	public void run() {
		while(true) {
			if((생존자.포만감<=20 && 생존자.포만감>=0) || (생존자.체내수분<=20 && 생존자.체내수분>=0)) {
				System.out.println("포만감 또는 체내수분이 20이하가 되어 몸에 이상이 생겼습니다. 3초이내 해결하지 않을시 체력과 집중도가 계속해서 2초당 3씩 떨어집니다.");
				try {
					Thread.sleep(3000);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				
				if(시간.일시정지==true) {
					break;
				}
				
				while(((생존자.포만감<=20 && 생존자.포만감>=0) || (생존자.체내수분<=20 && 생존자.체내수분>=0)) && (체력저하사망.체력저하엔딩==false && 산소공급장치고장사망.산소공급장치고장엔딩==false &&구조선도착.구조선도착엔딩==false)) {
					생존자.체력 -= 3; 생존자.집중도 -= 3;
					if(생존자.체력<0) {
						생존자.체력=0;
					}
					if(생존자.집중도<0) {
						생존자.집중도=0;
					}
					배경음악 생체신호= new 배경음악("생체신호.mp3",false);
					생체신호.start();
					System.out.println("포만감과 체내수분을 20이상으로 유지해주세요. 체력과 집중도가 저하되고있습니다." +" 현재체력 : " + 생존자.체력 + " 현재집중도 : " + 생존자.집중도);
					try {
						Thread.sleep(2000);
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
					
					if(시간.일시정지==true) {
						break;
					}
					
				}

			}
			if(체력저하사망.체력저하엔딩==true || 산소공급장치고장사망.산소공급장치고장엔딩==true || 구조선도착.구조선도착엔딩==true) {break;}

		}
	}

}
