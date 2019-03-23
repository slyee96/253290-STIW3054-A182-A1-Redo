package ass1;

public class actor extends useCasePoint{
	private static int [] actor = new int [3];
	private static int totalactor = 0;
	
	public actor (int simplex, int average, int complex) {
		actor[0]= simplex;
		actor[1]= average;
		actor[2]= complex;
		
	}
	
	public static int gettotalactor() {
		totalactor = (1*actor[0] + 2*actor[1] + 3*actor[2]);
		return totalactor;
	}
}
