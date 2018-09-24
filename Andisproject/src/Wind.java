public class Wind {
	
	static double kmh = 50;

	public static void main(String args[]){
	
		System.out.println(getKnots(kmh));
		
	}
	
	
	public static double getKnots(double kmh){
		
		return kmh*0.54;
	}
	
	
}
