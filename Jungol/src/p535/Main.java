package p535;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double inp =sc.nextDouble();
		sc.close();
		
//		System.out.println();
		
		if (inp<=4.0) {
			System.out.println("scholarship");
		}	else if (inp<=3.0) {
				System.out.println("next semester");
		}	else if (inp<=3.0) {
					System.out.println("seasonal semester");
			} else {  
					System.out.println("retake"​);
			}
		}

//		switch ((int)inp) {
//		case 4:
//			System.out.println("scholarship");
//		break;
//		case 4:
//			System.out.println("next semester");
//		break;
//		case 4:
//			System.out.println("seasonal semester");
//		break;
//		default:
//			System.out.println("retake");
//			
		
			