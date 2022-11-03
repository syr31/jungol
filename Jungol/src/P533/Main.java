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

//남자는 'M' 여자는 'F'로 나타내기로 하고 18세 이상을 성인이라고 하자.
//
//
//성별('M', 'F')과 나이를 입력받아 "MAN"(성인남자), "WOMAN"(성인여자), "BOY"(미성년남자), "GIRL"(미성년여자)을 구분하여 출력하는 프로그램을 작성하시오.
