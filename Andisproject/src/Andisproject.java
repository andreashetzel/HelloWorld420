
public class Andisproject {
     
   	 public static int counter =0;
    		public static void main(String[] args) {
    			
    			testRow(1000);
    			sub(10,5);
    			
    			  
    			  
    			
    			}
    			
    			public static boolean testSingleNumber(int n){
    				 boolean prim = true;
    				 int i = 2;
    				 
    				  if(n == 1) {
    	    			    prim = false;
    	    			  }
    	    			  
    	    			  else{
    	    			    while (i <= n-1 && prim == true) {
    	    			    	 if (n%i==0) {
    	    	    			        prim = false;
    	    	    			      }
    	    	    			      
    	    	    			      i = i+1;
    	    	    			    }
    	    	    			  }
    	    	    			 
    				 
    				 
    				 if(prim){ausgabePrim(n);}
    				 
    				 return prim;
    			}
    			
    			public static void ausgabePrim(int n){
    			 
    			System.out.print(n+"");
    			counter++;
    			if(counter%20==0){
    				System.out.println();
    			}
    			}
    		public static void testRow(int threshold){
			for(int i = 2; i<=threshold; i++){
				testSingleNumber(i);
            }
    		}

    		public static int sub(int x, int y){
    			ausgabePrim(x/y);
    		return x+y;
    			
    	}
}