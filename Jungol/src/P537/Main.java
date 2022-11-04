package P537;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

//	System.out.println(inp);
//		int sum = 0;
//		for (int i = 1; i <= inp; i++) {
//			sum += i;
//	}
////			System.out.print(sum); // 출력을 {} 쪽으로 빼야한다.
//	}
//}

//	int sum1 = 0, j=1; 
//	while(j<=inp) {	
//	sum1 += j++;
//	}
//	System.out.println(sum1);
//}
//	}
		int sum2 = 0, k = 1;
		do {
			sum2 += k++;
		}while(k <= inp);
	}
}
