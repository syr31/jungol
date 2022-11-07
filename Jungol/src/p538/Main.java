package p538;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

//		System.out.println(num);

		for (;;) {
			System.out.print("numder? ");
			int num = sc.nextInt();
			if (0 < num) {      //양수
				System.out.println("positive integer");
			} else if (num < 0) { // 음수
				System.out.println("negative number");
			} else {
				sc.close();
				break;
			}
		}
	}
}
