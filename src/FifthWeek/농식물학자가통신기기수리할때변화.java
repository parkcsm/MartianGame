package FifthWeek;

public class 농식물학자가통신기기수리할때변화 extends 수리할때변화 implements Runnable {
	public void run() {
		if(생존자.체력<20) {
			System.out.println("몸에 힘이 없습니다. 현재체력이 20미만이기 때문에 행동을 취할 수 없습니다.");
		} else {
			if(생존자.체내수분<=19) {
				System.out.println("목이마릅니다. 체내수분이 20미만이기 때문에 행동을 취할 수 없습니다. 행동하기 위해선 물을 마셔주세요!");
			} else {
				if(생존자.포만감<=19) {
					System.out.println("배가고픕니다. 포만감이 20미만이기 때문에 행동을 취할 수 없습니다. 행동하기 위해선 감자를 먹어주세요!");
				} else { 
					for(int i=1;i<3;i++) {
						try {
							Thread.sleep(500);
						} catch(InterruptedException e) {
							e.printStackTrace();
						}
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
						if(Math.random()<=농식물학자.수리성공확률){
							try {
								Thread.sleep(1000);
							} catch(InterruptedException e) {
								e.printStackTrace();
							}
						
							화성탐사기지.통신기기현재수리도 += 농식물학자.수리능력; 
							
							
							
							
							if(생존자.통신기기수리활성화==false) {
							if(화성탐사기지.통신기기현재수리도 >=100) { 
								생존자.구조선이오기까지 = 생존자.생존일수;
								화성탐사기지.통신기기현재수리도 = 100; System.out.println("통신기기가 완벽히 수리되었습니다. 구조신호를 보냅니다. 구조일까지 " + 생존자.구조선이오기까지 + "일 남았습니다.");
								생존자.통신기기수리활성화 = true; 
							} 
							}
							
							if(화성탐사기지.통신기기현재수리도 >=100) { 
								화성탐사기지.통신기기현재수리도 = 100; 
							}
							배경음악 성공= new 배경음악("성공.mp3",false);
							성공.start();
							System.out.println("통신기기 수리 성공!"+ " 현재통신기기수리도: " + 화성탐사기지.통신기기현재수리도);


						} else {
							배경음악 실패= new 배경음악("실패.mp3",false);
							실패.start();
							System.out.println("통신기기 수리 실패!" +" 현재통신기기수리도: " + 화성탐사기지.통신기기현재수리도);
						}
					}
				}
			}
		}
	}

}
