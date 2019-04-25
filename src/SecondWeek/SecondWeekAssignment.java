package SecondWeek;

import java.util.Random;

public class SecondWeekAssignment {	
	                                                              // Sub-routine(Function) // line -> Start(7) ~ End(25)
	public static int dayremain(String date) {
        int output = 9999;
		if (date == "Friday") {
			output = 6;
	    } else if (date == "Saterday") {
	    	output = 5;
	    } else if (date =="Sunday")  {
	    	output = 4;
	    } else if (date =="Monday")  {
	    	output = 3;
	    } else if (date =="Tuesday")  {
	    	output = 2;
	    } else if (date =="Wednesday")  {
	    	output = 1;
	    } else if (date =="Thursday")  {
	    	output = 0;
	    } 
		return output;
	}	
	                                                              // Main-routine // line -> Start(30) ~ End100)
	
	

	public static void main(String[] args) {
		int result = dayremain("Friday");
		
        String grammer1, grammer2;
		
        if (result <= 1) { 	
        	grammer1 = "day";
        }else {   	
        	grammer1 = "days";  
        }
        
        if (result <= 1) { 	
        	grammer2 = "s";
        }else {   	
        	grammer2 = "";  
        }
		  System.out.println("Until next class " + result + " " + grammer1 + " remain" + grammer2 + "\n"); 
		
		  
		                                                           
		  
		  
		double Randomvalue = Math.random();
		int ConcentrationValue = (int)(Randomvalue*100)+1;
		int sleeptime = (int)(Randomvalue*(23-20))+20;
	    int getuptime = (int)(Randomvalue*(11-4))+4;
	    Random random = new Random();
	    boolean Doyouwannaexercise = random.nextBoolean();
	    int todayminuteofexerciseplank = (int)(Randomvalue*(6-0))+0;;
	    
	    System.out.println("\n" + "- First Status -");
	    System.out.println("Remain " + grammer1 + " to next team nova class : " + result + " " + grammer1);
	    System.out.println("Yesterday sleep time : " + sleeptime +":00"); 
	    System.out.println("Today get-up time : " + getuptime +":00");
	    
	    if (sleeptime<=21 && sleeptime>=20 && getuptime>=4 && getuptime<=6 & result>=3) {
	    	System.out.println("-> Today's first schedule is to learn foreign language"); 
	    	System.out.println("\n" + "- Second Status -");
	    	System.out.println("Concentration Level : " + ConcentrationValue + "% (1~100%)"); 
	    	if (ConcentrationValue <=70 || Doyouwannaexercise) {
	    		System.out.println("You are distracted! Do exercise");
	    		if (todayminuteofexerciseplank<=5 & Doyouwannaexercise) {
	    			System.out.println("What exercise? : Do Plank for 1 minute");
	    		} else {
	    			System.out.println("What exercise? : Do Squirt or Stretching then!");
	    		}
	    	} else {
	    		System.out.println("You are so concentrated! Keep Studying");
	    	  }
	    } else {
	    	System.out.println("-> Today's first schedule is to learn coding");
	    	System.out.println("\n" + "- Second Status -");
	    	System.out.println("Concentration Level : " + ConcentrationValue + "% (1~100%)"); 
	    	if (ConcentrationValue <=70 || Doyouwannaexercise) {
	    		System.out.println("You are distracted! Do exercise");
	    		if (todayminuteofexerciseplank<=5 & Doyouwannaexercise) {
	    			System.out.println("What exercise? : Do Plank for 1 minute");
	    		} else {
	    			System.out.println("What exercise? : Do Squirt or Stretching then!");
	    		}
		    } else {
	    	    	System.out.println("You are so concentrated! Keep Studying");
	    	   }
	    } 
	    
	    
	    System.out.println(Math.random());
	    System.out.println(Math.random());
	    System.out.println(Math.random());
	    System.out.println(Randomvalue);
	    System.out.println(Randomvalue);
	    System.out.println(Randomvalue);

	    
	}

}
