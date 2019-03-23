package ass1;

import java.util.Scanner;

public class weightingReport extends mainClass{
	private static int [] report = new int [3];
	private static double totalReport=0;
	private static double totalManHoursREPORT =0;
	Scanner scan = new Scanner(System.in);
	
	public weightingReport(int reportTest1,int reportTest2, int reportTest3) {
		report[0] = reportTest1;
		report[1] = reportTest2;
		report[2] = reportTest3;
		
		System.out.println("Please input the quantity of simple: ");
		report[0] = scan.nextInt();
		System.out.println("Please input the quantity of average: ");
		report[1] = scan.nextInt();
		System.out.println("Please input the quantity of complex: ");
		report[2] = scan.nextInt();						
	}
	public static double gettotalReport() {
		totalReport = 12*report[0] + 20*report[1] + 40*report[2];
		return totalReport;
	}
	public static double gettotalManHoursReport() {
		totalManHoursREPORT = adjustManHours.getadjustManHours() + weightingReport.gettotalReport();
		return totalManHoursREPORT;
	}
}
