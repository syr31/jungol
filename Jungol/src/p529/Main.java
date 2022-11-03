package p529;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num2 = sc.nextInt();      // 키 정수를 담을 변수 선언
		int num3 = sc.nextInt();      // 몸무게 정수를 담을 변수 선언
		sc.close();
		
		System.out.println(num3+100-num2); // +100을 더하고 비만수치 출력
//		System.out.println(num3);
		
		if (0<num3+100-num2) {
			System.out.println("Obesity");  // 0보다 수치가 크니 출력
			
//			“몸무게+100-키”를 비만수치 공식이라고 하자.
//			키와 몸무게를 자연수로 입력받아 첫 번째 줄에 비만수치를 출력하고, 비만수치가 0보다 크면 다음줄에 비만("Obesity")이라는 메시지를 출력하는 프로그램을 작성하시오. (출력형식은 아래 출력 예를 참고하세요.)

		}
	}
}
   
