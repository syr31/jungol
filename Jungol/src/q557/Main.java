package q557;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String s[] = new String[10];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= s.length; i++) {
			String str = sc.next();
			s[i] = str;
		}
		sc.close();
		for (int i = 0; i <= s.length; i++) {
			System.out.printf("%c%c%c" , s[0], s[3], s[6]);
		}
	}
}