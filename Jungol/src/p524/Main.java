package p524;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		if (n1 != 0 && n2 != 0) {          // 논리곱은 &&          & = 비트연산자
			System.out.print("true");			//true * true 
		} else {
			System.out.print("false");
		}
		System.out.print(" ");

		if (n1 != 0 || n2 != 0) {           // 논리합은 ||
			System.out.print("true");
		} else {
			System.out.print("false");

		}
	}
}