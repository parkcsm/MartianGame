package FifthWeek;

public class 잠잘때숙면도변화 extends 잠잘때혹은잠자고변화 implements Runnable {

	boolean 문;
	boolean 문2;
	@Override
	public void run() {
		while(true) {
			
			

         
			
			try {
				Thread.sleep(300);
			} catch(InterruptedException e) {
				e.printStackTrace();
			} 
			
	
             if(잠잘때혹은잠자고변화.잠자기끊기==true) {break;} //쓰레드끊기
   				if(체력저하사망.체력저하엔딩==true || 산소공급장치고장사망.산소공급장치고장엔딩==true || 구조선도착.구조선도착엔딩==true) {break;} //전체 쓰레드멈춤
                   
				생존자.숙면도 += 2; 
				if(생존자.숙면도>=100) {
					생존자.숙면도 = 100;
					if(문) {
						System.out.println("숙면도 +2 숙면도가 100에 다다랐습니다. 현재숙면도: " + 생존자.숙면도 );
					} 문 =false;
					
				}
				if(생존자.숙면도<10) {
				System.out.println("숙면도 +2 현재숙면도 : " + 생존자.숙면도  + "                          현재체력 : " + 생존자.체력 + " 현재집중도 : " + 생존자.집중도);
				}
	
				
				if(생존자.숙면도>=10 && 생존자.숙면도<100) {
			     System.out.println("숙면도 +2 현재숙면도 : " + 생존자.숙면도  + "                         현재체력 : " + 생존자.체력 + " 현재집중도 : " + 생존자.집중도);
				}
				
				
				if(생존자.숙면도==100) {
				     System.out.println("숙면도 +2 현재숙면도 : " + 생존자.숙면도  + "                        현재체력 : " + 생존자.체력 + " 현재집중도 : " + 생존자.집중도);
				}
		

				
		}
	}
}

