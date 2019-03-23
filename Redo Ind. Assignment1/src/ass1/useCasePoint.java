package ass1;

public class useCasePoint extends mainClass{
	private static int totalUUCP;
	
	public static int getUUCP() {
		totalUUCP = actor.gettotalactor() + useCase.gettotalUseCase();
		return totalUUCP;
	}
}
