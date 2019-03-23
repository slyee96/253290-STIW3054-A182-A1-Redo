package ass1;
import java.util.Scanner;
public class technicalFactor extends mainClass{
    private static int [] tecfactor = new int[13];
    private static double totalTechFactor = 0;
    Scanner scan = new Scanner(System.in);
    public technicalFactor(int tecFactor1, int tecFactor2, int tecFactor3, int tecFactor4, int tecFactor5, 
                           int tecFactor6, int tecFactor7, int tecFactor8, int tecFactor9, int tecFactor10, 
                           int tecFactor11, int tecFactor12, int tecFactor13){
    	tecfactor[0] = tecFactor1;
    	tecfactor[1] = tecFactor2;
    	tecfactor[2] = tecFactor3;
    	tecfactor[3] = tecFactor4;
    	tecfactor[4] = tecFactor5;
        tecfactor[5] = tecFactor6;
        tecfactor[6] = tecFactor7;
        tecfactor[7] = tecFactor8;
        tecfactor[8] = tecFactor9;
        tecfactor[9] = tecFactor10;
        tecfactor[10] = tecFactor11;
        tecfactor[11] = tecFactor12;
        tecfactor[12] = tecFactor13;
        
        System.out.println("Input the Project Ratings from 0-5 only: ");
		System.out.println("Please input the Project Ratings of T1: ");
		tecfactor[0] = scan.nextInt();
		do {
			if (tecfactor[0]<0||tecfactor[0]>5) {
				System.out.println("Error. Please input the Project Ratings of T1: ");
				tecfactor[0] = scan.nextInt();
			}
		}while (tecfactor[0]<0||tecfactor[0]>5);
		
		System.out.println("Please input the Project Ratings of T2: ");
		tecfactor[1] = scan.nextInt();
		do {
			if (tecfactor[1]<0||tecfactor[1]>5) {
				System.out.println("Error. Please input the Project Ratings of T2: ");
				tecfactor[1] = scan.nextInt();
			}
		}while (tecfactor[1]<0||tecfactor[1]>5);
		
		System.out.println("Please input the Project Ratings of T3: ");
		tecfactor[2] = scan.nextInt();
		do {
			if (tecfactor[2]<0||tecfactor[2]>5) {
				System.out.println("Error. Please input the Project Ratings of T3: ");
                tecfactor[2] = scan.nextInt();
			}
		}while (tecfactor[2]<0||tecfactor[2]>5);
		
		System.out.println("Please input the Project Ratings of T4: ");
		tecfactor[3] = scan.nextInt();
		do {
			if (tecfactor[3]<0||tecfactor[3]>5) {
				System.out.println("Error. Please input the Project Ratings of T4: ");
                tecfactor[3] = scan.nextInt();
			}
		}while (tecfactor[3]<0||tecfactor[3]>5);
		
		System.out.println("Please input the Project Ratings of T5: ");
		tecfactor[4] = scan.nextInt();
		do {
			if (tecfactor[4]<0||tecfactor[4]>5) {
				System.out.println("Error. Please input the Project Ratings of T5: ");
                tecfactor[4] = scan.nextInt();
			}
		}while (tecfactor[4]<0||tecfactor[4]>5);
		
		System.out.println("Please input the Project Ratings of T6: ");
		tecfactor[5] = scan.nextInt();
		do {
			if (tecfactor[5]<0||tecfactor[5]>5) {
				System.out.println("Error. Please input the Project Ratings of T6: ");
                tecfactor[5] = scan.nextInt();
			}
		}while (tecfactor[5]<0||tecfactor[5]>5);
		
		System.out.println("Please input the Project Ratings of T7: ");
		tecfactor[6] = scan.nextInt();
		do {
			if (tecfactor[6]<0||tecfactor[6]>5) {
				System.out.println("Error. Please input the Project Ratings of T7: ");
                tecfactor[6] = scan.nextInt();
			}
		}while (tecfactor[6]<0||tecfactor[6]>5);
		
		System.out.println("Please input the Project Ratings of T8: ");
		tecfactor[7] = scan.nextInt();
		do {
			if (tecfactor[7]<0||tecfactor[7]>5) {
				System.out.println("Error. Please input the Project Ratings of T8: ");
                tecfactor[7] = scan.nextInt();
			}
		}while (tecfactor[7]<0||tecfactor[7]>5);
		
		System.out.println("Please input the Project Ratings of T9: ");
		tecfactor[8] = scan.nextInt();
		do {
			if (tecfactor[8]<0||tecfactor[8]>5) {
				System.out.println("Error. Please input the Project Ratings of T9: ");
                tecfactor[8] = scan.nextInt();
			}
		}while (tecfactor[8]<0||tecfactor[8]>5);
		
		System.out.println("Please input the Project Ratings of T10: ");
		tecfactor[9] = scan.nextInt();
		do {
			if (tecfactor[9]<0||tecfactor[9]>5) {
				System.out.println("Error. Please input the Project Ratings of T10: ");
                tecfactor[9] = scan.nextInt();
			}
		}while (tecfactor[9]<0||tecfactor[9]>5);
		
		System.out.println("Please input the Project Ratings of T11: ");
		tecfactor[10] = scan.nextInt();
		do {
			if (tecfactor[10]<0||tecfactor[10]>5) {
				System.out.println("Error. Please input the Project Ratings of T11: ");
                tecfactor[10] = scan.nextInt();
			}
		}while (tecfactor[10]<0||tecfactor[10]>5);
		
		System.out.println("Please input the Project Ratings of T12: ");
		tecfactor[11] = scan.nextInt();
		do {
			if (tecfactor[11]<0||tecfactor[11]>5) {
				System.out.println("Error. Please input the Project Ratings of T12: ");
                tecfactor[11] = scan.nextInt();
			}
		}while (tecfactor[11]<0||tecfactor[11]>5);
		
		System.out.println("Please input the Project Ratings of T13: ");
		tecfactor[12] = scan.nextInt();
		do {
			if (tecfactor[12]<0||tecfactor[12]>5) {
				System.out.println("Error. Please input the Project Ratings of T13: ");
                tecfactor[12] = scan.nextInt();
			}
		}while (tecfactor[12]<0||tecfactor[12]>5);
    }
    
        public static double getTechFactor(){	
            totalTechFactor = 2*tecfactor[0]+ 1*tecfactor[1]+ 1*tecfactor[2]+ 1*tecfactor[3] + 1*tecfactor[4] + 0.5*tecfactor[5] + 0.5*tecfactor[6]
            		+ 2*tecfactor[7] + 1*tecfactor[8]+ 1*tecfactor[9] + 1*tecfactor[10] + 1*tecfactor[11] + 1*tecfactor[12];
            return totalTechFactor;
    }
        
}
