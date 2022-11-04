package p632;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sc.close();

//		System.out.println(num);
		
//		int min = (num1 > num2) ? ((num2 > num3) ? num3 : num2) : ((num1>num3)) ? num3 : num1);    // 다시 공부*
		
		if (num1 > num2) {
			if (num2 > num3) {
				System.out.println(num3);
			} else {
				System.out.println(num2);
			}
		} else {
			if (num1 > num3) {
				System.out.println(num3);
			} else {
				System.out.println(num1);
			}
		}
	}
}
//3개의 정수를 입력받아 조건연산자를 이용하여 입력받은 수들 중 최소값을 출력하는 프로그램을 작성하시오.  (다시 풀어보기)**