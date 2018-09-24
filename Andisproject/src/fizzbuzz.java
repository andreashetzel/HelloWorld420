
public class fizzbuzz {

	public static void main(String[] args) {
		
		for(int i= 1; i<1000; i++) {

			System.out.print("Zahl: "+i);
			
			if ( i % 3 == 0){
				System.out.print(" FIZZ");
			}
				
			if ( i % 5 == 0){
				System.out.print(" BUZZ");		
			}
			
		System.out.println("");
			
		}	
			
	}

}