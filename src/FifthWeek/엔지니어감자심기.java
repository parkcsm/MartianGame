package FifthWeek;

public class 엔지니어감자심기 extends 엔지니어가농사할때변화 {
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
					if(감자자랄때변화.심은감자수의자란정도>30) { 
						System.out.println("감자가 이미자라고 있어 더이상 감자를 심을 수 없습니다. 감자가 다 자라날 때까지 기다리세요." +" 현재감자성장도 : "+  감자자랄때변화.심은감자수의자란정도+"현재심은감자수 : " +  감자자랄때변화.심은감자수 + " 현재다자란감자수 : " + 감자자랄때변화.다자란감자수);
//						System.out.println("현재심은감자수 : " +  감자자랄때변화.심은감자수 + " 현재다자란감자수 : " + 감자자랄때변화.다자란감자수);
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
						System.out.println("감자를 심는 작업을 시작합니다.고된 농삿일로 피곤해집니다.(체력 -2, 집중도-2, 포만감-1, 체내수분-1)" + " 현재체력 : " + 생존자.체력 + " 현재집중도 : " + 생존자.집중도 + " 현재포만감 : " +생존자.포만감 + " 현재체내수분 : " + 생존자.체내수분);
					}



					if(생존자.체력>0) {
						 if(감자자랄때변화.심은감자수의자란정도<30 && 감자자랄때변화.심은감자수의자란정도>=0) {
							if(Math.random()<=엔지니어.농사성공확률) {
								try {
									Thread.sleep(1000);
								} catch(InterruptedException e) {
									e.printStackTrace();
								} 
								배경음악 성공= new 배경음악("성공.mp3",false);
								성공.start();
								생존자.남은감자수--; 감자자랄때변화.심은감자수++;
								System.out.println("감자를 심는데 성공했습니다. 남은감자-1" + " 현재남은감자수 : " + 생존자.남은감자수 + " 심은감자 +1" +" 현재심은감자수 : " + 감자자랄때변화.심은감자수);														
								} else {
									배경음악 실패= new 배경음악("실패.mp3",false);
									실패.start();
									System.out.println("감자를 심는데 실패했습니다. 다시 시도해야합니다. 감자수의 변화는 없습니다." + " 현재남은감자수 : " + 생존자.남은감자수);		
								}





						}
					}
					}
				}
			}
		}




	}
}
