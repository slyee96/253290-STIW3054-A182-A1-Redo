package ass1;

import java.util.Scanner;

public class experienceFactor extends mainClass{
	private static int [] expfactor = new int [8];
	private static double totalexpfactor=0;
	Scanner scan = new Scanner(System.in);
	
	public experienceFactor(int expFactor1, int expFactor2, int expFactor3, int expFactor4, int expFactor5, int expFactor6, int expFactor7, int expFactor8){
		expfactor[0] = expFactor1;
		expfactor[1] = expFactor2;
		expfactor[2] = expFactor3;
		expfactor[3] = expFactor4;
		expfactor[4] = expFactor5;
		expfactor[5] = expFactor6;
		expfactor[6] = expFactor7;
		expfactor[7] = expFactor8;
		
		System.out.println("Input the Project Ratings from 0-5 only: ");
		System.out.println("Please input the Project Ratings of E1: ");
		expfactor[0] = scan.nextInt();
		do {
			if (expfactor[0]<0||expfactor[0]>5) {
				System.out.println("Error. Please input the Project Ratings of T1: ");
				expfactor[0] = scan.nextInt();
			}
		}while (expfactor[0]<0||expfactor[0]>5);
		
		System.out.println("Please input the Project Ratings of E2: ");
		expfactor[1] = scan.nextInt();
		do {
			if (expfactor[1]<0||expfactor[1]>5) {
				System.out.println("Error. Please input the Project Ratings of T1: ");
				expfactor[1] = scan.nextInt();
			}
		}while (expfactor[1]<0||expfactor[1]>5);
		
		System.out.println("Please input the Project Ratings of E3: ");
		expfactor[2] = scan.nextInt();
		do {
			if (expfactor[2]<0||expfactor[2]>5) {
				System.out.println("Error. Please input the Project Ratings of T1: ");
				expfactor[2] = scan.nextInt();
			}
		}while (expfactor[2]<0||expfactor[2]>5);
		
		System.out.println("Please input the Project Ratings of E4: ");
		expfactor[3] = scan.nextInt();
		do {
			if (expfactor[3]<0||expfactor[3]>5) {
				System.out.println("Error. Please input the Project Ratings of T1: ");
				expfactor[3] = scan.nextInt();
			}
		}while (expfactor[3]<0||expfactor[3]>5);
		
		System.out.println("Please input the Project Ratings of E5: ");
		expfactor[4] = scan.nextInt();
		do {
			if (expfactor[4]<0||expfactor[4]>5) {
				System.out.println("Error. Please input the Project Ratings of T1: ");
				expfactor[4] = scan.nextInt();
			}
		}while (expfactor[4]<0||expfactor[4]>5);
		
		System.out.println("Please input the Project Ratings of E6: ");
		expfactor[5] = scan.nextInt();
		do {
			if (expfactor[5]<0||expfactor[5]>5) {
				System.out.println("Error. Please input the Project Ratings of T1: ");
				expfactor[5] = scan.nextInt();
			}
		}while (expfactor[5]<0||expfactor[5]>5);
		
		System.out.println("Please input the Project Ratings of E7: ");
		expfactor[6] = scan.nextInt();
		do {
			if (expfactor[6]<0||expfactor[6]>5) {
				System.out.println("Error. Please input the Project Ratings of T1: ");
				expfactor[6] = scan.nextInt();
			}
		}while (expfactor[6]<0||expfactor[6]>5);
		
		System.out.println("Please input the Project Ratings of E8: ");
		expfactor[7] = scan.nextInt();
		do {
			if (expfactor[7]<0||expfactor[7]>5) {
				System.out.println("Error. Please input the Project Ratings of T1: ");
				expfactor[7] = scan.nextInt();
			}
		}while (expfactor[7]<0||expfactor[7]>5);
		
	}
	public static double getexpFactor(){
		totalexpfactor = 1*expfactor[0] + 0.5*expfactor[1] + 1*expfactor[2] + 0.5*expfactor[3] + 0*expfactor[4] + 2*expfactor[5] +
		(-1)*expfactor[6] + (-1)*expfactor[7];
		return totalexpfactor;
	}
}
