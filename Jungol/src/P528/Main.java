package P528;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //입력받을 scanner를 입력
		int inp = sc.nextInt();   // scanner 정수(변수 inp)에 넣어줌
		sc.close(); //scanner 닫기

		if (inp < 0) {
			System.out.println("minus");
		}

	}

}
