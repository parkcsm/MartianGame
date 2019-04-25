package ThirdWeek;

public class Sudoku {

	public static void main(String[] args) {
	    int Sudokunum = 4;
	    int length = Sudokunum+1;
        String Sudoku[][] = new String[length][length];   
        int Sudokuint[][] = new int[length][length];
        String Screenout[] = new String[length];
    
        
        
        for(int i= 1;i<length;i++) {
        	for (int j = 1;j<length;j++) {
        		  Sudokuint[i][j]= ((int)(Math.random()*(length-1))+1);	
        		  	   
            }
        }
   
        
       
        
    for(int m = 1; m<5;m++) {
        
        for(int i= 1;i<length;i++) {
        	for (int j = 1;j<length;j++) {
        		
        		for(int k =1; k<j;k++) {
        		if(Sudokuint[i][j]==Sudokuint[i][k]) {
        			 Sudokuint[i][j]= ((int)(Math.random()*(length-1))+1);	j--; 
        			 }
        		}  	  	   
            }   
        }      
        

 	   for(int j= 1;j<length;j++) {
          	for (int i = 1;i<length;i++) {
          		for(int k =1; k<i;k++) {
          		if(Sudokuint[i][j]==Sudokuint[k][j]) {
          			 Sudokuint[i][j]= ((int)(Math.random()*(length-1))+1);	i--; 
          			 }
         
          		}
          	  	   
              }
          
          } 
    }
    
 
        
        
     
        
        
     
        
   
        
        
           
     
        	    	
       
        for(int i= 1;i<length;i++) {
        	for (int j = 1;j<length;j++) {
        		
        		Sudoku[i][j]=String.valueOf(Sudokuint[i][j]);		
        	}
        }
        	
        
        for(int p = Sudokunum ; p>0 ;p--) {
          Screenout[p] = "";
          for(int q = 1; q<Sudokunum+1 ;q++) {
           Screenout[p] += "|" + Sudoku[q][p] ;
          }
        }
        
        for(int p =Sudokunum; p>0 ;p--) {
        System.out.println(Screenout[p]);
       
        }

      
	}
}