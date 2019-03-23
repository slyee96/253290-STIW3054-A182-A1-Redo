package ass1;

public class display extends mainClass{
	public static void displayActor() {
		System.out.println("=============================================");
		System.out.println("\tWeighting Actors for Complexity\t");
		System.out.println("=============================================");
		System.out.println("Actory Type\tWeight Factor\tQuantity");
		System.out.println("  Simple\t      1");
		System.out.println(" Average\t      2");
		System.out.println(" Complex\t      3");
		System.out.println("");
	}
	public static void displayUseCase() {
		System.out.println("");
		System.out.println("=============================================");
		System.out.println("\t  Weighting Use Case\t");
		System.out.println("=============================================");
		System.out.println("Use Case Type\tDescription\tWeight Factor\tQuantity");
		System.out.println("  Simple\t3 or fewer     \t     5");
		System.out.println(" Average\t4 to 7         \t    10");
		System.out.println(" Complex\tGreater than 7 \t    10");
		System.out.println("");
	}
	public static void displayTechnicalFactor() {
		System.out.println("");
		System.out.println("====================================================================================================");
		System.out.println("\t\t\tWeighting Technical Factors (Project Rating from 0 until 5)\t\t");
		System.out.println("====================================================================================================");
		System.out.println("Technical Factor\t\tFactor Description\t\t\tWeight Factor\tProject Rating");
		System.out.println("\tT1\t\tMust have a distributed solution\t\t\t2");
		System.out.println("\tT2\t\tMust respond to specific performance objectives \t1");
		System.out.println("\tT3\t\tMust meet end-user efficiency desires \t\t\t1");
		System.out.println("\tT4\t\tComplex internal processing \t\t\t\t1");
		System.out.println("\tT5\t\tCode must be reusable       \t\t\t\t1");
		System.out.println("\tT6\t\tMust be easy to install     \t\t\t\t0.5");
		System.out.println("\tT7\t\tMust be easy to use         \t\t\t\t0.5");
		System.out.println("\tT8\t\tMust be portable            \t\t\t\t2");
		System.out.println("\tT9\t\tMust be easy to change      \t\t\t\t1");
		System.out.println("\tT10\t\tMust allow concurrent users\t\t\t\t1");
		System.out.println("\tT11\t\tIncludes special security features\t\t\t1");
		System.out.println("\tT12\t\tMust provide direct access for 3rd parties\t\t1");
		System.out.println("\tT13\t\tRequires special user training facilities \t\t1");
		System.out.println("");
    }
	public static void displayExperienceFactor() {
		System.out.println("");
		System.out.println("====================================================================================================");
		System.out.println("\t\t\tWeighting Experience Factors (Project Rating from 0 until 5)\t\t");
		System.out.println("====================================================================================================");
		System.out.println("Experience Factor\t\tFactor Description\t\t   Weight Factor\tProject Rating");
		System.out.println("\tE1\t\tFamiliar with FPT software process\t\t1");
		System.out.println("\tE2\t\tApplicatiom experience            \t\t0.5");
		System.out.println("\tE3\t\tParadigm experience               \t\t1");
		System.out.println("\tE4\t\tLead analyst capability           \t\t0.5");
		System.out.println("\tE5\t\tMotivation                        \t\t0");
		System.out.println("\tE6\t\tStable Requirements               \t\t2");
		System.out.println("\tE7\t\tPart-time workers                 \t\t-1");
		System.out.println("\tE8\t\tDifficulty of programming language\t\t-1");
		System.out.println("");
	}
	public static void displayManHours() {
		System.out.println("");
		System.out.println("============================================");
		System.out.println("\tCalculating Man-hours from UCP\t");
		System.out.println("============================================");
	}
	
	public static void displayAdjustedmanHours() {
		System.out.println("");
		System.out.println("============================================");
		System.out.println("\tAdjusting Man-hours For Risk\t");
		System.out.println("============================================");
	}
	
	public static void displayWeightingReport() {
		System.out.println("");
		System.out.println("=============================================");
		System.out.println("\tWeighting Reports for Complexity\t");
		System.out.println("=============================================");
		System.out.println("Report Type\tAverage Man-hours\tQuantity");
		System.out.println("  Simple           \t12");
		System.out.println(" Average           \t20");
		System.out.println(" Complex           \t40");
		System.out.println("");
	}
}
