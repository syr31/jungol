package q555;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] s = new String[10];
		Scanner sc = new Scanner(System.in);
		
		
			
		for(int i = 0; i<=s.length; i++)	{ //  문자를 넣어주는 것		input
			String c = sc.next();
			s[i] = c;
		}									// 반복문이 끝나고
			sc.close();						// sc.close	로 닫는다.	
		for (int i = 0; i <=s.length; i++)  //	배열에 있는 것을 순서대로 출력하려면 반복문이 필요하다. out		
		System.out.print(s[i]);
	
//		for(int i = 0; i<=s.length; i++) {
//			System.out.print();
		}
		

	
}

