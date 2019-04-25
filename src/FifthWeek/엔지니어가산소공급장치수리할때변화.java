package FifthWeek;

public class 엔지니어가산소공급장치수리할때변화 extends 수리할때변화  implements Runnable{
	public void run() {
		
	    
		if(생존자.체력<20) {
			System.out.println("몸에 힘이 없습니다. 현재체력이 20미만이기 때문에 행동을 취할 수 없습니다.");
		} else {
			if(생존자.체내수분<=19) {
				System.out.println("목이마릅니다. 체내수분이 20미만이기 때문에 행동을 취할 수 없습니다.");
				System.out.println("행동하기 위해선 물을 마셔주세요!");
			} else {
				if(생존자.포만감<=19) {
					System.out.println("배가고픕니다. 포만감이 20미만이기 때문에 행동을 취할 수 없습니다.");
					System.out.println("행동하기 위해선 감자를 먹어주세요!");
				} else { 
					for(int i=1;i<3;i++) {
						try {
							Thread.sleep(500);
						} catch(InterruptedException e) {
							e.printStackTrace();
						}
						if(체력저하사망.체력저하엔딩==true || 산소공급장치고장사망.산소공급장치고장엔딩==true || 구조선도착.구조선도착엔딩==true) {break;} //전체 쓰레드멈춤
						if(생존자.체력<=0) {
							break;
						}
						생존자.체력 -= 2; 생존자.집중도 -= 2; 생존자.포만감 -=1; 생존자.체내수분 -=1;
						if(생존자.체력<0) {
							생존자.체력=0;
						}
						if(생존자.집중도<0) {
							생존자.집중도=0;
						}
						if(생존자.포만감<0) {
							생존자.포만감=0;
						}
						if(생존자.체내수분<0) {
							생존자.체내수분=0;
						}




						System.out.println("고된 수리일로 피곤해집니다.(체력 -2, 집중도-2, 포만감-1, 체내수분-1)" + " 현재체력 : " + 생존자.체력 + " 현재집중도 : " + 생존자.집중도 + " 현재포만감 : " +생존자.포만감 + " 현재체내수분 : " + 생존자.체내수분);
					} 			 


					try {
						Thread.sleep(2000);
					} catch(InterruptedException e) {
						e.printStackTrace();
					}

					if(생존자.체력>0) {
						if(Math.random()<=엔지니어.수리성공확률){
							try {
								Thread.sleep(1000);
							} catch(InterruptedException e) {
								e.printStackTrace();
							}
							엔지니어.수리능력각성도++; 
							if(엔지니어.수리능력각성도>=60) {
								엔지니어.수리능력각성발휘 = true;
							}

					
							if(엔지니어.수리능력각성발휘 ==true) {
								엔지니어.수리능력=3;
								엔지니어.엔지니어수리고유확률 = 0.3;
								엔지니어.칭호 = "숙련된 엔지니어";
								엔지니어.수리능력각성 ="각성 완료";
						
							
							}
							화성탐사기지.산소공급장치현재수리도 += 엔지니어.수리능력; 
							if(화성탐사기지.산소공급장치현재수리도 >=100) {
								화성탐사기지.산소공급장치현재수리도 = 100;  
							}
							
							
							배경음악 성공= new 배경음악("성공.mp3",false);
							성공.start();
							System.out.println("산소공급장치 수리 성공!"+ " 현재산소공급장치수리도: " + 화성탐사기지.산소공급장치현재수리도);

						} else {
							
							배경음악 실패= new 배경음악("실패.mp3",false);
							실패.start();

							System.out.println("산소공급장치 수리 실패!" +" 현재산소공급장치수리도: " + 화성탐사기지.산소공급장치현재수리도);
						}
					}
				}
			}

		}
	}
}
