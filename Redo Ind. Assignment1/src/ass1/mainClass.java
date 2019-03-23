package ass1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class mainClass {
	static Scanner scan = new Scanner(System.in);
	static int [] actorTest = new int [3];
	static int [] usecaseTest = new int [3];
	static int UUCP =0;
	static int [] tecfactorTest = new int [13];
	static double TCF;
	static double SzUC;
	static double EF;
	static double UCP;
	static int [] expfactorTest = new int [8];
	static int [] reportTest = new int [3];
	public static void main(String[] args) {
		System.out.println("Software Effort Estimatation Calculator");
		try {
		// Calculator for Weighting Actors for Complexity //
		display.displayActor();
		System.out.println("Please input the quantity of simple: ");
		actorTest[0] = scan.nextInt();
		System.out.println("Please input the quantity of average: ");
		actorTest[1] = scan.nextInt();
		System.out.println("Please input the quantity of complex: ");
		actorTest[2] = scan.nextInt();
		new actor(actorTest[0],actorTest[1],actorTest[2]);
		System.out.println("Total Actor Points: " + actor.gettotalactor());
		
		// Calculator for Weighting Use Case //
		display.displayUseCase();
		System.out.println("Please input the quantity of simple: ");
		usecaseTest[0] = scan.nextInt();
		System.out.println("Please input the quantity of average: ");
		usecaseTest[1] = scan.nextInt();
		System.out.println("Please input the quantity of complex: ");
		usecaseTest[2] = scan.nextInt();
		new useCase(usecaseTest[0],usecaseTest[1],usecaseTest[2]);
		System.out.println("Total Use Case: " + useCase.gettotalUseCase());
		System.out.println("Total UUCP: " + useCasePoint.getUUCP());
		
		// Calculator for Weighting Technical Factors //
		display.displayTechnicalFactor();
		new technicalFactor(tecfactorTest[0],tecfactorTest[1],tecfactorTest[2],tecfactorTest[3],tecfactorTest[4],tecfactorTest[5],tecfactorTest[6],tecfactorTest[7],
				tecfactorTest[8],tecfactorTest[9],tecfactorTest[10],tecfactorTest[11],tecfactorTest[12]);
		System.out.println("");
		System.out.printf("Total Technical Factor: %.2f%n",technicalFactor.getTechFactor());
		TCF = (0.01*technicalFactor.getTechFactor())+0.6;
		System.out.printf("Technical Complexity Factor: %.2f%n",TCF);
		SzUC = useCasePoint.getUUCP() * TCF;
		System.out.printf("The Size of the software: %.2f%n", SzUC);
		
		// Calculator for Weighting Technical Factors //
		display.displayExperienceFactor();
		new experienceFactor(expfactorTest[0],expfactorTest[1],expfactorTest[2],expfactorTest[3],expfactorTest[4],expfactorTest[5],expfactorTest[6],expfactorTest[7]);
		System.out.println("");
		System.out.printf("Total Experience Factor: %.2f%n" ,experienceFactor.getexpFactor());
		EF = ((-0.03)*experienceFactor.getexpFactor()) + 1.4;
		System.out.printf("Experience factor (EF): %.2f%n" , EF);
		UCP = SzUC * EF;
		System.out.printf("Uce Case Points(UCP): %.2f%n", UCP);
		
		// Calculator for Man Hours //
		display.displayManHours();
		new manHours();
		System.out.printf("Total Man-Hours: %.2f%n" , manHours.gettotalManHours());
		
		// Calculator for Adjusted Man-Hours //
		display.displayAdjustedmanHours();
		new adjustManHours();
		System.out.printf("Total Adjusted Man-Hours: %.2f%n" , adjustManHours.getadjustManHours());
		
		// Calculator for Weighting Reports for Complexity //
		display.displayWeightingReport();
		new weightingReport(reportTest[0],reportTest[1],reportTest[2]);
		System.out.println("");
		System.out.println("Total Report: " + weightingReport.gettotalReport());
		System.out.printf("Total Man-Hours for Report: %.2f%n" , weightingReport.gettotalManHoursReport());
		
		} catch (InputMismatchException ex) {
            System.out.println("INPUT INTEGER ONLY !!");
        }
		
	}
}
