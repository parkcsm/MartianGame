package ThirdWeek;

public class Star {

	public static void main(String[] args) {
		int revisedlength = 15;
		int length = revisedlength+21 ;                               // Characteristic of Array : First Declaration is different from definition ex) new String[length][length] 
		String Room[][] = new String[length][length];   // Declaration -> String Room[][] = new String[length][length] *****
		String Screenout[] = new String[length];         // Definition in Max definition = Room[length-1 ] [length -1] *****     
		
		
	
		double DoubleCalculator;
		DoubleCalculator = (double)length;
		
		double degree60 = 75;
		double rad60 = Math.toRadians(degree60);
		double tan60 = Math.tan(rad60);
		
		double degree45 = 45;
		double rad45 = Math.toRadians(degree45);
		double tan45 = Math.tan(rad45);
		
		
		
		
		Double a,b,c,d,e,e1,e2,f,g,h,p,z;
		a = (double)2/3;
		b = (double)3/2;
		c = (double)1.8;
		d = (double)1/2;
		e = (double)1/8;
		e1 = (double)0.19;
		e2 = (double)0.21;
		f = (double)7/8;
		g = (double)5/4;
		h = (double)983/1000;
		p = (double)108/100;
		z = (double)1/100*DoubleCalculator;
		
		// { (1 && 2)
		//  && (3 || 5 }        
        //  ||  (4 && 3 && 5) 
		
		// ±ð±â
	

		
		for(int x= 0;  x < length; x++){
			for(int y= 0;  y < length; y++){
				if( 
						
						

						
						
						
						
				 ((( ((y<= f*f*f*f*f*h*f*f*f*h*h*b*b*g*(x+42*z)-p*e*e*e*e*p*DoubleCalculator-0*z) && (y<= -f*h*h*h*f*f*h*h*h*h*h*h*b*p*p*(x+22*z) + f*b*p*p*DoubleCalculator+4*z))  	&&      ((y>= -f*d*p*h*h*p*p*h*h*h*h*h*h*x  + DoubleCalculator*a*f*f*h*h*h*h*h*h*h*h*h*h*h*p*p*p+15*z) ||  (y >= f*f*d*f*f*g*g*g*(x+5*z)  + f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*h*h*h*h*h*h*h*h*h*h*h*h*h*h*h*h*h*h*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*DoubleCalculator+15*z))	||					( (y<= d*p*p*DoubleCalculator+11*z && y>= d*p*p*DoubleCalculator-5*z)  &&   (y>= -f*f*f*d*p*p*p*p*p*p*p*p*p*p*p*(x+75*z) + DoubleCalculator*a*p*f*f*h*h*h*h*h*h*h*h*h*h*h*p*p*p+70*z) ) &&   (y >= f*d*p*p*(x+5*z) + h*h*h*h*h*h*h*h*h*h*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*DoubleCalculator+15*z))	) 	&& 		 ((y>= -h*h*h*f*f*f*f*f*f*d*p*h*h*p*p*h*h*h*h*h*h*(x+3*z)  + DoubleCalculator*a*f*f*h*h*h*h*h*h*h*h*h*h*h*p*p*p+9*z) ||  (y >= f*h*h*h*h*h*h*h*h*f*f*h*h*f*f*f*f*f*d*f*f*g*g*g*(x-5*z)  + f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*h*h*h*h*h*h*h*h*h*h*h*h*h*h*h*h*h*h*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*DoubleCalculator+5*z))		) && ((y>e1*(x-82*z)+ 57*z) || (y>-e2*(x-79*z)+ 45*z) )		
					
						
			
			



			
			
			
						
						) { 
					                                  //rhombus : y<x+DoubleCalculator/2 && y> x-DoubleCalculator/2 && y<-x + 1.5*DoubleCalculator && y> -x + DoubleCalculator/2  (Possible -> 6<=length<=314)
					Room[x][y]= "o";                  //Star : ((( ((y<= f*f*f*f*f*h*f*f*f*h*h*b*b*g*(x+42*z)-p*e*e*e*e*p*DoubleCalculator-0*z) && (y<= -f*h*h*h*f*f*h*h*h*h*h*h*b*p*p*(x+22*z) + f*b*p*p*DoubleCalculator+4*z))  	&&      ((y>= -f*d*p*h*h*p*p*h*h*h*h*h*h*x  + DoubleCalculator*a*f*f*h*h*h*h*h*h*h*h*h*h*h*p*p*p+15*z) ||  (y >= f*f*d*f*f*g*g*g*(x+5*z)  + f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*h*h*h*h*h*h*h*h*h*h*h*h*h*h*h*h*h*h*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*DoubleCalculator+15*z))	||					( (y<= d*p*p*DoubleCalculator+11*z && y>= d*p*p*DoubleCalculator-5*z)  &&   (y>= -f*f*f*d*p*p*p*p*p*p*p*p*p*p*p*(x+75*z) + DoubleCalculator*a*p*f*f*h*h*h*h*h*h*h*h*h*h*h*p*p*p+70*z) ) &&   (y >= f*d*p*p*(x+5*z) + h*h*h*h*h*h*h*h*h*h*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*DoubleCalculator+15*z))	) 	&& 		 ((y>= -h*h*h*f*f*f*f*f*f*d*p*h*h*p*p*h*h*h*h*h*h*(x+3*z)  + DoubleCalculator*a*f*f*h*h*h*h*h*h*h*h*h*h*h*p*p*p+9*z) ||  (y >= f*h*h*h*h*h*h*h*h*f*f*h*h*f*f*f*f*f*d*f*f*g*g*g*(x-5*z)  + f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*h*h*h*h*h*h*h*h*h*h*h*h*h*h*h*h*h*h*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*f*DoubleCalculator+5*z))		) && ((y>e1*(x-82*z)+ 57*z) || (y>-e2*(x-79*z)+ 45*z) )		

					          
				} else {                              //Circle : Math.pow(x-Math.floor(DoubleCalculator/2), 2) + Math.pow(y-Math.floor(DoubleCalculator/2), 2) < Math.pow(Math.floor(DoubleCalculator/2), 2) (Possible - 8>= length<=313
					Room[x][y]= " ";                                   
				}	                                                      //Coordinate Plane Definition Sub-Routine
			}
		
		}
		
		for(int i=length-1; i>-1; i--) {    
			Screenout[i] = "";
			for(int j = 0; j<length; j++) {
			  Screenout[i] += Room[j][i];        //Coordinate Plane Print Sub-Routine(1) 
			}
	
		}
	
		for(int i = length-1; i>-1; i--) {      //Coordinate Plane Print Sub-Routine(2)
			System.out.println(Screenout[i]);	
		}
	}

}