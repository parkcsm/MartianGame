package Practice;

public class ����1 extends Thread{
   
	String ampm;
	int time;
	int randomminute = ((int)(Math.random()*(60-0))+0);
	int fixedrandomminute;
    String ����ð�;
     
	
     public ����1(int time,String ampm) {
    	 this.time = time;
    	 this.ampm = ampm;
     }


     public void run(){
    	 while(true) {
    		 for(int time = 0;time<13;time++) {
    			 int randomminute = ((int)(Math.random()*(60-0))+0);
    			 fixedrandomminute = randomminute;
    			 if(0<=fixedrandomminute && fixedrandomminute<=9) {
    				 System.out.println(time+":"+0+ fixedrandomminute + ampm);
    				 ����ð� = time+":"+0+ fixedrandomminute + ampm;
    			 } else {
    				 System.out.println(time+":"+ fixedrandomminute+ ampm);
    				 ����ð� = time+":"+ fixedrandomminute+ ampm;
    			 }

    			 try {
    				 sleep(500);
    			 } catch(InterruptedException e) {
    				 e.printStackTrace();
    			 }if(time==12) {
    				 ampm = "pm";
    				 for(int time1 = 1;time1<13;time1++) {
    					 int randomminute1 = ((int)(Math.random()*(60-0))+0);
    					 fixedrandomminute = randomminute1;
    					 if(0<=fixedrandomminute && fixedrandomminute<=9) {
    						 System.out.println(time1+":"+0+ fixedrandomminute + ampm);
    						 ����ð� = time1+":"+0+ fixedrandomminute + ampm;
    					 } else {
    						 System.out.println(time1+":"+ fixedrandomminute+ ampm);
    						 ����ð� = time1+":"+ fixedrandomminute+ ampm;
    					 }
    					 if(time1==12) {
    						 ampm = "am";
    					 }
    					 try {
    						 sleep(500);
    					 } catch(InterruptedException e) {
    						 e.printStackTrace();
    					 }
    				 }
    			 }
    		 }
    	 }
     } 
}
