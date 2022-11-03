package P532;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num = sc.nextFloat();
		float num2 = sc.nextFloat();
		sc.close();

//		System.out.println(num);

		if (num >= 4.0 && num2 >= 4.0) { // && 두개 모두 "참"일 경우에만 "참"으로 출력됨
			System.out.println("A"); // 둘 중 하나라도 거짓이라면 거짓 다음으로 넘어감
		} else if (num >= 3.0 && num2 >= 3.0) {
			System.out.println("B");
		} else
			System.out.println("C");
		{
		}
	}

}
