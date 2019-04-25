package FifthWeek;

public class 시간 implements Runnable{

	static boolean 일시정지=false;
	String 오전오후= "am";
	int 시=0;
	int 분=0;
	static String 현재시간;
	public 시간() {
		this.시 = 시;
		this.분 = 분;
		this.오전오후 = "am";
		this.시 = 일시정지값저장.재개할시;
		this.분 = 일시정지값저장.재개할분;
		this.오전오후 = 일시정지값저장.재개할오전오후;
	}


	public void run(){
		while(true) {

			if(오전오후=="am") {
				for(int i = 시;i<12;i++, 시++) {
		     	분=0;
					for(int j =분;j<60;j++, 분++) {
						
						if(0<=분 && 분<=9) {
							현재시간 = 시+":"+0+ 분 + 오전오후;
						} else {
							현재시간 = 시+":"+ 분+ 오전오후;
						}
						try {
							Thread.sleep(10);
						} catch(InterruptedException e) {
							e.printStackTrace();
						} 
						if(일시정지==true) {
							일시정지값저장.재개할시=i; 일시정지값저장.재개할분=j; 일시정지값저장.재개할오전오후 ="am";
							break;
						}
						if(체력저하사망.체력저하엔딩==true || 산소공급장치고장사망.산소공급장치고장엔딩==true || 구조선도착.구조선도착엔딩==true) {
							break;
						}
					}
					try {
						Thread.sleep(100);
					} catch(InterruptedException e) {
						e.printStackTrace();
					} 
					
					if(일시정지==true) {
						break;
					}
					
					if(체력저하사망.체력저하엔딩==true || 산소공급장치고장사망.산소공급장치고장엔딩==true || 구조선도착.구조선도착엔딩==true) {
						break;
					}
					
				} 
			} 
			
			if(일시정지==true) {
				break;
			}
			
			if(체력저하사망.체력저하엔딩==true || 산소공급장치고장사망.산소공급장치고장엔딩==true || 구조선도착.구조선도착엔딩==true) {
				break;
			}
			
			오전오후 ="pm";
			if(오전오후=="pm") {
				for(int i = 시;i<24;i++, 시++) {
					분=0;
					for(int j =분;j<60;j++, 분++) {
						if(0<=분 && 분<=9) {
							현재시간 = 시+":"+0+ 분 + 오전오후;
						} else {
							현재시간 = 시+":"+ 분+ 오전오후;
						}
						try {
							Thread.sleep(10);
						} catch(InterruptedException e) {
							e.printStackTrace();
						} 
						if(일시정지==true) {
							일시정지값저장.재개할시=i; 일시정지값저장.재개할분=j; 일시정지값저장.재개할오전오후 ="pm";
							break;
						}
						if(체력저하사망.체력저하엔딩==true || 산소공급장치고장사망.산소공급장치고장엔딩==true || 구조선도착.구조선도착엔딩==true) {
							break;
						}
					}
					try {
						Thread.sleep(100);
					} catch(InterruptedException e) {
						e.printStackTrace();
					} 
					
					if(일시정지==true) {
						break;
					}
					
					if(체력저하사망.체력저하엔딩==true || 산소공급장치고장사망.산소공급장치고장엔딩==true || 구조선도착.구조선도착엔딩==true) {
						break;
					}

				}
			
			}
			
			if(일시정지==true) {
				break;
			}
			if(체력저하사망.체력저하엔딩==true || 산소공급장치고장사망.산소공급장치고장엔딩==true || 구조선도착.구조선도착엔딩==true) {
				break;
			}
			
			시 = 0; 분=0; 오전오후 ="am";
			생존자.생존일수++;
		}
	} 
}
