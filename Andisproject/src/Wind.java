public class Wind {
	
	static double kmh = 50;

	public static void main(String args[]){
	
		System.out.println(getKnots(kmh));
		System.out.println(getBeaufort(kmh));
	}
	
	
	public static double getKnots(double kmh){
		
		return kmh*0.54;
	}
	
	
	public static double getBeaufort(double kmh){
	
		return Math.round(Math.pow((kmh/3.6)/0.836,0.67));
	}
}
