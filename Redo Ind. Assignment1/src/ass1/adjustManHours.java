package ass1;
import java.util.Scanner;
public class adjustManHours extends mainClass{
	private static double coef;
	private static double totalAdjustedManHours=0; 
	Scanner scan = new Scanner(System.in);
	public adjustManHours() {
	System.out.println("Please input coefficient as a percentage, eg 0.05 like 5%: ");
	coef = scan.nextDouble();
	totalAdjustedManHours = (1.0+coef) * manHours.gettotalManHours();
	}
	
	public static double getadjustManHours() {
		return totalAdjustedManHours;
	}
}
