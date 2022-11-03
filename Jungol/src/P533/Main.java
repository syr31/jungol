package P533;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0); // char 하나면 똑 띄어낸다. ex) 'M' , 'G'
		int age = sc.nextInt();
		sc.close();

		if (c == 'M') {
			if (age >= 18) {
				System.out.println("MAN");
			} else {
				System.out.println("BOY");
			}
		} else {
			if (age >= 18) {
				System.out.println("WOMEN");
			} else {
				System.out.println("GIRL");
			}

		}

	}

}
