package FifthWeek;

public class 감자자랄때변화 extends 기타지속변화 implements Runnable {

	static int 심은감자수;
	static int 다자란감자수;
	static int 심은감자수의자란정도;
	static double 물거름주기로인한자라는정도증가=0.6;
	
	static double 감자흉년시랜덤= ((int)(Math.random()*(3-2))+2);
	static double 감자평타시랜덤= ((int)(Math.random()*(7-5))+5);
	static double 감자풍년시랜덤= ((int)(Math.random()*(10-9))+9);
	

	
	public void run() {
	
		while(true) {

			try {
				Thread.sleep(50);
			} catch(InterruptedException e) {
				e.printStackTrace();
			} 
			
			if(시간.일시정지==true) {
				break;
			}
			
			
			
			 if(체력저하사망.체력저하엔딩==true || 산소공급장치고장사망.산소공급장치고장엔딩==true || 구조선도착.구조선도착엔딩==true) {
					break;
				}
			 
			if(물거름주기로인한자라는정도증가>1) {
				물거름주기로인한자라는정도증가 = 1;
			}
			
			if(심은감자수==0) {
				심은감자수의자란정도=0;
			}
			if(심은감자수>0) {
			if(Math.random()<=물거름주기로인한자라는정도증가) {
				심은감자수의자란정도++;
			}}
			
		
			
			
			if(심은감자수의자란정도>=100) {
				if(물거름주기로인한자라는정도증가>=0.7) {
				다자란감자수 += 심은감자수*감자풍년시랜덤;
				}
				if(물거름주기로인한자라는정도증가>=0.4 && 물거름주기로인한자라는정도증가<0.7 ) {
					다자란감자수 += 심은감자수*감자평타시랜덤;
					}
				if(물거름주기로인한자라는정도증가>=0 && 물거름주기로인한자라는정도증가<0.4) {
					다자란감자수 += 심은감자수*감자흉년시랜덤;
					}
				
			    심은감자수의자란정도=0;
			     
			}

			}
	
			
		}
			
	

}

