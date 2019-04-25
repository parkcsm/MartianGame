package FifthWeek;

public class 잠잘때수치변화 extends 잠잘때혹은잠자고변화 {
	public void run() {
		while(true) {
		
			if(생존자.숙면도>=10 && 생존자.숙면도<30) {
				try {
					Thread.sleep(500);
				} catch(InterruptedException e) {
					e.printStackTrace();
				} 
				

				if(잠잘때혹은잠자고변화.잠자기끊기==true) {break;}
				if(체력저하사망.체력저하엔딩==true || 산소공급장치고장사망.산소공급장치고장엔딩==true || 구조선도착.구조선도착엔딩==true) {break;} //전체 쓰레드멈춤
				if(Math.random()<난이도및랜덤.자는동안이득일확률숙면도10이상30미만) {
					생존자.체력 +=2; 생존자.집중도 +=6; 
					if(생존자.체력>100) {
						생존자.체력=100;
					}
					if(생존자.집중도>100) {
						생존자.집중도=100;
					}
					System.out.println("긴장이 조금 풀려 몸과 정신이 아주 조금 회복되었습니다.");
				}
			}
			if(생존자.숙면도>=30 && 생존자.숙면도<50 ) {
				try {
					Thread.sleep(2000);
				} catch(InterruptedException e) {
					e.printStackTrace();
				} 
				
			
				if(잠잘때혹은잠자고변화.잠자기끊기==true) {break;}
				if(체력저하사망.체력저하엔딩==true || 산소공급장치고장사망.산소공급장치고장엔딩==true || 구조선도착.구조선도착엔딩==true) {break;} //전체 쓰레드멈춤
				if(Math.random()<난이도및랜덤.자는동안이득일확률숙면도30이상50미만) {
					생존자.체력 +=3; 생존자.집중도 +=9; 
					if(생존자.체력>100) {
						생존자.체력=100;
					}
					if(생존자.집중도>100) {
						생존자.집중도=100;
					}
					System.out.println("긴장이 많이 풀려 몸과 정신이 조금씩 회복됩니다.");
				}
			}
			if(생존자.숙면도>=50 && 생존자.숙면도<100 ) {
				try {
					Thread.sleep(2000);
				} catch(InterruptedException e) {
					e.printStackTrace();
				} 
				
		
				if(잠잘때혹은잠자고변화.잠자기끊기==true) {break;}
				if(체력저하사망.체력저하엔딩==true || 산소공급장치고장사망.산소공급장치고장엔딩==true || 구조선도착.구조선도착엔딩==true) {break;} //전체 쓰레드멈춤
				if(Math.random()<난이도및랜덤.자는동안이득일확률숙면도50이상100미만) {
					생존자.체력 +=5; 생존자.집중도 +=15; 
					if(생존자.체력>100) {
						생존자.체력=100;
					}
					if(생존자.집중도>100) {
						생존자.집중도=100;
					}
					System.out.println("깊은잠에 빠져 몸과 정신이 빠르게 회복되고있습니다.");
				}
			}  
			
			if(생존자.숙면도==100) {
				try {
					Thread.sleep(2000);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				
		
				if(잠잘때혹은잠자고변화.잠자기끊기==true) {break;}
				if(체력저하사망.체력저하엔딩==true || 산소공급장치고장사망.산소공급장치고장엔딩==true || 구조선도착.구조선도착엔딩==true) {break;} //전체 쓰레드멈춤
				if(Math.random()<난이도및랜덤.자는동안이득일확률숙면도100) {
					생존자.체력 +=10; 생존자.집중도 +=30; 
					if(생존자.체력>100) {
						생존자.체력=100;
					}
					if(생존자.집중도>100) {
						생존자.집중도=100;
					}
					System.out.println("매우 깊은잠에 빠져 몸과 정신이 아주 빠르게 회복되고있습니다.");

				}
			}      	

		}

	}
}

