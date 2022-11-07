package q521;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();                   // 두개의 정수를 입력받기 위한 Scanner
		int j = sc.nextInt();					//
		sc.close();
//		System.out.println(i + " " + j);

		int sum = i++ * --j;					// 첫번째 "i"는 후치 증가 연산자
												// 두번째 "j"는 전치 감소 연산자
												// 이 두가지를 곱해서 sum에 저장
		System.out.println(i + " " + j + " " + sum);
		}			    //"i"값 + 공백 + "j"값 + 공백 +  답	
}
