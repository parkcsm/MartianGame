package FifthWeek;

public class 화성의외계공동체 extends 장소 implements Runnable {
	
	
	static boolean 외계와의통신=false;
	static boolean 외계로신호보내기 =false;
    
	static String 메시지저장="";
 
	
	String 지속메시지1 = "353447"+"\n";
	String 지속메시지2 = "9188777"+"\n";
	String 지속메시지3 = "158776"+"\n";
	String 지속메시지4 = "758895"+"\n";
	
	
	String 지속메시지5 = "구조선이 올 수 있도록 우리가 도와주겠다. 우리가 알려준 항로를타고 구조선이 빠르게 도착할 것이다."+"\n";
;
	


			public void run() {
		int 통신기기메시지송출 = 0;

		while(true) {

			try {
				Thread.sleep(3000);  //120초에한번
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			if(시간.일시정지==true) {
				break;
			}
			if(체력저하사망.체력저하엔딩==true || 산소공급장치고장사망.산소공급장치고장엔딩==true || 구조선도착.구조선도착엔딩==true) {break;} //전체 쓰레드멈춤

			if(생존자.생존일수>=0 && 생존자.생존일수<30) {
				통신기기메시지송출 = (int)(Math.random()*(5-1))+1;
			}

		
		    if(주지구화성개척본부.지구와외계통신장비연결==true) {
		    	통신기기메시지송출=5;
		    	try {
					Thread.sleep(5000);  
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
		    	System.out.println("외계문명이 도움을 받아 구조선이 빠르게 이동하고 있습니다. 현재 구조선이오기까지 : " + 생존자.구조선이오기까지);
		        생존자.구조선이오기까지 -= (int)(Math.random()*(20-15))+15;;
		        if(생존자.구조선이오기까지<0) {
		        	생존자.구조선이오기까지=0;
		        }
		    }

			
	
		
	
			
     
			if(통신기기메시지송출==1) {
				메시지저장 += 지속메시지1;
				지속메시지1 = "";
			}
            
			if(통신기기메시지송출==2) {
				메시지저장 += 지속메시지2;
				지속메시지2 = "";

			}
			if(통신기기메시지송출==3) {
				메시지저장 += 지속메시지3;
				지속메시지3 = "";

			}
			if(통신기기메시지송출==4) {
				메시지저장 += 지속메시지4;
				지속메시지4 = "";
			}
			if(통신기기메시지송출==5) {
				메시지저장 += 지속메시지5;
				지속메시지5 = "";
			}
	
	
			

		}

			}}
