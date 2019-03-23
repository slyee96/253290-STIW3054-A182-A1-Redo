package ass1;

public class useCase extends useCasePoint{
	private static int [] usecase = new int [3];
	private static int totalUseCase = 0;
	
	public useCase(int Simplex, int Average, int Complex) {
		usecase[0]= Simplex;
		usecase[1]= Average;
		usecase[2]= Complex;
		
	}
	public static int gettotalUseCase(){
		totalUseCase = 5*usecase[0] + 10*usecase[1] + 15*usecase[2];
		return totalUseCase;
	}
}
