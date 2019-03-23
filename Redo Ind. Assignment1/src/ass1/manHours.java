package ass1;
import java.util.Scanner;
public class manHours extends mainClass {
	private static double totalManHours = 0;
	private static int ER;
	Scanner scan = new Scanner(System.in);
	public manHours(){
		System.out.println("Please input Effort Rate(ER): ");
		ER = scan.nextInt();
		if (ER <=2) {
			totalManHours = 20 * UCP;
		}else {
			totalManHours = 28 * UCP;
			
		}
	}
	public static double gettotalManHours() {
		return totalManHours;
	}
}
