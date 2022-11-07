package q593;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = 0; // 정수값 초기화 "do 밖에서 선언해줘야함"

		do {
			System.out.println("ASCII CODE =? ");
			inp = sc.nextInt();

			if (inp < 33 || inp > 127) { // 33부터 127까지 숫자에서 벗어나면 빠져나감
				break;					 // 먼저 빠져나가는 것 작성 (inp < 33 || inp > 127)
			}
			System.out.printf("%c%n", inp); // %c = 캐릭터 값으로 표현
											// char 값은 아스키코드로 음수 즉 - 값을 표현할 수 없다.
		} while (33 <= inp && inp <= 127); // 33부터 127까지 숫자를 입력받으면 계속 리셋
		sc.close();

	}
}
